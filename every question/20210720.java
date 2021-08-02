//数值的整数次方

public class Solution {
    public double Power(double base, int exponent) {
        double temp1=1,temp2=1;
        if(exponent > 0){
            for(int i=exponent;i>0;i--){
                temp1 *= base;
            }
            return temp1;
        }else{
            for(int i=exponent;i<0;i++){
                temp2 *= base;
            }
            return 1/temp2;
        }
  }
}