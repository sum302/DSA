class Solution {
    public int[] twoSum(int[] numbers, int k) {

        int ans[] = new int[2];

        int i = 0, j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum < k) {
                i++;
            } 
            else if (sum > k) {
                j--;
            } 
            else {
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}