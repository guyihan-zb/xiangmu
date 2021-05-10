import java.util.*;
public class Main{
    static int count;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] x=new int[n];
            for(int i=0; i<n; i++)
                x[i]=input.nextInt();
            Arrays.sort(x);
            count=0;
            isNumbers(x, 0, 0, 1);
            System.out.println(count);
        }
    }
    public static void isNumbers(int[] x, int index, int num, int mul){
        if(index!=0){
            if(num>mul)
                count++;
            else if(num<mul)
                return;
        }
        for(int i=index; i<x.length; i++){
            num+=x[i];
            mul*=x[i];
            isNumbers(x, i+1, num, mul);
            num-=x[i];
            mul/=x[i];
            while(i<x.length-1 && x[i]==x[i+1])
                i++;
        }
    }
}