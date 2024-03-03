package task1_arrayMerge;

import faangSchool.task1_arrayMerge.Main;
import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void marge1() {
        var extend = new int[]{1, 2, 2, 3, 5, 6};
        Main main = new Main();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        main.marge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(extend, nums1);
    }

    @org.junit.jupiter.api.Test
    void marge2() {
        var extend = new int[]{1};
        Main main = new Main();
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;
        main.marge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(extend, nums1);
    }

    @org.junit.jupiter.api.Test
    void marge3() {
        var extend = new int[]{1};
        Main main = new Main();
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        main.marge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(extend, nums1);
    }
}