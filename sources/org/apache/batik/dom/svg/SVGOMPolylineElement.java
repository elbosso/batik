/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.dom.svg;

import org.apache.batik.dom.AbstractDocument;

import org.w3c.dom.svg.SVGList;
import org.w3c.dom.svg.SVGPolylineElement;

/**
 * This class implements {@link org.w3c.dom.svg.SVGPolylineElement}.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class SVGOMPolylineElement
    extends    SVGGraphicsElement
    implements SVGPolylineElement {
    /**
     * Creates a new SVGOMPolylineElement object.
     */
    public SVGOMPolylineElement() {
    }

    /**
     * Creates a new SVGOMPolylineElement object.
     * @param prefix The namespace prefix.
     * @param owner The owner document.
     */
    public SVGOMPolylineElement(String prefix, AbstractDocument owner) {
        super(prefix, owner);
    }

    /**
     * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLocalName()}.
     */
    public String getLocalName() {
        return "polyline";
    }

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.svg.SVGAnimatedPoints#getPoints()}.
     */
    public SVGList getPoints() {
        throw new RuntimeException(" !!! TODO");
    }

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.svg.SVGAnimatedPoints#getAnimatedPoints()}.
     */
    public SVGList getAnimatedPoints() {
        throw new RuntimeException(" !!! TODO");
    }
}
