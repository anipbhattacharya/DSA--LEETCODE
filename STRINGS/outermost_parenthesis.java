public class outermost_parenthesis{
    
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (level > 0) {
                    result.append(c);
                }
                level++;
            } else { 
                level--;
                if (level > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String output = removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
