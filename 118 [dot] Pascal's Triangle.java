class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==1){
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> firstRow = new ArrayList<Integer>();
            firstRow.add(1);
            ans.add(firstRow);
            return ans;
        }
        List<List<Integer>> pascalTriangle = generate(numRows-1);
        List<Integer> parentRow = pascalTriangle.get(pascalTriangle.size()-1);
        List<Integer> newRow = new ArrayList<Integer>();
        newRow.add(1);

        for(int i=0; i<parentRow.size()-1; i++){
            newRow.add(parentRow.get(i)+parentRow.get(i+1));
        }
        newRow.add(1);
        pascalTriangle.add(newRow);
        return pascalTriangle;
    }
}