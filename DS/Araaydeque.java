package DS;

import java.util.*;

public class Araaydeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(--t != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0; i<n; i++){
                if(i<k)
                    pq.add(arr[i]);
                else
                    if(pq.element() <  arr[i])
                        pq.poll();
                        pq.add(arr[i]); }
            ArrayList<Integer> ans = new ArrayList<>(pq);
            Collections.sort(ans, Collections.reverseOrder());
            System.out.println(ans);
        }
    }
}
