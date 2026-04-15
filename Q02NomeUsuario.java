/* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
vindas para ela: 
Ex: 
Qual é o seu nome? João da Silva 
Olá João da Silva, é um prazer te conhecer! */

import java.util.Scanner;

public class Q02NomeUsuario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nomeDigitado = sc.nextLine();
        
        nomeDigitado = nomeDigitado.trim().replaceAll("\\s+", " ");
        
        if (nomeDigitado.isEmpty() || !nomeDigitado.matches("^[\\p{L} .'-]+$") || nomeDigitado.length() > 80) {
            System.out.println("Nome inválido, tente novamente!");
        } else {
            System.out.println("Olá " + nomeDigitado + ", é um prazer te conhecer!");
            
        }
        
        sc.close();
    }
}