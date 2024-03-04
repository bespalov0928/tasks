package faangSchool.task2_findMaxAverage;

public class Main {
    public double findMaxAverage(int[] nums, int k) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        double res = sums[k - 1] * 1.0 / k;
        for (int i = k; i < sums.length; i++) {
            res = Math.max(res, (sums[i] - sums[i - k]) * 1.0 / k);
        }
        return res;
    }

    //variant 2
    public double findMaxAverageVariant2(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;
    }


}
