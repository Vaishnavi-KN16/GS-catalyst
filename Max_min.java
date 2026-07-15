import java.util.*;


public class Max_min {
    static int max( int [] arr)
    {
        int max = arr[0];
        for ( int i=0;i<arr.length;i++)
        {
            if( arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    static int min( int [] arr)
    {
        int min = arr[0];
        for( int i=0;i<arr.length;i++)
        
            if( arr[i]<min)
            {
                min= arr[i];
            }
        
        return min;
    }
    
    public static void main( String[] args)
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of the array");
        for( int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element in the array is: " + max(arr));
        System.out.println("Minimum element in the array is: " + min(arr));

    }
    
}
