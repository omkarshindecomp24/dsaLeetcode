class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
         HashMap<Integer,Integer> hm2=new HashMap<>();
         int count1=0,count2=0;
        for(int x:nums1){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
          for(int x:nums2){
            hm2.put(x,hm2.getOrDefault(x,0)+1);
        }
        for(int x:hm.keySet()){
            if(hm2.containsKey(x)){
                count1+=hm.get(x);
                count2+=hm2.get(x);
            }
        }
        return new int[]{count1,count2};
    }
}