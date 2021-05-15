class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m-1, last2 = n-1, last = m+n-1;
        while(last1>=0 && last2>=0){
            nums1[last--]=(nums1[last1]>nums2[last2])?nums1[last1--]:nums2[last2--];
        }
        if(last2<last1){
            while(last1>=0){
                nums1[last--]=nums1[last1--];
            }
        } else{
            while(last2>=0){
                nums1[last--]=nums2[last2--];
            }
        }
    }
}