package com.abstratt.mdd.modelrenderer.uml2dot;

import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;

import com.abstratt.mdd.modelrenderer.dot.DOTRenderingUtils;
import com.abstratt.modelrenderer.IEObjectRenderer;
import com.abstratt.modelrenderer.IRenderingSession;
import com.abstratt.modelrenderer.IndentedPrintWriter;

public class VertexRenderer<V extends Vertex> implements IElementRenderer<V> {
    @Override
    public boolean renderObject(V element, IndentedPrintWriter out, IRenderingSession context) {
        renderState(element, out, context);
        renderTransitions(element, out, context);
        return true;
    }

    protected void renderState(V element, IndentedPrintWriter out, IRenderingSession session) {
        out.print('"' + getVertexSymbol(element) + "\" [");
        out.println("shape = \"Mrecord\"");
        out.println("style = \"rounded\"");
        renderLabel(element, out, session);
        out.println("];");
    }

    protected void renderLabel(V element, IndentedPrintWriter out, IRenderingSession session) {
        out.println("label = \"" + getVertexLabel(element) + "\"");
    }

    protected String getVertexSymbol(V element) {
        return element.getName();
    }

    protected String getVertexLabel(V element) {
        return element.getName();
    }
    
    private void renderTransitions(V element, IndentedPrintWriter out, IRenderingSession context) {
        Vertex source = element;
        
        element.getOutgoings().forEach((Transition transition) -> {
            Vertex target = transition.getTarget();
            boolean mutual = target.getOutgoings().stream().anyMatch(it -> it.getTarget() == source);
            boolean constraint = mutual || (target instanceof Pseudostate);
            transition.getTriggers().forEach((Trigger trigger) -> {
                String triggerLabel = getEventName(trigger.getEvent());
                renderTransition(source, target, out, constraint, triggerLabel);
            });
            
            if (transition.getTriggers().isEmpty()) {
                renderTransition(source, target, out, constraint, "");
            }
        });
    }

    private void renderTransition(Vertex source, Vertex target, IndentedPrintWriter out, boolean constraint, String transitionLabel) {
        out.print("\"" + source.getName() + "\":out -- " + "\"" + target.getName()
                + "\":in "); 
        out.println("[");
        out.enterLevel();
        DOTRenderingUtils.addAttribute(out, "label", transitionLabel);
        DOTRenderingUtils.addAttribute(out, "constraint", "" + true);
        DOTRenderingUtils.addAttribute(out, "arrowhead", "open");
        DOTRenderingUtils.addAttribute(out, "arrowtail", "tail");
        DOTRenderingUtils.addAttribute(out, "style", "solid");
        out.exitLevel();
        out.println("]");
    }

    private String getEventName(Event event) {
        if (event instanceof CallEvent) {
            Operation operation = ((CallEvent) event).getOperation();
            return operation != null ? operation.getName() : "";
        }
        if (event instanceof SignalEvent) {
            Signal signal = ((SignalEvent) event).getSignal();
            return signal != null ? signal.getName() : "";
        }
        return event.eClass().getName();
    }
}
