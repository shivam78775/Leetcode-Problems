import java.util.HashMap;

class NumRabbits {
    //781. Rabbits in Forest
    // Given an array answers where answers[i] is the number of rabbits that answered i questions, return the minimum number of rabbits that could be in the forest.
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> groupFreq = new HashMap<>();
        int count = 0;

        for (int ele : answers) {
            if (ele == 0) {
                count++;
            } else {
                groupFreq.put(ele, groupFreq.getOrDefault(ele, 0) + 1);
                if (groupFreq.get(ele) == ele + 1) {
                    count += ele + 1;
                    groupFreq.put(ele, 0);
                }
            }
        }

        for (int key : groupFreq.keySet()) {
            int freq = groupFreq.get(key);
            if (freq > 0) {
                count += key + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumRabbits numRabbits = new NumRabbits();
        int[] answers = {1, 1, 2};
        System.out.println(numRabbits.numRabbits(answers)); // Output: 5
    }
}
