import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] = scan.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int x:a)
        {
            set.add(x);
        }
        System.out.println(set.size());
    }
}