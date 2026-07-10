class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        return new ArrayList<>(
            Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    // Create the sorted string key for each element
                    char[] charArray = s.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }))
                .values()
        );
    }
}
/*
How It Works:
1. Arrays.stream(strs): Converts your input string array into a Stream of strings.

2. Collectors.groupingBy(...): Operates exactly like a SQL GROUP BY. It builds a Map<String, List<String>> behind the scenes.

3. The Lambda Function: For every string s in the stream, it sorts the characters to create a unique anagram key. The stream automatically pushes strings with identical keys into the same list.

4. .values(): Extracts just the grouped lists from the map, which are then wrapped in a new ArrayList to match the expected return type.*/