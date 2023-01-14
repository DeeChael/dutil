package net.deechael.dutil;

import java.util.concurrent.CompletableFuture;

public final class ConcurrentUtil {

    public static void runLater(long millis, Runnable runnable) {
        CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .thenRun(runnable);
    }

    private ConcurrentUtil() {
    }

}
