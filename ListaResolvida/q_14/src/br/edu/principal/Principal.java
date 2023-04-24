package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		    System.out.println("\n ------ VALOR DO SALÁRIO COM BONIFICAÇÃO E AUXÍLIO ------ \n");
			Scanner sc = new Scanner (System.in);
		    System.out.println ("Informe o valor do sálario:");
		    double sal= sc.nextDouble();
		    double boni= 0;
		    double aux= 0;
		    if (sal<= 500) {
		    	boni = sal*5/100;
		}
		    else if (sal>500 && sal<=1200) {
	            boni = sal*12/100;
	}
		    else if (sal>1200) {
		        boni= 0;
		    }
		    if(sal<=600) {
		      aux = 150;
		    }
		    else if(sal>600) {
		      aux = 100;
		    }
		    double novosal= sal + boni + aux;
	     System.out.println("O valor do salário com a bonificação e auxílio escola fica: " + novosal);

	}

}
