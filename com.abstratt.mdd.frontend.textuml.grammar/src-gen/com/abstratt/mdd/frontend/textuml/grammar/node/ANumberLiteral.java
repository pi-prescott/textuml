/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ANumberLiteral extends PLiteral
{
    private PNumber _number_;

    public ANumberLiteral()
    {
        // Constructor
    }

    public ANumberLiteral(
        @SuppressWarnings("hiding") PNumber _number_)
    {
        // Constructor
        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ANumberLiteral(
            cloneNode(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberLiteral(this);
    }

    public PNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(PNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._number_ == oldChild)
        {
            setNumber((PNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
