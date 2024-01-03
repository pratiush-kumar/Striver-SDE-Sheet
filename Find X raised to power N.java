public class Solution {
    public static double myPow(double x, int n) {
        // Write Your Code Here
        if(n==0){
            x = 1;
            return x; 
        }
        else if(n<0){
            x = 1/x;
            n = -1*n;
        }
        int pow = 1;
        double temp = x;
        while(pow<n){
            x = x*x;
            pow = pow+pow;
            if(pow==n){
                return x;
            }
            if(pow*pow>n){
                break;
            }
        }
        while(pow<n){
            x = x*temp;
            pow++;
        }
        return x;
    }
}