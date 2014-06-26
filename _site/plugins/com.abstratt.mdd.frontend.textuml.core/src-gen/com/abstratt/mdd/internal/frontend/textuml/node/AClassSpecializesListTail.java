/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AClassSpecializesListTail extends PClassSpecializesListTail
{
    private TComma _comma_;
    private PClassSpecializesItem _classSpecializesItem_;

    public AClassSpecializesListTail()
    {
        // Constructor
    }

    public AClassSpecializesListTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PClassSpecializesItem _classSpecializesItem_)
    {
        // Constructor
        setComma(_comma_);

        setClassSpecializesItem(_classSpecializesItem_);

    }

    @Override
    public Object clone()
    {
        return new AClassSpecializesListTail(
            cloneNode(this._comma_),
            cloneNode(this._classSpecializesItem_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassSpecializesListTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PClassSpecializesItem getClassSpecializesItem()
    {
        return this._classSpecializesItem_;
    }

    public void setClassSpecializesItem(PClassSpecializesItem node)
    {
        if(this._classSpecializesItem_ != null)
        {
            this._classSpecializesItem_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classSpecializesItem_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._classSpecializesItem_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._classSpecializesItem_ == child)
        {
            this._classSpecializesItem_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._classSpecializesItem_ == oldChild)
        {
            setClassSpecializesItem((PClassSpecializesItem) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}