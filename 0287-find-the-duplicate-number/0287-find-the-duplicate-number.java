class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();
       for (int num : nums) {
    if (freqMap.containsKey(num)) {
        freqMap.put(num, freqMap.get(num) + 1);
    } else {
        freqMap.put(num, 1);
    }
   }
   for (int num : nums) {
    if (freqMap.get(num) > 1) {
        return num;
    }
}
return 0;
  }
}