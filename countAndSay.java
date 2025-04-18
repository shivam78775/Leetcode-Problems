class CountAndSay {
        //38. Count and Say
        //The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
        // countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.

        public String countAndSay(int n) {
            String res = "1";
            for (int i = 1; i < n; i++) {
                StringBuilder temp = new StringBuilder();
                int count = 1;
                for (int j = 1; j < res.length(); j++) {
                    if (res.charAt(j) == res.charAt(j - 1)) {
                        count++;
                    } else {
                        temp.append(count).append(res.charAt(j - 1));
                        count = 1;
                    }
                }
                temp.append(count).append(res.charAt(res.length() - 1));
                res = temp.toString();
            }
            return res;
        }
    
    public static void main(String[] args) {
        CountAndSay cas = new CountAndSay();
        int n = 5;
        System.out.println(cas.countAndSay(n)); // Output: "111221"
    }
}
