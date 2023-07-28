package pacote;
import java.util.Scanner;
public class LesmasProblem {

	public static void main(String[] args) {
//Problema: utilize a estrutura do switch / case para formular uma quest�o / resposta conforme descrito abaixo:
//Quest�o 01: Indique, entre as op��es abaixo, um animal considerado invertebrado:
//(a) lesmas
//(b) ostras
//(c) cachorro
//(d) gato
//caso o valor indicado da alternativa esteja correto, deve ser apresentado na tela "alternativa correta" e a pontua��o de valor 1 dever� ser atribu�da.
//Caso contr�rio, deve ser apresentado na tela "alternativa errada" e o valor zero dever� ser atribu�do na pontua��o.
//Se o usu�rio escolher um valor de alternativa diferente das quatro op��es apresentadas o resultado apresentado deve ser: "alternativa n�o existe".
	
	 Scanner sc = new Scanner(System.in); // C�DIGO PARA PEGAR DADOS DO CONSOLE.	
		 
	 
	 char resposta; // DEFININDO VARI�VEIS.
	 int pontuacao;
	 
	 System.out.println("Quest�o 01: Indique, entre as opções abaixo, um animal considerado invertebrado:"
	            + "\n (a) Lesmas"
				+ "\n (b) Moluscos"
				+ "\n (c) Cachorro"
				+ "\n (d) Gato"
		        + "\n\n Responda aqui-> ");  
	 
	 resposta = sc.next().charAt(0);
	 
	
	switch(resposta){     
		    case 'a': case 'b':
	        pontuacao = 1;
	    	System.out.println ("Alternativa correta!!! Sua pontuação é " + pontuacao + ".") ;
		 		
		break;
	   		
	    case 'c': case 'd':
			pontuacao = 0;
		   System.out.println ("Alternativa incorreta!!! Sua pontuação é " + pontuacao + "." );
			break;			
	    
	    
	    default:
	    	System.out.print("Alternativa não existe!!!");
	     break;
	
		    	}	
	
	   sc.close();
	
	}

}
