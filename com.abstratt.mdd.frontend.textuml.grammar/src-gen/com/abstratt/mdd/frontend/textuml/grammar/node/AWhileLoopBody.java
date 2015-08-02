/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AWhileLoopBody extends PWhileLoopBody
{
    private PNonIfStatement _nonIfStatement_;

    public AWhileLoopBody()
    {
        // Constructor
    }

    public AWhileLoopBody(
        @SuppressWarnings("hiding") PNonIfStatement _nonIfStatement_)
    {
        // Constructor
        setNonIfStatement(_nonIfStatement_);

    }

    @Override
    public Object clone()
    {
        return new AWhileLoopBody(
            cloneNode(this._nonIfStatement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileLoopBody(this);
    }

    public PNonIfStatement getNonIfStatement()
    {
        return this._nonIfStatement_;
    }

    public void setNonIfStatement(PNonIfStatement node)
    {
        if(this._nonIfStatement_ != null)
        {
            this._nonIfStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nonIfStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nonIfStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nonIfStatement_ == child)
        {
            this._nonIfStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nonIfStatement_ == oldChild)
        {
            setNonIfStatement((PNonIfStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
