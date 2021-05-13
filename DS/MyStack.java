package DS;

import java.util.*;

public class MyStack<E> {
    LinkedList<E> linky = new LinkedList<>();

    void push(E e){
        linky.add(e);
    }
    void pop() {
        linky.removeLast();
    }
    void peek(){
        linky.getLast();
    }


}
