package io.codedifferently;

import java.util.Stack;

public class OpenCloseChecker {
    
    public static void main(String[] args) {

        String str = "a(b)c{d}";
        System.out.println(OpenCloseChecker.Parentheses(str));
    }

    public static boolean Parentheses(String input) {
        Stack<Character> sentence = new Stack<Character>();

        for(int i = 0; i < input.length();i++) {
            char parenth = input.charAt(i);
            
            if(parenth == '(' || parenth == '{' || parenth == '[' || parenth == '<' || parenth == '"') {
                sentence.peek();
            } 
            if(parenth == ')' || parenth == ']' || parenth == '}' || parenth == '>' || parenth == '"') {
				if (sentence.isEmpty()) {
					return false;
                } else if(sentence.peek() == '(' && parenth ==')') {
                    sentence.pop();
                } else if(sentence.peek() == '{' && parenth =='}') {
                    sentence.pop();
                } else if(sentence.peek() == '[' && parenth ==']') {
                    sentence.pop();
                } else if(sentence.peek() == '<' && parenth =='>') {
                    sentence.pop();
                } else if(sentence.peek() == '"' && parenth =='"') {
                    sentence.pop();
                }
            }
        }
        return sentence.isEmpty();
    }

}
