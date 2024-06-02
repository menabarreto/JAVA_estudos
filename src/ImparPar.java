import java.util.Scanner;
public class ImparPar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int valor = scanner.nextInt();
        if(valor % 2 ==0){
            System.out.println("par");
        }
        else{
            System.out.println("ímpar");
        }
    }
}
