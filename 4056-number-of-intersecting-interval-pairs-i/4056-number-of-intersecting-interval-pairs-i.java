class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;

        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        long intersectingPairs = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            // Remove intervals that ended before starts[i]
            while (j < n && ends[j] < starts[i]) {
                j++;
            }

            // j intervals have already ended before starts[i].
            // i intervals have started before or at this point.
            intersectingPairs += i - j;
        }

        return (int)intersectingPairs;
    }
}