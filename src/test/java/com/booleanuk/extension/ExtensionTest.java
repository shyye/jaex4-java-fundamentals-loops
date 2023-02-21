package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    Extension extension;
    @Test
    public void numsEvenShouldContainBetweenZeroAndSix() {
        int[] shouldBe = {0, 2, 4, 6};
        this.extension.stepOne();
        Assertions.assertArrayEquals(shouldBe, this.extension.numsEven);
    }
}
