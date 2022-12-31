package Sorting_and_Searching.Distinct_Numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TLE
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        int[] a = new int[n];
//
//        for(int i=0;i<n;i++)
//            a[i] = scan.nextInt();
//        Set<Integer> set = new HashSet<>();
//
//        for(int x:a)
//        {
//            set.add(x);
//        }
//        System.out.println(set.size());
//    }
//}


//ACCEPTED
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] = scan.nextInt();
        Arrays.sort(a);

        int c=1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
                c++;
        }
        System.out.println(c);
    }
}