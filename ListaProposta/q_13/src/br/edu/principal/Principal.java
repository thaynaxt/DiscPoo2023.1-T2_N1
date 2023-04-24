package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
        double aumento1 = 0.05; 
        double aumento2 = 0.1; 
        double aumento3 = 0.15; 
        String clas1 = "barato"; 
        String clas2 = "normal"; 
        String clas3 = "caro"; 
        String clas4 = "muito caro"; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        
        
        if (preco <= 50) {
            preco *= (1 + aumento1);
        } else if (preco <= 100) {
            preco *= (1 + aumento2);
        } else {
            preco *= (1 + aumento3);
        }
        
        
        String classificacao;
        if (preco <= 80) {
            classificacao = clas1;
        } else if (preco <= 120) {
            classificacao = clas2;
        } else if (preco <= 200) {
            classificacao = clas3;
        } else {
            classificacao = clas4;
        }
        
        // Exibindo o novo preço e a classificação do produto
        System.out.println("O novo preço do produto é: R$" + preco);
        System.out.println("A classificação do produto é: " + classificacao);
    }
}