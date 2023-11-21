import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int num=1;
        for(int row=1;row <= n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
