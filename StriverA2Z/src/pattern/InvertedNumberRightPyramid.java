package pattern;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class InvertedNumberRightPyramid {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n;i++){
            for (int j = n ;j>i;j--){
                System.out.print((n-j+1)+" ");
            }
            System.out.println();
        }
    }
}
