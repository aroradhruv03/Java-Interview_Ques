package DataStructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Dhruv
 * @version 1.0
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
 */
public class BalancedString {
    static Stack<String> stack;

    public static void main(String []argh)
    {
        boolean balanced;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            stack = new Stack<>();
            balanced = true;
            String input = sc.next();
            //Complete the code
            String arr[] = input.split("");
            for(int i=0; i < arr.length; i++)
            {
                switch(arr[i]){
                    case "(":
                    case "{":
                    case "[": stack.push(arr[i]);; break;
                    case ")":
                    case "}":
                    case "]":   if(!stack.empty()) // Only pop when empty
                        balanced = pop(arr[i]);
                    else
                        balanced = false;
                        break;
                    default: break;
                }
                if(!balanced)
                    break;
            }
            if(!stack.empty())
                balanced=false;

            System.out.println(balanced);
        }
    }

    static boolean pop(String s)
    {
        // Only Pop if it's equivalent is present on stack top
        if(s.equals("}") && stack.peek().equals("{"))
            stack.pop();
        else if(s.equals(")") && stack.peek().equals("("))
            stack.pop();
        else if(s.equals("]") && stack.peek().equals("["))
            stack.pop();
        else
            return false;
        return true;
    }
}
