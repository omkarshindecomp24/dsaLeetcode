class Solution {
    public int[][] kClosest(int[][] points, int k) {
      //  HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> dist(b)-dist(a)

        );
        for (int i = 0; i < points.length; i++) {
          pq.add(points[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
       while(i<k){
        int[] x=pq.poll();
        ans[i][0]=x[0];
        ans[i][1]=x[1];
        i++;
       }

        return ans;

    }
    int dist(int[] a){
        int k=a[0];
        int l=a[1];
        return k*k+l*l;
    }
}