/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TNone extends Token
{
    public TNone()
    {
        super.setText("none");
    }

    public TNone(int line, int pos)
    {
        super.setText("none");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNone(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNone(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNone text.");
    }
}
