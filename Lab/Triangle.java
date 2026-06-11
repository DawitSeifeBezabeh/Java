import java.util.Scanner;
public class Triangle {
    public static void main(String args[]){
        Scanner kbr = new Scanner(System.in);
        System.out.println("Enter a size of triangle from 1 to 50: ");
        int num = kbr.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-1; i >= 1 ; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
}