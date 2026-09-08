class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
           Map.Entry<Character, Integer> entry = list.get(i);
           for (int j = 0; j < entry.getValue(); j++) {
               result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}