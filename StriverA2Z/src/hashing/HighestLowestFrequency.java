package hashing;
import java.util.HashMap;
import java.util.Map;
public class HighestLowestFrequency {

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr,n);
    }

    static void Frequency(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int maxFreq = 0, minFreq = n;
        int maxELe = 0 , minELe=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int ele = entry.getKey();

            if(count > maxFreq){
                maxELe = ele;
                maxFreq = count;
            }
            if(count < minFreq){
                minELe = ele;
                minFreq = count;
            }
        }
        System.out.println("Highest Frequency "+ maxELe+ " "+maxFreq);
        System.out.println("Lowest Frequency "+ minELe+ " "+minFreq);


    }
}
