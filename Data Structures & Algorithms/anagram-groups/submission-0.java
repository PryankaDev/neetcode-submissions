class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map to store: SortedString -> List of original Anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Sort the string to create the unique key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            
            // If the key doesn't exist, create a new list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            // Add the original string to its matching key list
            map.get(sortedKey).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}
