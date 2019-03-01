/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ABinaryOpLevel4 extends PBinaryOpLevel4
{
    private TAnd _and_;

    public ABinaryOpLevel4()
    {
        // Constructor
    }

    public ABinaryOpLevel4(
        @SuppressWarnings("hiding") TAnd _and_)
    {
        // Constructor
        setAnd(_and_);

    }

    @Override
    public Object clone()
    {
        return new ABinaryOpLevel4(
            cloneNode(this._and_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinaryOpLevel4(this);
    }

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._and_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
