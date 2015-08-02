/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ABehaviorStateBehaviorDefinition extends PStateBehaviorDefinition
{
    private PSimpleBlock _simpleBlock_;

    public ABehaviorStateBehaviorDefinition()
    {
        // Constructor
    }

    public ABehaviorStateBehaviorDefinition(
        @SuppressWarnings("hiding") PSimpleBlock _simpleBlock_)
    {
        // Constructor
        setSimpleBlock(_simpleBlock_);

    }

    @Override
    public Object clone()
    {
        return new ABehaviorStateBehaviorDefinition(
            cloneNode(this._simpleBlock_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABehaviorStateBehaviorDefinition(this);
    }

    public PSimpleBlock getSimpleBlock()
    {
        return this._simpleBlock_;
    }

    public void setSimpleBlock(PSimpleBlock node)
    {
        if(this._simpleBlock_ != null)
        {
            this._simpleBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleBlock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleBlock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleBlock_ == child)
        {
            this._simpleBlock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleBlock_ == oldChild)
        {
            setSimpleBlock((PSimpleBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
