package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do estado da carga: ");
		int cod_est = sc.nextInt();
		System.out.println("Digite o código da carga: ");
		int cod_car = sc.nextInt();
		System.out.println("Digite o peso da carga em toneladas: ");
		double ton_pes = sc.nextDouble();
		double peso_quilos = ton_pes * 1000;
		if (cod_car >=10 && cod_car<=20) {
			double preço_carga1 = 100 * peso_quilos;
			System.out.println("O preço da carga é: R$" + preço_carga1);
			if (cod_car >=21 && cod_car<=30) {
				double preço_carga2 = 250 * peso_quilos;
				System.out.println("O preço da carga é: R$" + preço_carga1);
				if (cod_car >=31 && cod_car<=40) {
				double preço_carga3 = 340 * peso_quilos;
				System.out.println("O preço da carga é: R$" + preço_carga3);
				double preço_carga4=0;
				double preço_carga5=0;
		if (cod_est ==1) {
			double imposto1 = 35/100*preço_carga1;
			if (cod_est ==2) {
				double imposto2 = 25/100*preço_carga2;
				if (cod_est ==1) {
					double imposto3 = 35/100*preço_carga3;
					if (cod_est ==1) {
						double imposto4 = 35/100*preço_carga4;
						if (cod_est ==1) {
							double imposto5 = 35/100*preço_carga5;
							
						
						}
				       }
		              }
	               }

	     }
        }
	  }
     }
		
}
}

			