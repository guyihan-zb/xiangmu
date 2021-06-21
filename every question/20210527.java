import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            //要求保留小数，所以用float强转
            float result = ((float)fenzi(n) / (float)fenmu(n) * 100);
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
	//求分母，也就是全排列的总数
    public static int fenmu(int n){
        if(n == 1){
            return 1;
        }
        return n * fenmu(n - 1);
    }
    //求分子，也就是错排数
    public static int fenzi(int n){
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }else {
            return (n - 1) * (fenzi(n - 2) + fenzi(n - 1));
        }
    }
}