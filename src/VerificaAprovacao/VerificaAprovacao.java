package VerificaAprovacao;

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Verificação da aprovação
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media <= 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Recuperação!");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
