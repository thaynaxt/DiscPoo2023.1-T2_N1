package br.edu.principal;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		int valortotal=0;
		double desc=0;
		double novototal=0;
		
		Scanner sc = new Scanner (System.in);
	    System.out.println ("Digite o código do produto (1 a 40):");
	    int codpro = sc.nextInt();
	    System.out.println ("Digite a quantidade comprada do produto:");
	    int quanpro = sc.nextInt();
	    
	
	    
	   if (codpro>=1 && codpro<=10) {
		   System.out.println ("Preço unitário do produto: R$10,00");
		    valortotal= 10*quanpro;
		    System.out.println ("Valor total da nota: R$"+ valortotal);
	   }
	   
	   else if (codpro>=11 && codpro<=20) {
		   System.out.println ("O preço unitário do produto:R$15,00");
		    valortotal= 15*quanpro;
		    System.out.println ("Valor total da nota: R$"+ valortotal+",00");
	   }
		
	   else if (codpro>=21 && codpro<=30) {
		   System.out.println ("Preço unitário do produto:R$20,00");
		    valortotal= 20*quanpro;
		    System.out.println ("Valor total da nota: R$"+ valortotal+",00");
	   }
	    
	   else if (codpro>=31 && codpro<=40) {
		   System.out.println ("Preço unitário do produto:R$30,00");
		     valortotal= 30*quanpro;
		    System.out.println ("Valor total da nota: R$"+valortotal+",00");
	   }
		
	
	   if (valortotal<250) {
	    desc=valortotal*0.05;
	   novototal= valortotal-desc;
	   System.out.println ("Desconto: R$"+desc);
	   }
		
	   else if (valortotal>=250 && valortotal<=500) {
		    desc=valortotal*0.10;
		   novototal= valortotal-desc;
		   System.out.println ("Desconto: R$"+desc);
		   System.out.println ("Valor total com desconto: R$"+novototal);
		   }

	   else if (valortotal>=500) {
		    desc=valortotal*0.15;
		   novototal= valortotal-desc;
		   System.out.println ("Desconto:R$"+desc);
		   System.out.println ("Valor total com desconto:R$"+novototal);
		   }

	}

}
