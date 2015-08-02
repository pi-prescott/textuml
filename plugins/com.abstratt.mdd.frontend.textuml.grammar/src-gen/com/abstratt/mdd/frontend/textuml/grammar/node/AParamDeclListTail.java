/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AParamDeclListTail extends PParamDeclListTail
{
    private TComma _comma_;
    private PParamDecl _paramDecl_;
    private PParamDeclListTail _paramDeclListTail_;

    public AParamDeclListTail()
    {
        // Constructor
    }

    public AParamDeclListTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PParamDecl _paramDecl_,
        @SuppressWarnings("hiding") PParamDeclListTail _paramDeclListTail_)
    {
        // Constructor
        setComma(_comma_);

        setParamDecl(_paramDecl_);

        setParamDeclListTail(_paramDeclListTail_);

    }

    @Override
    public Object clone()
    {
        return new AParamDeclListTail(
            cloneNode(this._comma_),
            cloneNode(this._paramDecl_),
            cloneNode(this._paramDeclListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamDeclListTail(this);
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

    public PParamDecl getParamDecl()
    {
        return this._paramDecl_;
    }

    public void setParamDecl(PParamDecl node)
    {
        if(this._paramDecl_ != null)
        {
            this._paramDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramDecl_ = node;
    }

    public PParamDeclListTail getParamDeclListTail()
    {
        return this._paramDeclListTail_;
    }

    public void setParamDeclListTail(PParamDeclListTail node)
    {
        if(this._paramDeclListTail_ != null)
        {
            this._paramDeclListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramDeclListTail_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._paramDecl_)
            + toString(this._paramDeclListTail_);
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

        if(this._paramDecl_ == child)
        {
            this._paramDecl_ = null;
            return;
        }

        if(this._paramDeclListTail_ == child)
        {
            this._paramDeclListTail_ = null;
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

        if(this._paramDecl_ == oldChild)
        {
            setParamDecl((PParamDecl) newChild);
            return;
        }

        if(this._paramDeclListTail_ == oldChild)
        {
            setParamDeclListTail((PParamDeclListTail) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
