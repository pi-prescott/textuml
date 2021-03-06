/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ASelfIdentifierExpression extends PIdentifierExpression
{
    private TSelf _self_;

    public ASelfIdentifierExpression()
    {
        // Constructor
    }

    public ASelfIdentifierExpression(
        @SuppressWarnings("hiding") TSelf _self_)
    {
        // Constructor
        setSelf(_self_);

    }

    @Override
    public Object clone()
    {
        return new ASelfIdentifierExpression(
            cloneNode(this._self_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASelfIdentifierExpression(this);
    }

    public TSelf getSelf()
    {
        return this._self_;
    }

    public void setSelf(TSelf node)
    {
        if(this._self_ != null)
        {
            this._self_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._self_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._self_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._self_ == child)
        {
            this._self_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._self_ == oldChild)
        {
            setSelf((TSelf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
