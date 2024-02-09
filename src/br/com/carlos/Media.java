package br.com.carlos;

import java.util.Scanner;

public class Media {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Informe a nota do aluno");
            double nota = s.nextDouble();
             media = (nota * i) / i;
        }
        System.out.println("A média do aluno é: " + media);
        System.out.println(verificaAprovacao(media));
    }

    public static String verificaAprovacao(double media) {
        String resultado = "";
        if (media >= 7) {
            resultado = "Aluno Aprovado!";
        } else if (media >= 5) {
            resultado = "Aluno em Recuperação";
        } else {
            resultado = "Aluno Reprovado";
        }
        return resultado;
    }

}
