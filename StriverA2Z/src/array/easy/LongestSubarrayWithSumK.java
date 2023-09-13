package array.easy;

public class LongestSubarrayWithSumK {

    private static int getLongestSubarrayBrute(int[] arr, long k) {
        int n = arr.length;
        int ans = 0;
        for(int i =0;i<n;i++){
            long sum = 0;
            for(int j =i;j<n;j++){
                sum += arr[j];
                if(sum == k)
                    ans = Math.max(ans,j-i+1);
            }

        }
        return ans;
        // TC - O(Nsquare)

    }
    private static int getLongestSubarrayTwoPointer(int[] arr, long k){
        int n = arr.length;
        int left = 0 ,right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right<n){
            while (left<=right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n){
                sum += arr[right];
            }
        }
        return maxLen;
        // TC - O(2 * N)

    }


    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        long k = 10;
        int len = getLongestSubarrayBrute(arr,k);
        int ans = getLongestSubarrayTwoPointer(arr,k);
        System.out.println("Length of the longest subarray using BRUTE FORCE is: "+len);
        System.out.println("Length of the longest subarray using TWO POINTER is: "+ans);
    }



}
