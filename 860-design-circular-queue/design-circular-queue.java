class MyCircularQueue {

      int[] arr;
      int size=0;
      int front=0;
      int rare=-1;
      int limit=0;
    public MyCircularQueue(int k) {
        arr=new int[k];
        limit=k;
        Arrays.fill(arr,-1);
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        rare=(rare+1)%limit;
        arr[rare]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        front=(front+1)%limit;
        size--;
        return true;


        
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return arr[front];
        
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return arr[rare];
        
    }
    
    public boolean isEmpty() {
        if(size==0){
            front =0;
            rare=-1;
            return true;
        }
        return false;
        
    }
    
    public boolean isFull() {
        if(size==limit){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */