package pattern;

import java.util.Scanner;

// * * *
// * *
// *
public class InvertedRightPyramid {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i<n;i++){
            for(int j = n; j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
