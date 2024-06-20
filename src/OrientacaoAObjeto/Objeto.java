package OrientacaoAObjeto;

import OrientacaoAObjeto.Funcionario;

public class Objeto {
    public static void main(String[] args) {
        Funcionario primeiro = new Funcionario();
        primeiro.nome ="antonio";
        primeiro.salario =700;
        primeiro.setor ="highcode";
        primeiro.dataDeEntrada ="23/08/2023";
        primeiro.rgDoFuncionario ="99999999-99";
        primeiro.aumento();
        primeiro.salarioAnual();
    }
}