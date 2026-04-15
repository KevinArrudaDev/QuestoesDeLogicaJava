/* 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem. 
Ex: 
Nome do Funcionário: Maria do Carmo 
Salário: 1850,45 
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class Q03NomeSalario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Digite o seu nome: ");
        String nomeDigitado = sc.nextLine();
        
        nomeDigitado = nomeDigitado.trim().replaceAll("\\s+", " ");
        
        if (nomeDigitado.isEmpty() || !nomeDigitado.matches("^[\\p{L} .'-]+$") || nomeDigitado.length() > 80) {
            System.out.println("Nome inválido, tente novamente!");
            return;
        }
        
        double salarioDigitado = 0;
        
        try {
            
            System.out.println("Digite o seu salário: ");
            salarioDigitado = sc.nextDouble();
            
            if (salarioDigitado <= 0) {
                System.out.println("Digite apenas números positivos e diferentes de 0!");
                return;
            } 
            
        } catch (InputMismatchException e) {
            System.out.println("Apenas números são válidos!");
            return;
        }
        
        System.out.println("Nome do Funcionário: " + nomeDigitado);
        System.out.println("Salário: " + df.format(salarioDigitado));
        System.out.println("O funcionário " + nomeDigitado + " tem um salário de R$" + df.format(salarioDigitado) + " em Junho.");
        
        
        sc.close();
    }
}