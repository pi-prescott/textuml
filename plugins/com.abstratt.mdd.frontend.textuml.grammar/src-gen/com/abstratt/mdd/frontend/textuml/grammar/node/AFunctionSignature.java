/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionSignature extends PFunctionSignature
{
    private TLCurlyBracket _lCurlyBracket_;
    private PSimpleSignature _simpleSignature_;
    private TRCurlyBracket _rCurlyBracket_;

    public AFunctionSignature()
    {
        // Constructor
    }

    public AFunctionSignature(
        @SuppressWarnings("hiding") TLCurlyBracket _lCurlyBracket_,
        @SuppressWarnings("hiding") PSimpleSignature _simpleSignature_,
        @SuppressWarnings("hiding") TRCurlyBracket _rCurlyBracket_)
    {
        // Constructor
        setLCurlyBracket(_lCurlyBracket_);

        setSimpleSignature(_simpleSignature_);

        setRCurlyBracket(_rCurlyBracket_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionSignature(
            cloneNode(this._lCurlyBracket_),
            cloneNode(this._simpleSignature_),
            cloneNode(this._rCurlyBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionSignature(this);
    }

    public TLCurlyBracket getLCurlyBracket()
    {
        return this._lCurlyBracket_;
    }

    public void setLCurlyBracket(TLCurlyBracket node)
    {
        if(this._lCurlyBracket_ != null)
        {
            this._lCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lCurlyBracket_ = node;
    }

    public PSimpleSignature getSimpleSignature()
    {
        return this._simpleSignature_;
    }

    public void setSimpleSignature(PSimpleSignature node)
    {
        if(this._simpleSignature_ != null)
        {
            this._simpleSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleSignature_ = node;
    }

    public TRCurlyBracket getRCurlyBracket()
    {
        return this._rCurlyBracket_;
    }

    public void setRCurlyBracket(TRCurlyBracket node)
    {
        if(this._rCurlyBracket_ != null)
        {
            this._rCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rCurlyBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lCurlyBracket_)
            + toString(this._simpleSignature_)
            + toString(this._rCurlyBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lCurlyBracket_ == child)
        {
            this._lCurlyBracket_ = null;
            return;
        }

        if(this._simpleSignature_ == child)
        {
            this._simpleSignature_ = null;
            return;
        }

        if(this._rCurlyBracket_ == child)
        {
            this._rCurlyBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lCurlyBracket_ == oldChild)
        {
            setLCurlyBracket((TLCurlyBracket) newChild);
            return;
        }

        if(this._simpleSignature_ == oldChild)
        {
            setSimpleSignature((PSimpleSignature) newChild);
            return;
        }

        if(this._rCurlyBracket_ == oldChild)
        {
            setRCurlyBracket((TRCurlyBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
