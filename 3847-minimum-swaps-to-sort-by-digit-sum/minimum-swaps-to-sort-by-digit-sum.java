class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        // ============ DIRECTION CONFIG ============
        // Problem ke hisaab se flip karo. 4 combinations try karo:
        // (SUM_ASC, VAL_ASC) = (true,  true)  → ascending both
        //                    = (false, false) → descending both
        //                    = (true,  false) → sum asc, value desc
        //                    = (false, true)  → sum desc, value asc
        final boolean SUM_ASC = true;
        final boolean VAL_ASC = true;
        // ==========================================

        long[] keys = new long[n];
        for (int i = 0; i < n; i++) {
            int s = digitSum(nums[i]);

            // sum key: 7 bits (max digit sum 82)
            long sKey = SUM_ASC ? s : (127 - s);   // safe (no overflow)

            // value key: 32 bits, safely normalized to non-negative
            long vKey = VAL_ASC
                ? ((long) nums[i] - Integer.MIN_VALUE)      // 0 .. 2^32-1
                : ((long) Integer.MAX_VALUE - nums[i]);     // reversed

            // Pack: [sum 7][value 32][index 20] = 59 bits
            keys[i] = (sKey << 52) | (vKey << 20) | i;
        }
        Arrays.sort(keys);

        // ---- reverse-stable matching (handles duplicates AND distinct) ----
        Map<Integer, List<Integer>> origsByValue = new HashMap<>();
        Map<Integer, List<Integer>> ranksByValue = new HashMap<>();

        for (int i = 0; i < n; i++)
            origsByValue.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);

        for (int rank = 0; rank < n; rank++) {
            int origIdx = (int)(keys[rank] & 0xFFFFF);
            ranksByValue.computeIfAbsent(nums[origIdx], k -> new ArrayList<>()).add(rank);
        }

        int[] perm = new int[n];
        for (int val : origsByValue.keySet()) {
            List<Integer> origs = origsByValue.get(val);
            List<Integer> ranks = ranksByValue.get(val);
            // reverse matching: last original -> first rank (max cycles)
            for (int i = 0; i < origs.size(); i++)
                perm[origs.get(origs.size() - 1 - i)] = ranks.get(i);
        }

        // ---- count swaps = n - cycles ----
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            while (perm[i] != i) {
                swaps++;
                int v = perm[i];
                perm[i] = perm[v];
                perm[v] = v;
            }
        }
        return swaps;
    }

    private static final int[] DS = new int[100_000];
    static {
        for (int i = 1; i < DS.length; i++) DS[i] = DS[i / 10] + i % 10;
    }

    private static int digitSum(int x) {
        long v = Math.abs((long) x);       // MIN_VALUE safe
        int s = 0;
        while (v >= 100_000) {
            s += DS[(int)(v % 100_000)];
            v /= 100_000;
        }
        return s + DS[(int) v];
    }
}