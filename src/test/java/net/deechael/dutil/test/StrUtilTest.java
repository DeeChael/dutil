package net.deechael.dutil.test;

import net.deechael.dutil.StrUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StrUtilTest {

    @Test
    public void rsplitTest() {
        String original = "aaa:bbb:ccc:ddd:eee:fff:ggg";
        String spliter = ":";
        System.out.println(Arrays.toString(StrUtil.rsplit(original, spliter, 1)));
        System.out.println(Arrays.toString(StrUtil.rsplit(original, spliter, 2)));
    }

}
