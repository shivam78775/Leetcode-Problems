class FindClosest {

    //Find Closest Person
    public int findClosest(int x, int y, int z) {
        int stepX =0, stepY=0;
        if(x<z)
            stepX = z-x;
        else if(x>z)
            stepX = x-z;
        else
            stepX =0;
        
        if(y<z)
            stepY = z-y;
        else if(y>z)
            stepY = y-z;
        else
            stepY =0;

        if(stepX  > stepY)
            return 2;
        else if(stepX < stepY)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        FindClosest fc = new FindClosest();
        System.out.println(fc.findClosest(1, 2, 3)); // Output: 2
        System.out.println(fc.findClosest(3, 2, 1)); // Output: 2
        System.out.println(fc.findClosest(1, 3, 2)); // Output: 0
    }
}