import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];       //array defined
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();    //enter array
        }
        boolean ans = isSorted(a,n);
        if(ans)
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }
    }
    public static boolean isSorted(int[] a, int n)
    {
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }
}