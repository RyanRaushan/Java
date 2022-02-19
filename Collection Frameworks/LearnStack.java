import java.util.Scanner;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(500);
        stack.push(200);
        stack.push(100);
        stack.push(700);
        stack.push(800);

        System.out.println(stack); // [500, 200, 100, 700, 800]

        System.out.println(stack.peek());   // 800

        // Remove the peak element.
        System.out.println(stack.pop()); // 800

        System.out.println(stack); //   [500, 200, 100, 700]

        // check stack is empty or not.
        System.out.println(stack.empty()); //  false

        stack.clear();

        System.out.println(stack.empty()); // true
    }
}
