import sun.awt.X11.XSystemTrayPeer;

import java.util.Scanner;

public class InputAndSort {
    static int binSearch(Comparable<Integer>[] array, Integer target, Integer begin, Integer end) {
        if (begin.compareTo(end) == 0) {
            return -1;
        }
        int mid = begin + (end - begin) / 2;
        if (array[mid].compareTo(target) == 0) {
            return mid;
        } else if (array[mid].compareTo(target) < 0) {
            return binSearch(array, target, mid + 1, end);
        } else {
            return binSearch(array, target, begin, mid);
        }
    }

    static int binSearch(Integer[] array, Integer target) {
        return binSearch(array, target, 0, array.length);
    }

    public static void main(String[] args) {
        int z;
        System.out.println("请输入n个需要排序的数：（请以 ，隔开）");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String[] p = a.split(",");
        Integer[] nums = new Integer[p.length];

        for (int i = 0; i < p.length; i++) {
            nums[i] = Integer.parseInt(p[i]);
        }
        System.out.println("原序列为：");
        for (int k : nums) {
            System.out.printf("%4d", k);
        }
        System.out.println();
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    z = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = z;
                }
            }
        }
        System.out.println("排序后序列为：");
        for (int j : nums) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        System.out.println("请输入需要查找的数字：");
        Integer n = input.nextInt();
        System.out.println(binSearch(nums, n));
    }

}
