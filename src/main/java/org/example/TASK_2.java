/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * * Input: s = "(]"
 * Output: false
 *
 */


package org.example;

import java.util.Stack;

public class TASK_2 {
    public static boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for (char k : s.toCharArray()) {
            if (k == '(' || k == '{' || k == '[') {
                leftSymbols.push(k);
            }
            else if (k == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (k == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (k == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("()");
        System.out.println(isValid("()"));
        System.out.println();
        System.out.println("()[]{}");
        System.out.println(isValid("()[]{}"));
        System.out.println();
        System.out.println("(]");
        System.out.println(isValid("(]"));
      }
}
