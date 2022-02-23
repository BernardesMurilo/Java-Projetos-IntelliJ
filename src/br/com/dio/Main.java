package br.com.dio;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos
 */
public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(5000, 2);
        Emprestimo.calcular(3500, 3);
        Emprestimo.calcular(5000, 5);

    }

}
