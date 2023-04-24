package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println(" Menu de cargos: \n 1; \n 2; \n 3; \n 4; \n 5. \n Digite o número do código do cargo do funcionário:");
		int cargo = sc.nextInt();
	System.out.println(" Digite o valor do salário: ");
		double sal = sc.nextDouble();
		
		double aumento1 = sal * 50 / 100;
		double sal1 = sal + aumento1;
		double aumento2 = sal * 35 / 100;
		double sal2 = sal + aumento2;
		double aumento3 = sal * 20 / 100;
		double sal3 = sal + aumento3;
		double aumento4 = sal * 10 / 100;
		double sal4 = sal + aumento4;
		double aumento5 = sal * 0 / 100;
		double sal5 = sal + aumento5;
		
		if(cargo==1) {
		System.out.println(" O cargo é Escrituário.\n O valor do aumento é: R$"+ aumento1 +"\n O novo salário é: R$"+sal1);
		}
		else if(cargo==2) {
			System.out.println(" O cargo é Secretário.\n O valor do aumento é: R$"+ aumento2 +"\n O novo salário é: R$"+sal2);
			}
		else if(cargo==3) {
			System.out.println(" O cargo é Caixa.\n O valor do aumento é: R$"+ aumento3 +"\n O novo salário é: R$"+sal3);
			}
		else if(cargo==4) {
			System.out.println(" O cargo é Gerente.\n O valor do aumento é: R$"+ aumento4 +"\n O novo salário é: R$"+sal4);
			}
		else if(cargo==5) {
			System.out.println(" O cargo é Diretor.\n O valor do aumento é: R$"+ aumento5 + "(não tem aumento)" +"\n O novo salário é: R$"+sal5);
			}
	else {
			System.out.println("Cargo inexistente.");
		}
	}

}
