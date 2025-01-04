import java.util.Stack;

class Solution {

    // Reverse the infix expression and swap '(' with ')'
    static String reverse(String exp) {
        String reverse = "";
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (c == '(') {
                reverse += ')';
            } else if (c == ')') {
                reverse += '(';
            } else {
                reverse += c;
            }
        }
        return reverse;
    }

    // Precedence function
    static int pre(char c) {
        if (c == '+' || c == '-') return 1;
        else if (c == '*' || c == '/') return 2;
        else if (c == '^') return 3;
        else return -1;
    }

    // Infix to prefix conversion function
    static String infixToPrefix(String exp) {
        Stack<Character> stack = new Stack<>();
        String s = "";
        String reverseString = reverse(exp);

        for (int i = 0; i < reverseString.length(); i++) {
            char c = reverseString.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                s += c;
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    s += stack.pop();
                }
                stack.pop();
            } else { // an operator is encountered
                while (!stack.isEmpty() && pre(c) <= pre(stack.peek())) {
                    s += stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "invalid expression";
            }
            s += stack.pop();
        }

        return reverse(s);
    }

    // Main function
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infixToPrefix(exp));
    }
}
