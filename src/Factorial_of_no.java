import java.util.Scanner;
public class Factorial_of_no {
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for(int i = num; i>0; i--){
            sum = sum*i;
        }
        System.out.println("factorial of "+num+ " is "+ sum);

    }
}
