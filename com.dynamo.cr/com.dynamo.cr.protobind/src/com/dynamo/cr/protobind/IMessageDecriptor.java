package com.dynamo.cr.protobind;

import com.google.protobuf.Descriptors.Descriptor;


/**
 * A wrapper for the message descriptor type.
 * @author chmu
 *
 */
public interface IMessageDecriptor {

    /**
     * Get field descriptor paths
     * @return an array of field descriptor paths
     */
    public abstract IFieldPath[] getFieldPaths();

    /**
     * Get the message type name
     * @return the message type name
     */
    public abstract String getName();

    /**
     * Find field by name
     * @param name name of the field to get
     * @return the field descriptor pach. null of the field doesn't exists
     */
    public abstract IFieldPath findFieldByName(String name);

    /**
     * Get represented google protocol buffers message descriptor
     * @return
     */
    public abstract Descriptor getDescriptor();

}