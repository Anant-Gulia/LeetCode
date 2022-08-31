class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int gr1=Integer.MIN_VALUE;
        int gr2=Integer.MIN_VALUE;
        int gr3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i:nums) {
            if(i>=gr1) {
                gr3=gr2;
                gr2=gr1;
                gr1=i;
            }
            else if(i>=gr2) {
                gr3=gr2;
                gr2=i;
            }
            else if(i>=gr3) {
                gr3=i;
            }
            if(i<=min1) {
                min2=min1;
                min1=i;
            }
            else if(i<=min2) {
                min2=i;
            }
        }
        return Math.max(gr1*gr2*gr3,min1*min2*gr1);
    }
}