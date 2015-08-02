/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AArithmeticBinaryOperator extends PBinaryOperator
{
    private PArithmeticBinaryOperator _arithmeticBinaryOperator_;

    public AArithmeticBinaryOperator()
    {
        // Constructor
    }

    public AArithmeticBinaryOperator(
        @SuppressWarnings("hiding") PArithmeticBinaryOperator _arithmeticBinaryOperator_)
    {
        // Constructor
        setArithmeticBinaryOperator(_arithmeticBinaryOperator_);

    }

    @Override
    public Object clone()
    {
        return new AArithmeticBinaryOperator(
            cloneNode(this._arithmeticBinaryOperator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArithmeticBinaryOperator(this);
    }

    public PArithmeticBinaryOperator getArithmeticBinaryOperator()
    {
        return this._arithmeticBinaryOperator_;
    }

    public void setArithmeticBinaryOperator(PArithmeticBinaryOperator node)
    {
        if(this._arithmeticBinaryOperator_ != null)
        {
            this._arithmeticBinaryOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arithmeticBinaryOperator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arithmeticBinaryOperator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arithmeticBinaryOperator_ == child)
        {
            this._arithmeticBinaryOperator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arithmeticBinaryOperator_ == oldChild)
        {
            setArithmeticBinaryOperator((PArithmeticBinaryOperator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
