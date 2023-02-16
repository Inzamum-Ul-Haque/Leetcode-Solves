
package Stack;

import java.util.Stack;


public class Valid_Parantheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        
        if(s.length() == 1 || (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && stack.empty()){
                return false;
            }
            else if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                if((s.charAt(i) == ')' && stack.peek() == '(') ||
                        (s.charAt(i) == '}' && stack.peek() == '{') ||
                        (s.charAt(i) == ']' && stack.peek() == '[')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        if(!stack.empty()){
            return false;
        }

        return true;
    }
}
