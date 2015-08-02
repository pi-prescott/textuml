/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAnnotations extends PAnnotations
{
    private TLBracket _lBracket_;
    private PAnnotationList _annotationList_;
    private TRBracket _rBracket_;

    public AAnnotations()
    {
        // Constructor
    }

    public AAnnotations(
        @SuppressWarnings("hiding") TLBracket _lBracket_,
        @SuppressWarnings("hiding") PAnnotationList _annotationList_,
        @SuppressWarnings("hiding") TRBracket _rBracket_)
    {
        // Constructor
        setLBracket(_lBracket_);

        setAnnotationList(_annotationList_);

        setRBracket(_rBracket_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotations(
            cloneNode(this._lBracket_),
            cloneNode(this._annotationList_),
            cloneNode(this._rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotations(this);
    }

    public TLBracket getLBracket()
    {
        return this._lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(this._lBracket_ != null)
        {
            this._lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBracket_ = node;
    }

    public PAnnotationList getAnnotationList()
    {
        return this._annotationList_;
    }

    public void setAnnotationList(PAnnotationList node)
    {
        if(this._annotationList_ != null)
        {
            this._annotationList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotationList_ = node;
    }

    public TRBracket getRBracket()
    {
        return this._rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(this._rBracket_ != null)
        {
            this._rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBracket_)
            + toString(this._annotationList_)
            + toString(this._rBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBracket_ == child)
        {
            this._lBracket_ = null;
            return;
        }

        if(this._annotationList_ == child)
        {
            this._annotationList_ = null;
            return;
        }

        if(this._rBracket_ == child)
        {
            this._rBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(this._annotationList_ == oldChild)
        {
            setAnnotationList((PAnnotationList) newChild);
            return;
        }

        if(this._rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}