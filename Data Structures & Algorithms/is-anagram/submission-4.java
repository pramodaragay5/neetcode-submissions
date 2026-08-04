class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        int count = 0;
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hs.put(ch, hs.getOrDefault(ch, 0)+1);
        }

        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(!hs.containsKey(ch)) return false;

            hs.put(ch, hs.get(ch)-1);

            if(hs.get(ch) < 0) return false;
        }
            return true;
    }
}
