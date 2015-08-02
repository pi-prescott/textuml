/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TReference extends Token
{
    public TReference()
    {
        super.setText("reference");
    }

    public TReference(int line, int pos)
    {
        super.setText("reference");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReference(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReference(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReference text.");
    }
}
