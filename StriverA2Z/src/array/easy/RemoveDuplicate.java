package array.easy;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicatesTwoPointer(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length;i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;
        }
        return  k;

        // TC - O ( n * log(n)) + O (n)
        // SC - O(n)
    }

    private static int removeDuplicatesTwoPointer(int[] arr){
        int i =0;
        for(int j = 1; j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return  i+1;
        // TC - O(n)
        // SC - O(1)
    }
}
