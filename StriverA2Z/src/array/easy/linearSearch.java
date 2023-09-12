package array.easy;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int num = 4;
        int indexOfElement = LinearSearch(arr,num);
        System.out.println(indexOfElement);
    }

    private static int LinearSearch(int[] arr, int num) {
        int len = arr.length;
        for(int i =0 ;i<len;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
