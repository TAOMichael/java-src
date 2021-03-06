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

package javafx.scene.control;

/**
Builder class for javafx.scene.control.CheckBoxTreeItem
@see javafx.scene.control.CheckBoxTreeItem
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.2
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class CheckBoxTreeItemBuilder<T, B extends javafx.scene.control.CheckBoxTreeItemBuilder<T, B>> extends javafx.scene.control.TreeItemBuilder<T, B> {
    protected CheckBoxTreeItemBuilder() {
    }

    /** Creates a new instance of CheckBoxTreeItemBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.CheckBoxTreeItemBuilder<T, ?> create() {
        return new javafx.scene.control.CheckBoxTreeItemBuilder();
    }

    /**
    Make an instance of {@link javafx.scene.control.CheckBoxTreeItem} based on the properties set on this builder.
    */
    public javafx.scene.control.CheckBoxTreeItem<T> build() {
        javafx.scene.control.CheckBoxTreeItem<T> x = new javafx.scene.control.CheckBoxTreeItem<T>();
        applyTo(x);
        return x;
    }
}
