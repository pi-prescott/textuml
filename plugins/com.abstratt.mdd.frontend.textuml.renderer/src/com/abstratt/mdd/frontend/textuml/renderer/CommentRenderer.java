/*******************************************************************************
 * Copyright (c) 2006, 2008 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/
package com.abstratt.mdd.frontend.textuml.renderer;

import org.eclipse.uml2.uml.Comment;

import com.abstratt.mdd.modelrenderer.IEObjectRenderer;
import com.abstratt.mdd.modelrenderer.IRenderingSession;
import com.abstratt.mdd.modelrenderer.IndentedPrintWriter;

public class CommentRenderer implements IEObjectRenderer<Comment> {
    public boolean renderObject(Comment element, IndentedPrintWriter out, IRenderingSession context) {
        out.print("(* ");
        out.print(element.getBody().trim());
        out.print(" *)");
        out.println();
        return true;
    }
}
