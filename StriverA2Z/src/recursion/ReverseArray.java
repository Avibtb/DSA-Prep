package recursion;

public class ReverseArray {

    static void printArray(int ans[],int n){
        System.out.println("Reversed Array is: ");
        for(int i = 0;i<n;i++){
            System.out.print(ans[i]+ " ");
        }

    }
    static  void reverseArrayRecursive(int arr[],int start ,int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArrayRecursive(arr,start+1,end-1);
        }

    }

    static void reverseArry(int arr[],int n){
        int[] ans = new int[n];
        for(int i = n-1;i>=0;i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }



    public static void main(String[] args) {
        int n =5;
        int arr[] = {5,4,3,2,1};
        reverseArry(arr,n);
        reverseArrayRecursive(arr,0,n-1);
        printArray(arr,n);
    }
}
