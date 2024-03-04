package faangSchool.task2_findMaxAverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void findMaxAverage1() {
        Double expected = 12.75000;
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        Double actual = new Main().findMaxAverage(nums, 4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAverage2() {
        Double expected = 5.00000;
        int[] nums = new int[]{5};
        Double actual = new Main().findMaxAverage(nums, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAverageVariant21() {
        Double expected = 12.75000;
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        Double actual = new Main().findMaxAverageVariant2(nums, 4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAverageVariant22() {
        Double expected = 5.00000;
        int[] nums = new int[]{5};
        Double actual = new Main().findMaxAverageVariant2(nums, 1);
        Assertions.assertEquals(expected, actual);
    }
}