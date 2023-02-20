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

    @Test
    public void numsEvenShouldContainBetweenZeroAndSix() {
        int[] shouldBe = {0, 2, 4, 6};
        this.exercise.stepThree();
        Assertions.assertArrayEquals(shouldBe, this.exercise.numsEven);
    }

    @Test
    public void countdownShouldBeThreeToZero() {
        int[] shouldBe = {3, 2, 1, 0};
        this.exercise.stepFour();
        Assertions.assertArrayEquals(shouldBe, this.exercise.countdown);
    }

}
