/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalFormalTemplateParameters extends POptionalFormalTemplateParameters
{
    private TLab _lab_;
    private PFormalTemplateParameterList _formalTemplateParameterList_;
    private TRab _rab_;

    public AOptionalFormalTemplateParameters()
    {
        // Constructor
    }

    public AOptionalFormalTemplateParameters(
        @SuppressWarnings("hiding") TLab _lab_,
        @SuppressWarnings("hiding") PFormalTemplateParameterList _formalTemplateParameterList_,
        @SuppressWarnings("hiding") TRab _rab_)
    {
        // Constructor
        setLab(_lab_);

        setFormalTemplateParameterList(_formalTemplateParameterList_);

        setRab(_rab_);

    }

    @Override
    public Object clone()
    {
        return new AOptionalFormalTemplateParameters(
            cloneNode(this._lab_),
            cloneNode(this._formalTemplateParameterList_),
            cloneNode(this._rab_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOptionalFormalTemplateParameters(this);
    }

    public TLab getLab()
    {
        return this._lab_;
    }

    public void setLab(TLab node)
    {
        if(this._lab_ != null)
        {
            this._lab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lab_ = node;
    }

    public PFormalTemplateParameterList getFormalTemplateParameterList()
    {
        return this._formalTemplateParameterList_;
    }

    public void setFormalTemplateParameterList(PFormalTemplateParameterList node)
    {
        if(this._formalTemplateParameterList_ != null)
        {
            this._formalTemplateParameterList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._formalTemplateParameterList_ = node;
    }

    public TRab getRab()
    {
        return this._rab_;
    }

    public void setRab(TRab node)
    {
        if(this._rab_ != null)
        {
            this._rab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rab_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lab_)
            + toString(this._formalTemplateParameterList_)
            + toString(this._rab_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lab_ == child)
        {
            this._lab_ = null;
            return;
        }

        if(this._formalTemplateParameterList_ == child)
        {
            this._formalTemplateParameterList_ = null;
            return;
        }

        if(this._rab_ == child)
        {
            this._rab_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lab_ == oldChild)
        {
            setLab((TLab) newChild);
            return;
        }

        if(this._formalTemplateParameterList_ == oldChild)
        {
            setFormalTemplateParameterList((PFormalTemplateParameterList) newChild);
            return;
        }

        if(this._rab_ == oldChild)
        {
            setRab((TRab) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
