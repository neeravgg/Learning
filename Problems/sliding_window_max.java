package Problems;
import java.util.*;
public class sliding_window_max {
    public static void main(String[] args) {
     int arr[] = {2,-2,6,6};
     Set<Integer> set = new HashSet<>();
             int sum = 0;
     boolean subarray = false;
         for(int element : arr){
             set.add(sum);
             sum += element;
                 if(set.contains(sum))
                     subarray = true;
                    break;
         }
        System.out.println(subarray +" ");


    }
}
