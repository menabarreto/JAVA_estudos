import java.util.Scanner;
public class Multiplos2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();
        for(int i=1;i<101;++i){
            if(i % numero==0){
                System.out.println("O numero "+i+" é multiplo de "+numero);
            }else{
            }
        }
    }
}