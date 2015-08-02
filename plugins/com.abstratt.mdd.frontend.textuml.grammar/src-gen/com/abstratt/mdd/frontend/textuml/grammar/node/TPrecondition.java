/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TPrecondition extends Token
{
    public TPrecondition()
    {
        super.setText("precondition");
    }

    public TPrecondition(int line, int pos)
    {
        super.setText("precondition");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrecondition(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrecondition(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrecondition text.");
    }
}
