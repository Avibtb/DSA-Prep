package array.easy;

public class SecondLargest {

    static int getElements(int arr[] , int n){
        int large = 0;
        int secondLarge = -1;
        for(int i =0;i<n;i++){
            if(arr[i] > arr[large]){
                secondLarge = large;
                large = i;
            }else if(arr[i] < arr[large]){
                if(secondLarge == -1 || arr[secondLarge] < arr[i]){
                    secondLarge = i;
                }
            }
        }
        return arr[secondLarge];

        }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        System.out.println(getElements(arr, n));
    }
}
