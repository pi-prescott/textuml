/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ALogicalBinaryOperatorP1 extends PBinaryOperatorP1
{
    private PLogicalBinaryOperatorP1 _logicalBinaryOperatorP1_;

    public ALogicalBinaryOperatorP1()
    {
        // Constructor
    }

    public ALogicalBinaryOperatorP1(
        @SuppressWarnings("hiding") PLogicalBinaryOperatorP1 _logicalBinaryOperatorP1_)
    {
        // Constructor
        setLogicalBinaryOperatorP1(_logicalBinaryOperatorP1_);

    }

    @Override
    public Object clone()
    {
        return new ALogicalBinaryOperatorP1(
            cloneNode(this._logicalBinaryOperatorP1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalBinaryOperatorP1(this);
    }

    public PLogicalBinaryOperatorP1 getLogicalBinaryOperatorP1()
    {
        return this._logicalBinaryOperatorP1_;
    }

    public void setLogicalBinaryOperatorP1(PLogicalBinaryOperatorP1 node)
    {
        if(this._logicalBinaryOperatorP1_ != null)
        {
            this._logicalBinaryOperatorP1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalBinaryOperatorP1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicalBinaryOperatorP1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicalBinaryOperatorP1_ == child)
        {
            this._logicalBinaryOperatorP1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicalBinaryOperatorP1_ == oldChild)
        {
            setLogicalBinaryOperatorP1((PLogicalBinaryOperatorP1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
