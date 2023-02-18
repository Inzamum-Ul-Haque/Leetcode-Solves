package Stack;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int op2 = s.pop();
                int op1 = s.pop();

                switch (token) {
                    case "+" ->
                        s.push(op1 + op2);
                    case "-" ->
                        s.push(op1 - op2);
                    case "*" ->
                        s.push(op1 * op2);
                    case "/" -> {
                        if (op2 == 0) {
                            s.push(0);
                        } else {
                            s.push(op1 / op2);
                        }
                    }
                    default -> {
                    }
                }
            } else {
                s.add(Integer.parseInt(token));
            }
        }

        return s.pop();
    }
}
