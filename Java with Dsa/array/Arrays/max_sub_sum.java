public class max_sub_sum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxsub(arr);
    }

    public static void maxsub(int arr[]) {
        int count;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                count = 0;
                for (int k = i; k <= j; k++) {
                    count = count + arr[k];
                }
                System.out.println(count);
                if (max < count) {
                    max = count;
                }
            }
        }
        System.out.println("maxsum " + max);
    }
}
