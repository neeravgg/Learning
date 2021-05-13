package DS;
import java.util.*;
public class stack_basics {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(12);
    stack.push(13);
    stack.push(14);
        System.out.println(stack.search(12));
        stack.pop();
        System.out.println(stack.peek());
    }
}
