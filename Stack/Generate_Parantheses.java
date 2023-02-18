package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generate_Parantheses {

    List<String> res = new ArrayList<>();
    Stack<String> stack = new Stack<>();

    public String returnAsString(Stack<String> stack) {
        String res = "";

        for (String s : stack) {
            res += s;
        }

        return res;
    }

    public void backTrack(int openP, int closeP, int n) {
        if (openP == closeP && closeP == n) {
            res.add(returnAsString(stack));
            return;
        }

        if (openP < n) {
            stack.push("(");
            backTrack(openP + 1, closeP, n);
            stack.pop();
        }

        if (closeP < openP) {
            stack.push(")");
            backTrack(openP, closeP + 1, n);
            stack.pop();
        }
    }

    public List<String> generateParenthesis(int n) {
        backTrack(0, 0, n);
        return res;
    }
}
