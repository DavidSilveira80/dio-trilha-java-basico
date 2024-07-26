package desafioContador;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = Integer.parseInt(entrada.nextLine());

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println(e);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O Segundo Parâmetro deve ser Maior que o Primeiro Parâmetro.");
        }else{
            int contagem = parametroDois - parametroUm;
            System.out.println("Deverão de ocorrer " + contagem + " ciclos.");
            for(int contador=1; contador <= contagem; contador++){
                System.out.println(contador);

            }
        }
    }
}
