package Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> a, minStack;

    public MinStack() {
        this.a = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.a.push(val);
        if (!this.minStack.empty()) {
            int min = Math.min(val, this.minStack.peek());
            this.minStack.push(min);
        } else {
            int min = Math.min(val, val);
            this.minStack.push(min);
        }
        System.out.println(a);
        System.out.println(minStack);
    }

    public void pop() {
        this.a.pop();
        this.minStack.pop();
        System.out.println(a);
        System.out.println(minStack);
    }

    public int top() {
        return this.a.peek();
    }

    public int getMin() {
        return this.minStack.peek();   
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        m.getMin(); // return -3
        m.pop();
        m.top();    // return 0
        m.getMin(); // return -2
    }
}
