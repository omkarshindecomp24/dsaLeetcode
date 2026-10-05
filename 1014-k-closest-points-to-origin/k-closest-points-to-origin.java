class Solution {
    public int[][] kClosest(int[][] points, int k) {
         return solver(points,0,points.length-1,k);
    }

    int[][] solver(int[][] points,int low,int high,int k){
        while(low<=high){
            int x=partition(points,low,high);
              System.out.println(x);
            if(x==k-1){
                int[][] ans=new int[k][2];
                 for(int i=0;i<=x;i++){
                    ans[i][0]=points[i][0];
                     ans[i][1]=points[i][1];
                 }
                 return ans;
            }else if(x>k-1){
                return solver(points,low,x-1,k);
            }else{
              
                return solver(points,x+1,high,k);
            }
        }
        return new int[k][2];
    }

    int partition(int[][] points, int low, int high) {

        int k = dist(points[high]);
        int j = low;
        for (int i = low; i < high; i++) {
            if (dist(points[i]) < k) {
                int[] a = points[i];
                points[i] = points[j];
                points[j] = a;
                j++;
            }
        }
        int[] a = points[high];
        points[high] = points[j];
        points[j] = a;
        return j;

    }

    int dist(int[] a) {
        int l = a[0];
        int m = a[1];
        return l * l + m * m;
    }
}