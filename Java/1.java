class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] r = new int[2];
        for(int i=0; i<nums.length; i++) {
            int t = target-nums[i];
            if(hashMap.containsKey(t)) {
                r[0] = hashMap.get(t);
                r[1] = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return r;
    }
}