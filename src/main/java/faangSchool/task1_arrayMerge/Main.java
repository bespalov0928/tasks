package faangSchool.task1_arrayMerge;

public class Main {
//    nums1.length == m+n;
//    nums2.length = n;
//    0 <= m, n <= 200
//    1 <= m + n <= 200
//    -10^9 <= nums1[i], nums2[j]<=10^9

//    public void marge_(int[] nums1, int m, int[] nums2, int n) {
//        if (m == 0) {
//            nums1[0] = nums2[n - 1];
//        } else {
//
//            for (int index = 0; index < n; index++) {
//                int countShift = 0;
//                int countShiftFinal = 0;
//                while (nums1[m - 1 - countShift] > nums2[index]) {
//                    countShift++;
//                    countShiftFinal++;
//                }
//                while (countShift > 0) {
//                    nums1[m + countShift - 1] = nums1[m + countShift - 2];
//                    countShift--;
//                }
//                nums1[m + index - countShiftFinal] = nums2[index];
//            }
//        }
//    }

    public void marge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m + n - 1;
        int pointerNum1 = m - 1;
        int pointerNum2 = n - 1;

        while (pointer >= 0) {
            if (pointerNum2 < 0) {
                break;
            }
            if (pointerNum1 >= 0 && nums1[pointerNum1] > nums2[pointerNum2]) {
                nums1[pointer] = nums1[pointerNum1];
                pointerNum1--;
            } else {
                nums1[pointer] = nums2[pointerNum2];
                pointerNum2--;
            }
            pointer--;
        }

    }
}
