/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ALoopTest extends PLoopTest
{
    private PRootExpression _rootExpression_;

    public ALoopTest()
    {
        // Constructor
    }

    public ALoopTest(
        @SuppressWarnings("hiding") PRootExpression _rootExpression_)
    {
        // Constructor
        setRootExpression(_rootExpression_);

    }

    @Override
    public Object clone()
    {
        return new ALoopTest(
            cloneNode(this._rootExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALoopTest(this);
    }

    public PRootExpression getRootExpression()
    {
        return this._rootExpression_;
    }

    public void setRootExpression(PRootExpression node)
    {
        if(this._rootExpression_ != null)
        {
            this._rootExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rootExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rootExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rootExpression_ == child)
        {
            this._rootExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rootExpression_ == oldChild)
        {
            setRootExpression((PRootExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
