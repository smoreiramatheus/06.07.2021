package Familia28;

import java.util.Scanner;

public class ExemploArray3 {

//preencha um array do tipo matriz 3x3 e calcule a média dos valores
// e o somatório da diagonal principal.
//oque fazer: soma dos valore  média e tirar o somatório diagonal	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] valor = new float[3][3];
		float somavalor=0,mediavalor,somadiagonal=0;
		int linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0;linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um valor: ");
				valor[linha][coluna] = leia.nextFloat();
				
				somavalor = somavalor + valor[linha][coluna];
				
				if(linha == coluna)
				{
					somadiagonal = somadiagonal + valor[linha][coluna];
				}
			}
		}
		mediavalor = somavalor / 9;
		System.out.println("\nSomatório da diagonal proncipal: "+somadiagonal);
		System.out.println("\nMédia dos valores: "+mediavalor);


	}

}
