package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void numsZeroToThreeShouldContainNumsZeroToThree() {
        int[] shouldBe = {0, 1, 2, 3};
        this.exercise.stepOne();
        Assertions.assertArrayEquals(shouldBe, this.exercise.numsZeroToThree);
    }

    @Test
    public void numsFiveToTenShouldContainNumsFiveToTen() {
        int[] shouldBe = {5, 6, 7, 8, 9, 10};
        this.exercise.stepTwo();
        Assertions.assertArrayEquals(shouldBe, this.exercise.numsFiveToTen);
    }
}
