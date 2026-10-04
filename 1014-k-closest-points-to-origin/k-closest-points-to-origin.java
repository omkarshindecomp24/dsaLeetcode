class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (b.getValue() > a.getValue()) {
                        return -1;
                    } else if (b.getValue() < a.getValue()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }

        );
        for (int i = 0; i < points.length; i++) {
            int a = points[i][0];
            int b = points[i][1];
            int c = a * a + b * b;
            hm.put(i, c);
        }
        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
            pq.add(x);
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while (i < k) {

            Map.Entry<Integer, Integer> x = pq.poll();

            ans[i][0] = points[x.getKey()][0];
            ans[i][1] = points[x.getKey()][1];
            i++;
        }
        return ans;

    }
}