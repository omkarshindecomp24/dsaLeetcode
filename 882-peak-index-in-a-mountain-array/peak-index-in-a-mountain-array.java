class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,n=arr.length,high=n-1,mid=-1;
        while(low<=high){
              mid=low+(high-low)/2;
              if(  low==high || mid==low || mid==high ||    (mid+1<n && mid-1 >-1 && arr[mid+1]<arr[mid] && arr[mid-1]<arr[mid])){
                if(mid==high)return arr[mid]>arr[low]?mid:low;
                if(mid==low)return arr[mid]>arr[high]? mid: high;
                return mid;
              }else{
                   if( mid+1<n && mid-1 >-1 && arr[mid+1]<arr[mid] && arr[mid-1]>arr[mid]){
                    high=mid-1;
                   }else  if( mid+1<n && mid-1 >-1 &&  arr[mid+1]>arr[mid] && arr[mid-1]<arr[mid]){
                    low=mid+1;
                   }
              }
            }
return -1;
        }
}