import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int element1 = v[0];
        int element2 = v[0];
        int count1 = 1;
        int count2 = 0;
        for(int i=1; i<v.length; i++){
            if(v[i]==element1){
                count1++;
            }
            else if(v[i]==element2){
                count2++;
            }
            else{
                if(count1==0){
                    element1 = v[i];
                    count1 = 1;
                }
                else if(count2==0){
                    element2 = v[i];
                    count2 = 1;
                }
                else{
                    count1--;
                    count2--;
                }
            }
        }
        count1=0;
        count2=0;
        for(int i=0; i<v.length; i++){
            if(v[i]==element1){
                count1++;
            }
            else if(v[i]==element2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        if(count1>(v.length/3)){
            ans.add(element1);
        }
        if(count2>(v.length/3)){
            ans.add(element2);
        }
        return ans;
    }
}