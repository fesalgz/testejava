package com.felipe;

import java.util.Scanner;

public class main{

     public static void main(String args[]) {
         Scanner ler = new Scanner(System.in);
         int num1, num2, num3, num4, quant;
         float media;

         //SOut com escrita e leitura de dados, pedindo a quantidade de notas para tirar a média.

         escrever("Olá, bem vindo ao programa para tirar média de notas\n" +
                 "Digite a quantidade de notas para calcular a média (no min. 2 e no máx. 4 notas):");
         quant = ler.nextInt();

         //Criação do switch-case para a quantidade de notas à tirar a média, com o Sout para exibir a média.

         switch (quant) {
             case 2:
                escrever("Digite a primeira nota:");
                num1 = ler.nextInt();
                escrever("Digite a segunda nota:");
                num2 = ler.nextInt();

                escrever("Calculando a média!");
                media = (num1 + num2)/2;
                escrever("A média das suas 2 notas é:" + media);
                break;
             case 3:
                 escrever("Digite a primeira nota:");
                 num1 = ler.nextInt();
                 escrever("Digite a segunda nota:");
                 num2 = ler.nextInt();
                 escrever("Digite a terceira nota:");
                 num3 = ler.nextInt();

                 escrever("Calculando a média!");
                 media = (num1 + num2 + num3)/3;
                 escrever("A média das suas 3 notas é:" + media);
                 break;
             case 4:
                 escrever("Digite a primeira nota:");
                 num1 = ler.nextInt();
                 escrever("Digite a segunda nota:");
                 num2 = ler.nextInt();
                 escrever("Digite a terceira nota:");
                 num3 = ler.nextInt();
                 escrever("Digite a quarta nota:");
                 num4 = ler.nextInt();

                 escrever("Calculando a média!");
                 media = (num1 + num2 + num3 + num4)/4;
                 escrever("A média das suas 4 notas é:" + media);
                 break;
             default:
                 escrever("Digite uma quantidade válida. (Min. 2 notas / Máx. 4 notas.)");
             return;
         }

     }
     //Método para chamar o sout print (para não precisar escrever o codigo toda hora).
    public static void escrever (String a){
         System.out.println(a);
     }


}
