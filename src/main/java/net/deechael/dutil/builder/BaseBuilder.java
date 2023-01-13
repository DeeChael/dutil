package net.deechael.dutil.builder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface BaseBuilder<E, T> {

    @Nullable
    T done();

    @NotNull
    E build();

}
