/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class APreconditionOperationConstraintKernel extends POperationConstraintKernel
{
    private POperationPrecondition _operationPrecondition_;

    public APreconditionOperationConstraintKernel()
    {
        // Constructor
    }

    public APreconditionOperationConstraintKernel(
        @SuppressWarnings("hiding") POperationPrecondition _operationPrecondition_)
    {
        // Constructor
        setOperationPrecondition(_operationPrecondition_);

    }

    @Override
    public Object clone()
    {
        return new APreconditionOperationConstraintKernel(
            cloneNode(this._operationPrecondition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPreconditionOperationConstraintKernel(this);
    }

    public POperationPrecondition getOperationPrecondition()
    {
        return this._operationPrecondition_;
    }

    public void setOperationPrecondition(POperationPrecondition node)
    {
        if(this._operationPrecondition_ != null)
        {
            this._operationPrecondition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operationPrecondition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operationPrecondition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operationPrecondition_ == child)
        {
            this._operationPrecondition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operationPrecondition_ == oldChild)
        {
            setOperationPrecondition((POperationPrecondition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}