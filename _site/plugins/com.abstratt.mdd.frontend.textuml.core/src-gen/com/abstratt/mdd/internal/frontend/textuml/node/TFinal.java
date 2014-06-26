/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TFinal extends Token
{
    public TFinal()
    {
        super.setText("final");
    }

    public TFinal(int line, int pos)
    {
        super.setText("final");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFinal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFinal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFinal text.");
    }
}