public class leetcode {

     // Method to find the minimum number of additions required to make a string of parentheses valid
     public static int minAddToMakeValid(String s) {
        // 'openBrackets' keeps track of unmatched '(' (opening brackets)
        int openBrackets = 0;
        
        // 'extraClosingBrackets' counts unmatched ')' (closing brackets)
        int extraClosingBrackets = 0;

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is '(', increment openBrackets
            if (c == '(') {
                openBrackets++;
            } else {  // If the character is ')'
                // If there are unmatched opening brackets, close one of them
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    // Otherwise, this is an extra closing bracket that doesn't have a match
                    extraClosingBrackets++;
                }
            }
        }

        // The total number of additions needed is the sum of unmatched opening and unmatched closing brackets
        return openBrackets + extraClosingBrackets;
    }
    public static void main(String[] args) {
        String s = "((((())";

        int result = minAddToMakeValid(s);
        
        System.out.println(result);
    }
}
