/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAlt1ExpressionP4 extends PExpressionP4
{
    private PExpressionP3 _operand1_;
    private TAnd _operator_;
    private PExpressionP4 _operand2_;

    public AAlt1ExpressionP4()
    {
        // Constructor
    }

    public AAlt1ExpressionP4(
        @SuppressWarnings("hiding") PExpressionP3 _operand1_,
        @SuppressWarnings("hiding") TAnd _operator_,
        @SuppressWarnings("hiding") PExpressionP4 _operand2_)
    {
        // Constructor
        setOperand1(_operand1_);

        setOperator(_operator_);

        setOperand2(_operand2_);

    }

    @Override
    public Object clone()
    {
        return new AAlt1ExpressionP4(
            cloneNode(this._operand1_),
            cloneNode(this._operator_),
            cloneNode(this._operand2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlt1ExpressionP4(this);
    }

    public PExpressionP3 getOperand1()
    {
        return this._operand1_;
    }

    public void setOperand1(PExpressionP3 node)
    {
        if(this._operand1_ != null)
        {
            this._operand1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operand1_ = node;
    }

    public TAnd getOperator()
    {
        return this._operator_;
    }

    public void setOperator(TAnd node)
    {
        if(this._operator_ != null)
        {
            this._operator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operator_ = node;
    }

    public PExpressionP4 getOperand2()
    {
        return this._operand2_;
    }

    public void setOperand2(PExpressionP4 node)
    {
        if(this._operand2_ != null)
        {
            this._operand2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operand2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operand1_)
            + toString(this._operator_)
            + toString(this._operand2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operand1_ == child)
        {
            this._operand1_ = null;
            return;
        }

        if(this._operator_ == child)
        {
            this._operator_ = null;
            return;
        }

        if(this._operand2_ == child)
        {
            this._operand2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operand1_ == oldChild)
        {
            setOperand1((PExpressionP3) newChild);
            return;
        }

        if(this._operator_ == oldChild)
        {
            setOperator((TAnd) newChild);
            return;
        }

        if(this._operand2_ == oldChild)
        {
            setOperand2((PExpressionP4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}