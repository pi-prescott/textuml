/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEnumerationDefHeader extends PEnumerationDefHeader
{
    private TEnumeration _enumeration_;
    private TIdentifier _identifier_;

    public AEnumerationDefHeader()
    {
        // Constructor
    }

    public AEnumerationDefHeader(
        @SuppressWarnings("hiding") TEnumeration _enumeration_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setEnumeration(_enumeration_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AEnumerationDefHeader(
            cloneNode(this._enumeration_),
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumerationDefHeader(this);
    }

    public TEnumeration getEnumeration()
    {
        return this._enumeration_;
    }

    public void setEnumeration(TEnumeration node)
    {
        if(this._enumeration_ != null)
        {
            this._enumeration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enumeration_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enumeration_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enumeration_ == child)
        {
            this._enumeration_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enumeration_ == oldChild)
        {
            setEnumeration((TEnumeration) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}