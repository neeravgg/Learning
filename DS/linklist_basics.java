package DS;


import java.util.LinkedList;

public class linklist_basics {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(12);
        linky.add(13);
        linky.add(14);
//        linky.addFirst(6);
//        linky.offer(3);
//        linky.offer(2);

      // System.out.println(linky.element());
        System.out.println(linky.clone());
    }
}
