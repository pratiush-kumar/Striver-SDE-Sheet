public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
        int element = v[0];
        int count =0;
        for(int i=0; i<v.length; i++){
            if(v[i]==element){
                count++;
            }
            else if(count==0){
                element = v[i];
                count = 1;
            }
            else{
                count--;
            }
        }
        return element;
    }
}