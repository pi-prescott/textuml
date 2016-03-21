/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAccessCapabilityTail extends PAccessCapabilityTail
{
    private TComma _comma_;
    private PAccessCapability _accessCapability_;

    public AAccessCapabilityTail()
    {
        // Constructor
    }

    public AAccessCapabilityTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PAccessCapability _accessCapability_)
    {
        // Constructor
        setComma(_comma_);

        setAccessCapability(_accessCapability_);

    }

    @Override
    public Object clone()
    {
        return new AAccessCapabilityTail(
            cloneNode(this._comma_),
            cloneNode(this._accessCapability_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAccessCapabilityTail(this);
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

    public PAccessCapability getAccessCapability()
    {
        return this._accessCapability_;
    }

    public void setAccessCapability(PAccessCapability node)
    {
        if(this._accessCapability_ != null)
        {
            this._accessCapability_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._accessCapability_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._accessCapability_);
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

        if(this._accessCapability_ == child)
        {
            this._accessCapability_ = null;
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

        if(this._accessCapability_ == oldChild)
        {
            setAccessCapability((PAccessCapability) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
