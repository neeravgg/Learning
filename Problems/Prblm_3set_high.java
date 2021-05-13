package Problems;
import java.util.*;
public class Prblm_3set_high {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
       ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<k;i++)
            arr.add(sc.nextInt());
        for(int i=0; i<k-2;i++){
            for(int j=i; j<i+3; j++){
                if(arr.get(j) > arr.get(j+1))
                    res.add(arr.get(j));
            }
        }
        System.out.println(res.clone());
    }
}
