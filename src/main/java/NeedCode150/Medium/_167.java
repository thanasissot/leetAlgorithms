package NeedCode150.Medium;

public class _167 {
    public static int[] twoSum(int[] numbers, int target) {
        int index1 = 0,
            index2 = numbers.length - 1;

        while (numbers[index1] + numbers[index2] != target) {
            while (numbers[index1] + numbers[index2] > target) index2--;

            if (target == numbers[index1] + numbers[index2]) break;
            while (numbers[index1] + numbers[index2] < target) index1++;
        }

        return new int[]{index1 + 1, index2 + 1};
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        a = new int[]{2,3,4};
        for (int b : twoSum(a, 6)) {
            System.out.println(b);
        }
    }
}
