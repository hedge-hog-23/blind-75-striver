class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = new String(count);
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }
        
        return new ArrayList<>(res.values());
    }
}
