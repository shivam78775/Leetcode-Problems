public class leetcode {
    public static int minSwaps(String s) {
        int stack = 0; // Initialize stack counter to keep track of unbalanced '['
        
        // Loop through each character in the string
        for(char c: s.toCharArray()) {
            if(c == '[') {
                // If character is '[', increment stack (an open bracket)
                stack ++;
            } else {
                // If character is ']', check if there is an unmatched '['
                if(stack > 0) {
                    // If stack is positive, decrement it (balance the brackets)
                    stack --;
                } 
                // If no unmatched '[', we skip, as no need to increase stack for extra ']'
            }
        }

        // If stack is even, we need half that many swaps to balance (each swap fixes 2 brackets)
        // If odd, adding one ensures an even number for swapping.
        return stack % 2 == 0 ? stack / 2 : (stack + 1) / 2;
    }
    public static void main(String[] args) {
        String s = "]]][[[";

        int result = minSwaps(s);
        
        System.out.println(result);
    }
}
