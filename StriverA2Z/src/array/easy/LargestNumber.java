package array.easy;

public class LargestNumber {

    static  int largest(int arr[], int n)
    {
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;

    }
    public static void main(String[] args) {
        int arr[] =  {1, 8, 7, 56, 90};
        int n = 5;
        System.out.println(largest(arr,n));

    }
}
