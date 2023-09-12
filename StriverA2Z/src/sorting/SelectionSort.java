package sorting;

public class SelectionSort {

    static void selection_sort(int arr[] , int n){
        for(int i = 0 ; i < n-1 ;i++){
            int mini = i;
            for(int j = i+1;j < n ;j++){
                if(arr[i] > arr[j]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after selection srot...");
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
     }
}
