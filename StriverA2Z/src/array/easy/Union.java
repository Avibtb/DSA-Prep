package array.easy;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.println(val + " ");
    }

//        Set<Integer> Set = new HashSet<>();
//        for (int i : arr) {
//            Set.add(i);
//        }
//        for(int i:arr2){
//            Set.add(i);
//        }
//        Iterator<Integer> _iterator = Set.iterator();
//        while (_iterator.hasNext()){
//            System.out.print(_iterator.next() + " ");
//            }


static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        int i = 0 ,j= 0;
        ArrayList<Integer> union = new ArrayList<>();

        while(i < n && j < m ){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }else{
                if( union.size()==0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                    j++;
                }
            }
        }
        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j<n){
            if(union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
}

}

