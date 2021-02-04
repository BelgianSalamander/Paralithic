package com.dfsek.paralithic.function.dynamic.functions;

import com.dfsek.paralithic.function.dynamic.DynamicFunction;

public class MaxDynamicFunction implements DynamicFunction {
    @Override
    public double eval(double... args) {
        return Math.max(args[0], args[1]);
    }

    @Override
    public int getArgNumber() {
        return 2;
    }

    @Override
    public boolean isStateless() {
        return true;
    }
}
