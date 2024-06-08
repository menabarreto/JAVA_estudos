public class SomaNumerica {
    public static void main(String[]args) {
        int soma = 0;
        int i;
        for (i = 1; i < 1001; ++i) {
            soma += i;
        }
        System.out.println("A soma de 1 a 1000 é igual a " + soma);
    }
}
