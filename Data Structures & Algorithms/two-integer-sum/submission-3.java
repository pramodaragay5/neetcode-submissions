class Solution {
    public int[] twoSum(int[] A, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<A.length; i++){
            int find = target - A[i];
            if (hm.containsKey(find)){
                return new int [] {hm.get(find), i};
            } else hm.put(A[i], i);
        }
         return new int []{-1,-1};
    }
}
