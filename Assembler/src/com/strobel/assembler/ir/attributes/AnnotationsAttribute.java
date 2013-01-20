package com.strobel.assembler.ir.attributes;

import com.strobel.assembler.metadata.annotations.CustomAnnotation;

/**
 * @author Mike Strobel
 */
public final class AnnotationsAttribute extends SourceAttribute {
    private final CustomAnnotation[] _annotations;

    public AnnotationsAttribute(final String name, final int length, final CustomAnnotation[] annotations) {
        super(name, length);
        _annotations = annotations;
    }

    public CustomAnnotation[] getAnnotations() {
        return _annotations;
    }
}

