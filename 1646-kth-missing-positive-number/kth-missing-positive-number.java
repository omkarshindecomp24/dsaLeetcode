class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        int mis = 0, mid = 0;
        if (arr[h] - h - 1 == 0)
            return arr[h] + k;
        if (arr[l] > 1 && arr[l] - l - 1 >= k)
            return k;
        while (l <= h) {

            mid = l + (h - l) / 2;
            mis = arr[mid] - mid - 1;
            if (mis < k)
                l = mid + 1;
            else if (mis >= k)
                h = mid - 1;
        }
        mis = k - arr[h] + h + 1;
        return arr[h] + mis;
    }
}