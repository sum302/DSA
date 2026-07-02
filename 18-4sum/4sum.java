class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        // Set of lists to remove duplicate quadruplets
        Set<List<Integer>> setOfList = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Set to store the elements visited so far in the inner loop
                Set<Long> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k];
                    long fourth = (long) target - sum;

                    if (seen.contains(fourth)) {
                        // Found a match
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        
                        // Sort the list so identical combinations form identical lists
                        Collections.sort(temp);
                        setOfList.add(temp);
                    }
                    // Add current element to seen
                    seen.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(setOfList);
    }
}