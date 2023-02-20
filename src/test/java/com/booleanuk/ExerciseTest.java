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
    public void countdownShouldBeThreeToZero() {
        int[] shouldBe = {3, 2, 1, 0};
        this.exercise.stepThree();
        Assertions.assertArrayEquals(shouldBe, this.exercise.countdown);
    }

    @Test
    public void isMyNumberAFavourite() {
        Assertions.assertEquals(true, this.exercise.stepFour(1));
        Assertions.assertEquals(true, this.exercise.stepFour(2));
        Assertions.assertEquals(true, this.exercise.stepFour(4));
        Assertions.assertEquals(true, this.exercise.stepFour(5));
        Assertions.assertEquals(true, this.exercise.stepFour(7));
        Assertions.assertEquals(true, this.exercise.stepFour(8));
        Assertions.assertEquals(true, this.exercise.stepFour(10));

        Assertions.assertEquals(false, this.exercise.stepFour(6));
        Assertions.assertEquals(false, this.exercise.stepFour(3));
        Assertions.assertEquals(false, this.exercise.stepFour(11));
    }

}
