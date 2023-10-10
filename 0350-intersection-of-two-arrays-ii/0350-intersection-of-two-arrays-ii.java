class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0,p2=0;
        List<Integer> al=new ArrayList<>();
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]==nums2[p2]){
                al.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        System.out.println(al);
        int ind=0;
        int[] ar=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ar[ind++]=al.get(i);
        }
        return ar;
    }
}