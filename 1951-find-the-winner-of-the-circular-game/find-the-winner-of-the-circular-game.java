class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        int count=0;
        while(q.size()!=1){
            count++;
            if(count==k){
                q.poll();
                count=0;
            }else{
                q.offer(q.poll());  
            }
        }
        return q.peek();
    }
}