package Basic;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        // 버블 정렬

        int[] arr = { 7,4,5,1,3 };

        System.out.println(arr);

        for(int i =0 ; i < arr.length-1; i++) {

            if (arr[i] < arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }

        }

        String SortArr = Arrays.toString(arr);
        System.out.println(SortArr);
    }
}
