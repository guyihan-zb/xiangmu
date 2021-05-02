import java.util.*;
 
public class BinInsert {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        if(i<j)
            return 0;
        int flagm=1;
        int flagn=1;
        flagn=flagn<<j;
        //int count=1;
        while(flagm!=0){
            if((flagm & m)!=0){
                n=(n|flagn);
            }
            flagn=flagn<<1;
            flagm=flagm<<1;
            
        }
        return n;
    }
     
}