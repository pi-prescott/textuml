/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class APermissionConstraintInvariantKernel extends PInvariantKernel
{
    private PPermissionConstraint _permissionConstraint_;

    public APermissionConstraintInvariantKernel()
    {
        // Constructor
    }

    public APermissionConstraintInvariantKernel(
        @SuppressWarnings("hiding") PPermissionConstraint _permissionConstraint_)
    {
        // Constructor
        setPermissionConstraint(_permissionConstraint_);

    }

    @Override
    public Object clone()
    {
        return new APermissionConstraintInvariantKernel(
            cloneNode(this._permissionConstraint_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPermissionConstraintInvariantKernel(this);
    }

    public PPermissionConstraint getPermissionConstraint()
    {
        return this._permissionConstraint_;
    }

    public void setPermissionConstraint(PPermissionConstraint node)
    {
        if(this._permissionConstraint_ != null)
        {
            this._permissionConstraint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._permissionConstraint_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._permissionConstraint_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._permissionConstraint_ == child)
        {
            this._permissionConstraint_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._permissionConstraint_ == oldChild)
        {
            setPermissionConstraint((PPermissionConstraint) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
