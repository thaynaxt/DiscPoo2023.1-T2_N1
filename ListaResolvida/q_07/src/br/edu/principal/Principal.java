package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  int I;
	      double A;
	      double B;
	      double C; 
	      Scanner sc = new Scanner (System.in);
	      System.out.println ("***************ORDEM CRESCENTE, DECRESCENTE OU MAIOR NÚMERO NO MEIO, DE 3 VALORES*********************");
	      System.out.println (" ");
		    System.out.println ("Digite um valor para A:");
		    A = sc.nextDouble();
		    System.out.println ("Digite um valor para B:");
		    B = sc.nextDouble();
		    System.out.println ("Digite um valor para C:");
		    C = sc.nextDouble();
		    System.out.println ("Digite um número sendo 1=ordem crescente 2=ordem decrescente 3= número maior no meio (1, 2 OU 3):");
		    I = sc.nextInt();
		    
		      if (I==1){
		    	 if (B<A && B<C) {
		    		if(A<C) {System.out.println ("A ordem crescente dos números é:"+ B + "-" + A + "-" +C);
		    		} else  { System.out.println ("A ordem crescente dos números é:"+ B + "-" + C + "-" +A);}
		         }
		      
		    	else if (A<B && A<C) {
		    		    if(B<C) {System.out.println ("A ordem crescente dos números é:"+ A + "-" + B + "-" +C);
		    	       } else  { System.out.println ("A ordem crescente dos números é:"+ A + "-" + C + "-" +B);}
		       }
		       else if (C<A && C<B) {
	   		        if(A<B) {System.out.println ("A ordem crescente dos números é:"+ C + "-" + A + "-" +B); 
	   		        } else  { System.out.println ("A ordem crescente dos números é:"+ C + "-" + B + "-" +A);}
		       }

		     }
		      
		      if (I==2){
			    	 if (A>B && A>C) {
			    		if(B>C) {System.out.println ("A ordem decrescente dos números é:"+ A + "-" + B + "-" +C);
			    		} else  { System.out.println ("A ordem crescente dos números é:"+ A + "-" + C + "-" +B);}
			    }
			      
			    	else if (B>A && B>C) {
			    		   if(A>C) {System.out.println ("A ordem decrescente dos números é:"+ B + "-" + A + "-" +C);
			    	      } else  {System.out.println ("A ordem decrescente dos números é:"+ B + "-" + C + "-" +A);}
			    	}
			    
			       else if (C>A && C>B) {
		   		          if(A>B) {System.out.println ("A ordem decrescente dos números é:"+ C + "-" + A + "-" +B); 
		   		        }  else  { System.out.println ("A ordem decrescente dos números é:"+ C + "-" + B + "-" +A);}
			       }

			  }
		      
		      if (I==3) {
		    	    if (A>B && A>C){ System.out.println ("A ordem desejada é:"+ B + "-" + A + "-" +C);
		          }
		    	    if (B>A && B>C){ System.out.println ("A ordem desejada é:"+ A + "-" + B + "-" +C);
		  	      }
		    	    if (C>A && C>B){ System.out.println ("A ordem desejada é:"+ A + "-" + C + "-" +B);
		  	      }
		    
		      }    
	}
}