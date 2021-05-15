import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int monthCount=sc.nextInt();
            System.out.println(getTotalCount1(monthCount));
            //System.out.println(getTotalCount2(monthCount));
        }
    }
    //迭代版本
    private static int getTotalCount1(int monthCount) {
        if(monthCount==1||monthCount==2){
            return 1;
        }
        int first=1;
        int second=1;
        int sum=0;
        //从第三个月开始算起
        for(int i=2;i<monthCount;i++){
            sum=second+first;
            first=second;
            second=sum;
        }
        return sum;
    }
    //递归版本
    private static int getTotalCount2(int monthCount) {
        if(monthCount==1||monthCount==2){
            return 1;
        }
        //这里是倒着算的,不影响结果,因为算的次数是相同的
        return getTotalCount2(monthCount-1)+getTotalCount2(monthCount-2);
    }
}