public class countHiddenSequences {

        public int numberOfArrays(int[] differences, int lower, int upper) {
            long min_val = 0;
            long max_val = 0;
            long curr_val = 0;
    
            for(int ele : differences){
                curr_val += ele;
                min_val = Math.min( min_val, curr_val);
                max_val = Math.max( max_val, curr_val);
            }
            
            long count = (upper - lower) - (max_val - min_val) + 1;
            return count > 0  ? (int) count : 0;
    
        }
        public static void main(String[] args) {
            countHiddenSequences obj = new countHiddenSequences();
            int[] differences = {1, -3, 4};
            int lower = 1;
            int upper = 6;
            System.out.println(obj.numberOfArrays(differences, lower, upper)); // Output: 2
        }
    
}
