package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário: ");
		double sal = sc.nextDouble();
		double sal2 = sal + (sal * 50 / 100);
		double sal3 = sal + (sal * 40 / 100);
		double sal4 = sal + (sal * 30 / 100);
		double sal5 = sal + (sal * 20 / 100);
		double sal6 = sal + (sal * 10 / 100);
		double sal7 = sal + (sal * 05 / 100);
		
		if (sal <= 300) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal2);
		}
		else if (sal > 300 && sal <=500) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal3);
		}
		else if (sal > 500 && sal <=700) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal4);
		}
		else if (sal > 700 && sal <=800) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal5);

		}
		else if (sal > 800 && sal <=1000) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal6);
		}
		else if (sal > 1000) {
			System.out.println("Com o aumento, o novo salário fica: R$" + sal7);
		}
	}
}