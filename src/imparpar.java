import java.util.Scanner;
public class imparpar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int valor = scanner.nextInt();
        if(valor % 2 ==0){
            System.out.println("o numero "+valor+" é par");
        }
        else{
            System.out.println("O numero "+valor+" é impar");
        }
    }
}
