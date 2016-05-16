/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AExpression extends PExpression
{
    private PExpressionP5 _expressionP5_;

    public AExpression()
    {
        // Constructor
    }

    public AExpression(
        @SuppressWarnings("hiding") PExpressionP5 _expressionP5_)
    {
        // Constructor
        setExpressionP5(_expressionP5_);

    }

    @Override
    public Object clone()
    {
        return new AExpression(
            cloneNode(this._expressionP5_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpression(this);
    }

    public PExpressionP5 getExpressionP5()
    {
        return this._expressionP5_;
    }

    public void setExpressionP5(PExpressionP5 node)
    {
        if(this._expressionP5_ != null)
        {
            this._expressionP5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressionP5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressionP5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressionP5_ == child)
        {
            this._expressionP5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressionP5_ == oldChild)
        {
            setExpressionP5((PExpressionP5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
