package Sorting_and_Searching.Apartments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        long k = scan.nextInt();

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i] = scan.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b,Collections.reverseOrder());

        int i=0;
        int j=0;
        int c =0 ;
        while(i<n && j<m)
        {
            if(b[j]<a[i]+k && b[j]>a[i]-k) {
                c++;
                i++;
                j++;
            }
            else if(b[j]<a[i])
                j++;
            else
                i++;
        }
        System.out.println(c);
    }
}
