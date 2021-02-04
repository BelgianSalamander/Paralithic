package com.dfsek.paralithic.function.dynamic.functions;

import com.dfsek.paralithic.function.dynamic.DynamicFunction;

public class SinDynamicFunction implements DynamicFunction {
    @Override
    public double eval(double... args) {
        return Math.sin(args[0]);
    }

    @Override
    public int getArgNumber() {
        return 1;
    }

    @Override
    public boolean isStateless() {
        return true;
    }
}
