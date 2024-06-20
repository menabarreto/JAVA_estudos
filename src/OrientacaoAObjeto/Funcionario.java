package OrientacaoAObjeto;

public class Funcionario {
   public String nome;
   public String setor;
   public double salario;
   public String dataDeEntrada;
   public String rgDoFuncionario;
   void aumento() {
      Double valorDoAumento = ((this.salario * 10) / 100);
      System.out.println(salario + valorDoAumento);
   }
   void salarioAnual(){
      double ganhosAnuais=this.salario*12;
      System.out.println(ganhosAnuais);

   }
}