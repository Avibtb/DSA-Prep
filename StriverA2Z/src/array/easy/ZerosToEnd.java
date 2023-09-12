package array.easy;

public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[] ={ 1,2,0,1,0,4,0};
        moveZeros(arr);
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    private static void zerosToEnd(int[] arr) {
        int zero = 0;
        for(int i =0; i< arr.length;i++){
            if(arr[i] == 0)
                zero++;
        }
        int[] temp = new int[arr.length];
        int j=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }
        while (j< arr.length){
            temp[j] = 0;
            j++;
        }
        for (int i = 0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }


    private static void moveZeros(int[] arr){
        int len = arr.length;
        int k = 0;
        while (k<len){
            if(arr[k] == 0 ){
                break;
            }else {
                k = k+1;
            }
        }
        int i = k , j = k + 1;
        while(i<len && j < len){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }


    }
}
