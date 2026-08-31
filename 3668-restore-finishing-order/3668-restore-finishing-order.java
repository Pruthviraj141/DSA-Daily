class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();

int[] ans = new int[friends.length];

int cnt =0;
        for(int i : friends){
            set.add(i);
        }

        for(int i : order){
            if(set.contains(i)){
                ans[cnt++]=i;
            }
        }
        return ans;
    }
}