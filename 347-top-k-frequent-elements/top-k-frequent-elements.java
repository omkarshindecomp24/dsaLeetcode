class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> ans=new PriorityQueue<>((a,b)->
             a.getValue()- b.getValue()
        );
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> x:hm.entrySet()){
            ans.add(x);
            if(ans.size()>k){
                ans.poll();
            }
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=ans.poll().getKey();
        }
        return arr;
    }
}