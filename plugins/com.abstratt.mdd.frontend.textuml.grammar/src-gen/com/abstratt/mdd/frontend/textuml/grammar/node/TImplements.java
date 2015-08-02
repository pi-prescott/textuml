/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TImplements extends Token
{
    public TImplements()
    {
        super.setText("implements");
    }

    public TImplements(int line, int pos)
    {
        super.setText("implements");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TImplements(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTImplements(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TImplements text.");
    }
}
