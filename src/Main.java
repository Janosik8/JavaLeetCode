import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //problem 26
        int[] nums = new int[]{1, 2, 3, 4, 5, 5, 5, 5, 6, 6, 66, 6, 643, 223, 432, 413, 52, 6345, 64, 6, 7};
        Problem26 problem26 = new Problem26();
        int k = problem26.removeDuplicates(nums);
        System.out.println("k -> " + k);
        System.out.println(Arrays.toString(nums));

        //problem 27
        System.out.println("\nProblem 27");
        Problem27 problem27 = new Problem27();
        k =  problem27.removeVal(nums, 6);
        System.out.println("k -> "+ k);


        //problem 28
        System.out.println("\nProblem28");
        String haycast = "abc";
        String needle = "c";
        Problem28 problem28 = new Problem28();
        k =  problem28.strStr(haycast, needle);
        System.out.println("k -> "+k);
    }

}