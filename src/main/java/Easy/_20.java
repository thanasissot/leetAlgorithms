package Easy;

import java.util.Stack;

public class _20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' :
                    stack.push(')');
                    break;
                case '{' :
                    stack.push('}');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                case ')' :
                    if (stack.isEmpty() || stack.pop() != ')') return false;
                    break;
                case '}' :
                    if (stack.isEmpty() || stack.pop() != '}') return false;
                    break;
                case ']' :
                    if (stack.isEmpty() || stack.pop() != ']') return false;
                    break;
            }
        }
        return stack.isEmpty(); // don't forget to check for stuff left over
    }
}
