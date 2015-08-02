/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TUnordered extends Token
{
    public TUnordered()
    {
        super.setText("unordered");
    }

    public TUnordered(int line, int pos)
    {
        super.setText("unordered");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUnordered(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUnordered(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUnordered text.");
    }
}
