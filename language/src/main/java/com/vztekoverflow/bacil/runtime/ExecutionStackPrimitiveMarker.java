package com.vztekoverflow.bacil.runtime;

public class ExecutionStackPrimitiveMarker {

    public static final byte EXECUTION_STACK_TAG_INT32 = 0;
    public static final byte EXECUTION_STACK_TAG_INT64 = 1;
    public static final byte EXECUTION_STACK_TAG_NATIVE_INT = 2;
    public static final byte EXECUTION_STACK_TAG_F = 3;

    public static final byte EXECUTION_STACK_TAG_MAX = 3;

    public static final ExecutionStackPrimitiveMarker EXECUTION_STACK_INT32 = new ExecutionStackPrimitiveMarker(EXECUTION_STACK_TAG_INT32);
    public static final ExecutionStackPrimitiveMarker EXECUTION_STACK_INT64 = new ExecutionStackPrimitiveMarker(EXECUTION_STACK_TAG_INT64);
    public static final ExecutionStackPrimitiveMarker EXECUTION_STACK_NATIVE_INT = new ExecutionStackPrimitiveMarker(EXECUTION_STACK_TAG_NATIVE_INT);
    public static final ExecutionStackPrimitiveMarker EXECUTION_STACK_F = new ExecutionStackPrimitiveMarker(EXECUTION_STACK_TAG_F);

    private final byte simpleTag;

    private ExecutionStackPrimitiveMarker(byte simpleTag)
    {
        this.simpleTag = simpleTag;
    }

    public byte getTag() {
        return simpleTag;
    }

    public static boolean isExecutionStackPrimitiveMarker(Object obj)
    {
        return obj == EXECUTION_STACK_INT32 || obj == EXECUTION_STACK_INT64 || obj == EXECUTION_STACK_F || obj == EXECUTION_STACK_NATIVE_INT;
    }
}