class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            // intk=nums1[i]
            pq.add(Math.abs(nums1[i] - nums2[i]));
        }
        int k = k1 + k2, j = 0,t=0,p=0;
        int arr[] = new int[100001];
        while (!pq.isEmpty()) {
             t = pq.poll();
            arr[t]++;
            // pq.add(t);
        }
      t=100000;
        while (t >-1 && k != 0) {
            while (t > -1 && arr[t] == 0) {
                t--;
            }
            if (t>-1 && k >= arr[t]) {
                k -= arr[t];
                 p = arr[t];
                arr[t] = 0;
            }else if(t>-1 && k<arr[t]){
                arr[t]=arr[t]-k;
                p=k;
                k=0;
            }
           if(t>0) arr[t-1] += p;
           t--;
        }
        long sum = 0;
        for(int i=0;i<100001;i++){
            sum+=(long)arr[i]*i*i;
        }
        
        return sum;
    }
}