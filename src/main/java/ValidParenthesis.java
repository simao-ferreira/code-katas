import java.util.HashMap;
import java.util.Stack;


//Source for the exercise: https://leetcode.com/problems/valid-parentheses/

public class ValidParenthesis {
    public boolean hasValidParenthesis(String a) {
        Stack<Character> pile = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (char c : a.toCharArray()) {
            if (map.containsKey(c)) {
                if (!pile.isEmpty()) {
                    if (pile.pop() != map.get(c)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (map.containsValue(c)) {
                pile.push(c);
            }
        }
        return pile.isEmpty();
    }
}
