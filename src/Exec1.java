

//import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
       
    Mensagem.mensagem(2);
    Calculadora.soma(34, 45);
    Calculadora.subtracao(56, 32);
    Calculadora.multiplicacao(4, 6);
    Calculadora.divisao(32, 12);
        
    Emprestimo.calcular(45000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(45000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(45000, 6);
}
}