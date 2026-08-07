class Solution {
    public int[] twoSum(int[] A, int target) {

        int n = A.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<n; i++){
            int find = target - A[i];

            if (hm.containsKey(find)){
                return new int [] {hm.get(find), i};
            }
                hm.put(A[i], i);
        }
         return new int []{-1,-1};
    }
}
