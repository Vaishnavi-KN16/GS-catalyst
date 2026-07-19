import java.util.*;
public class Update{
    static int [] update( int [] arr, int [] positions , int [] elements){
        for( int i=0;i<positions.length;i++)

        {
            int pos= positions[i]-1;
            arr[pos]= elements[i];

        }
        return arr;

    }
}