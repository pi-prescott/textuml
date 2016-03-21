/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AReferenceDecl extends PReferenceDecl
{
    private PReferenceType _referenceType_;
    private TIdentifier _identifier_;
    private TColon _colon_;
    private PTypeIdentifier _typeIdentifier_;
    private POptionalQualifier _optionalQualifier_;
    private POptionalSubsetting _optionalSubsetting_;
    private POptionalOpposite _optionalOpposite_;
    private TSemicolon _semicolon_;

    public AReferenceDecl()
    {
        // Constructor
    }

    public AReferenceDecl(
        @SuppressWarnings("hiding") PReferenceType _referenceType_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PTypeIdentifier _typeIdentifier_,
        @SuppressWarnings("hiding") POptionalQualifier _optionalQualifier_,
        @SuppressWarnings("hiding") POptionalSubsetting _optionalSubsetting_,
        @SuppressWarnings("hiding") POptionalOpposite _optionalOpposite_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setReferenceType(_referenceType_);

        setIdentifier(_identifier_);

        setColon(_colon_);

        setTypeIdentifier(_typeIdentifier_);

        setOptionalQualifier(_optionalQualifier_);

        setOptionalSubsetting(_optionalSubsetting_);

        setOptionalOpposite(_optionalOpposite_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AReferenceDecl(
            cloneNode(this._referenceType_),
            cloneNode(this._identifier_),
            cloneNode(this._colon_),
            cloneNode(this._typeIdentifier_),
            cloneNode(this._optionalQualifier_),
            cloneNode(this._optionalSubsetting_),
            cloneNode(this._optionalOpposite_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReferenceDecl(this);
    }

    public PReferenceType getReferenceType()
    {
        return this._referenceType_;
    }

    public void setReferenceType(PReferenceType node)
    {
        if(this._referenceType_ != null)
        {
            this._referenceType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._referenceType_ = node;
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

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public PTypeIdentifier getTypeIdentifier()
    {
        return this._typeIdentifier_;
    }

    public void setTypeIdentifier(PTypeIdentifier node)
    {
        if(this._typeIdentifier_ != null)
        {
            this._typeIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeIdentifier_ = node;
    }

    public POptionalQualifier getOptionalQualifier()
    {
        return this._optionalQualifier_;
    }

    public void setOptionalQualifier(POptionalQualifier node)
    {
        if(this._optionalQualifier_ != null)
        {
            this._optionalQualifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalQualifier_ = node;
    }

    public POptionalSubsetting getOptionalSubsetting()
    {
        return this._optionalSubsetting_;
    }

    public void setOptionalSubsetting(POptionalSubsetting node)
    {
        if(this._optionalSubsetting_ != null)
        {
            this._optionalSubsetting_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalSubsetting_ = node;
    }

    public POptionalOpposite getOptionalOpposite()
    {
        return this._optionalOpposite_;
    }

    public void setOptionalOpposite(POptionalOpposite node)
    {
        if(this._optionalOpposite_ != null)
        {
            this._optionalOpposite_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalOpposite_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._referenceType_)
            + toString(this._identifier_)
            + toString(this._colon_)
            + toString(this._typeIdentifier_)
            + toString(this._optionalQualifier_)
            + toString(this._optionalSubsetting_)
            + toString(this._optionalOpposite_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._referenceType_ == child)
        {
            this._referenceType_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._typeIdentifier_ == child)
        {
            this._typeIdentifier_ = null;
            return;
        }

        if(this._optionalQualifier_ == child)
        {
            this._optionalQualifier_ = null;
            return;
        }

        if(this._optionalSubsetting_ == child)
        {
            this._optionalSubsetting_ = null;
            return;
        }

        if(this._optionalOpposite_ == child)
        {
            this._optionalOpposite_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._referenceType_ == oldChild)
        {
            setReferenceType((PReferenceType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._typeIdentifier_ == oldChild)
        {
            setTypeIdentifier((PTypeIdentifier) newChild);
            return;
        }

        if(this._optionalQualifier_ == oldChild)
        {
            setOptionalQualifier((POptionalQualifier) newChild);
            return;
        }

        if(this._optionalSubsetting_ == oldChild)
        {
            setOptionalSubsetting((POptionalSubsetting) newChild);
            return;
        }

        if(this._optionalOpposite_ == oldChild)
        {
            setOptionalOpposite((POptionalOpposite) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
