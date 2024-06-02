import java.util.Scanner;
public class somateste2 {
    public static void main(String[]args){
        Scanner enterScanner = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.println("Digite o primeiro valor");;
        valor1 = enterScanner.nextInt();
        System.out.println("Digite o segundo valor");;
        valor2 = enterScanner.nextInt();
        int resultado;
        resultado = (valor1 + valor2);

        System.out.println("SOMA = "+resultado);;


    }
}
