package br.edu.principal;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    System.out.println ("Digite um número para vermos qual o menor:");
	    double n1 = sc.nextDouble();
	    System.out.println ("Digite o outro número para a comparação:");
	    double n2 = sc.nextDouble();
 
	    
	    if (n1<n2) {
	    	System.out.println ("O número "+ n1+" é menor que "+n2+".");
	    } else {
	    	System.out.println ("O número "+ n2+" é menor que "+n1+".");
	    }
	    
	}

}
