/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AEnumerationClassType extends PClassType
{
    private TEnumeration _enumeration_;

    public AEnumerationClassType()
    {
        // Constructor
    }

    public AEnumerationClassType(
        @SuppressWarnings("hiding") TEnumeration _enumeration_)
    {
        // Constructor
        setEnumeration(_enumeration_);

    }

    @Override
    public Object clone()
    {
        return new AEnumerationClassType(
            cloneNode(this._enumeration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumerationClassType(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._enumeration_);
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

        throw new RuntimeException("Not a child.");
    }
}
