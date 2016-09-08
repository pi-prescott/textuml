/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAlt3ExpressionP1 extends PExpressionP1
{
    private PExpressionP0 _expressionP0_;

    public AAlt3ExpressionP1()
    {
        // Constructor
    }

    public AAlt3ExpressionP1(
        @SuppressWarnings("hiding") PExpressionP0 _expressionP0_)
    {
        // Constructor
        setExpressionP0(_expressionP0_);

    }

    @Override
    public Object clone()
    {
        return new AAlt3ExpressionP1(
            cloneNode(this._expressionP0_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlt3ExpressionP1(this);
    }

    public PExpressionP0 getExpressionP0()
    {
        return this._expressionP0_;
    }

    public void setExpressionP0(PExpressionP0 node)
    {
        if(this._expressionP0_ != null)
        {
            this._expressionP0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressionP0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressionP0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressionP0_ == child)
        {
            this._expressionP0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressionP0_ == oldChild)
        {
            setExpressionP0((PExpressionP0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
