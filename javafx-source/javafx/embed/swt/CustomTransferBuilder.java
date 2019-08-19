/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.embed.swt;

/**
Builder class for javafx.embed.swt.CustomTransfer
@see javafx.embed.swt.CustomTransfer
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.2
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class CustomTransferBuilder<B extends javafx.embed.swt.CustomTransferBuilder<B>> implements javafx.util.Builder<javafx.embed.swt.CustomTransfer> {
    protected CustomTransferBuilder() {
    }

    /** Creates a new instance of CustomTransferBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.embed.swt.CustomTransferBuilder<?> create() {
        return new javafx.embed.swt.CustomTransferBuilder();
    }

    private java.lang.String mime;
    /**
    Set the value of the {@link javafx.embed.swt.CustomTransfer#getMime() mime} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B mime(java.lang.String x) {
        this.mime = x;
        return (B) this;
    }

    private java.lang.String name;
    /**
    Set the value of the {@link javafx.embed.swt.CustomTransfer#getName() name} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B name(java.lang.String x) {
        this.name = x;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.embed.swt.CustomTransfer} based on the properties set on this builder.
    */
    public javafx.embed.swt.CustomTransfer build() {
        javafx.embed.swt.CustomTransfer x = new javafx.embed.swt.CustomTransfer(this.name, this.mime);
        return x;
    }
}