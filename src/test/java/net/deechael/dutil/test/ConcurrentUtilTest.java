package net.deechael.dutil.test;

import net.deechael.dutil.ConcurrentUtil;
import org.junit.jupiter.api.Test;

public class ConcurrentUtilTest {

    @Test
    public void runLaterTest() throws InterruptedException {
        ConcurrentUtil.runLater(2000L, () -> {
            System.out.println("aaa");
        });
        System.out.println("bbb");
        Thread.sleep(4000L);
    }

}
