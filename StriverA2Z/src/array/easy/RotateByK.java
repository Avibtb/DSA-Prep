package array.easy;

import recursion.ReverseArray;

public class RotateByK {

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        //Rotatetoright(arr, n, k);
        RotateLeft(arr,n,k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    static void ReverseArray(int[] arr, int s,int e){
        while (s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }




    private static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        // Copy the last k elements into the temp array
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        //Shift n-k elements from start by k position to the right.
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy the elements into the main array from the temp array.
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }



    static void RotateLeft(int[] arr,int n, int k){
         ReverseArray(arr,0,k-1);
         ReverseArray(arr,k,n-1);
         ReverseArray(arr,0,n-1);
    }
}
