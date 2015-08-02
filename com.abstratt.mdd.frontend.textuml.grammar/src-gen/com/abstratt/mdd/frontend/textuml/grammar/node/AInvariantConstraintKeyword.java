/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AInvariantConstraintKeyword extends PConstraintKeyword
{
    private TInvariant _invariant_;

    public AInvariantConstraintKeyword()
    {
        // Constructor
    }

    public AInvariantConstraintKeyword(
        @SuppressWarnings("hiding") TInvariant _invariant_)
    {
        // Constructor
        setInvariant(_invariant_);

    }

    @Override
    public Object clone()
    {
        return new AInvariantConstraintKeyword(
            cloneNode(this._invariant_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInvariantConstraintKeyword(this);
    }

    public TInvariant getInvariant()
    {
        return this._invariant_;
    }

    public void setInvariant(TInvariant node)
    {
        if(this._invariant_ != null)
        {
            this._invariant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._invariant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._invariant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._invariant_ == child)
        {
            this._invariant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._invariant_ == oldChild)
        {
            setInvariant((TInvariant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
