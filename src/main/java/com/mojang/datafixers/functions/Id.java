package com.mojang.datafixers.functions;

import com.mojang.datafixers.types.DynamicOps;

final class Id<A> extends PointFreeFunction<A, A> {
    public Id() {
    }

    @Override
    public A eval(final DynamicOps<?> ops, final A input) {
        return input;
    }

    @Override
    public boolean equals(final Object obj) {
        return obj instanceof com.mojang.datafixers.functions.Id<?>;
    }

    @Override
    public int hashCode() {
        return Id.class.hashCode();
    }

    @Override
    public String toString(final int level) {
        return "id";
    }
}
