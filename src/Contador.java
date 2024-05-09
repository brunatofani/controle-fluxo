import java.util.Scanner;
import java.io.*;


public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try { 
            //chamando o método csontendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosExceptions exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiroParametrosInvalidosExceptions
             exception.printStackTrace();
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExceptions();
        }
        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for (int i=0; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+ i);
        }
      
    }
}
