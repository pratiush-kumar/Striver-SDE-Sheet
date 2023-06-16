class Solution {
    public void mergeSortedIntervals(int[][] intervals, int start, int mid, int end){
        List<int[]> mergedList = new ArrayList<int[]>();
        int itr1 = start;
        int itr2 = mid;
        while(itr1<mid || itr2<end){
            if(itr1<mid && itr2<end){
                if(intervals[itr1][0]<intervals[itr2][0]){
                    mergedList.add(intervals[itr1]);
                    itr1++;
                }
                else if(intervals[itr1][0]>intervals[itr2][0]){
                    mergedList.add(intervals[itr2]);
                    itr2++;
                }
                else{
                    if(intervals[itr1][1]<=intervals[itr2][1]){
                        mergedList.add(intervals[itr1]);
                        itr1++;
                    }
                    else if(intervals[itr1][1]>intervals[itr2][1]){
                        mergedList.add(intervals[itr2]);
                        itr2++;
                    }
                }
            }
            else if(itr1<mid){
                mergedList.add(intervals[itr1]);
                itr1++;
            }
            else {
                mergedList.add(intervals[itr2]);
                itr2++;
            }
        }
        for(int i=0; i<mergedList.size(); i++){
            intervals[start+i] = mergedList.get(i);
        }
        return;
    }
    public void sortIntervals(int[][] intervals, int start, int end){
        if(start>=end-1){
            return;
        }
        int mid = (start+end)/2;
        sortIntervals(intervals, start, mid);
        sortIntervals(intervals, mid, end);
        mergeSortedIntervals(intervals, start, mid, end);
        return;
    }
    public void print(int[][] intervals){
        for(int i=0; i<intervals.length; i++){
            for(int j=0; j<intervals[i].length; j++){
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] merge(int[][] intervals) {
        sortIntervals(intervals, 0, intervals.length);
        List<int[]> answer = new ArrayList<int[]>();
        int[] currentInterval = intervals[0];
        for(int i=0; i<intervals.length; i++){
            if(currentInterval[1]<intervals[i][0]){
                answer.add(currentInterval);
                currentInterval = intervals[i];
            }
            else{                
                currentInterval[1] = currentInterval[1]>intervals[i][1]?currentInterval[1]:intervals[i][1];
            }
        }
        answer.add(currentInterval);
        int[][] answerArray = new int[answer.size()][2];
        for(int i=0; i<answer.size(); i++){
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}