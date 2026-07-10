    class Solution {
        public List<Integer> spiralOrder(int[][] mat) {
        int rowstart = 0;
        int rowend = mat.length - 1;
        int colstart = 0;
        int colend = mat[0].length - 1;
        ArrayList<Integer> res = new ArrayList<>();

        while(rowstart <= rowend && colstart <= colend){

            for(int i = colstart ; i <= colend; i++){
                res.add(mat[rowstart][i]);
            }
            rowstart++;

            for(int i = rowstart; i<=rowend; i++){
                res.add(mat[i][colend]);
            }
            
            colend--;

            if(rowstart <= rowend){
                for(int i = colend; i >= colstart; i--){
                    res.add(mat[rowend][i]);
                }
                rowend--;
            }
                        if (colstart <= colend) {
                    for (int j = rowend; j >= rowstart; j--) {
                        res.add(mat[j][colstart]);
                    }
                    colstart++;
                }

            

        }
        return res;
        }
    }