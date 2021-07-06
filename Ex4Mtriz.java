package Familia28;

import java.util.Scanner;

public class Ex4Mtriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [][] a = new float [2][2];
		float [][] b = new float [2][2];
		float [][] resultado = new float [2][2];
		int l,c,valor=0,op;
		
		Scanner leia = new Scanner(System.in);
		
		//recortado
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor de A: ");
				a[l][c] = leia.nextFloat();
				System.out.println("\nEntre com o valor de B: ");
				a[l][c] = leia.nextFloat();
			}
		}
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1-Somar as duas matrizes");
			System.out.println("\n2-Subtrair a primeira matriz da segunda");
			System.out.println("\n3-Adcionar uma constante as duas matrizes");
			System.out.println("\n4-Imprimir as duas matrizes");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
		switch(op)

	{
			case 1:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						resultado[l][c] = a[l][c] + b[l][c];
						System.out.println("\nResultado da soma: "+resultado[l][c]);
					}
				}
				break;
			case 2:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						resultado[l][c] = a[l][c] - b[l][c];
						System.out.println("\nResultado da subtração: "+resultado[l][c]);
					}
				}
				break;
			case 3://colado
				System.out.println("\nEntre com um valor da constante: ");
				valor = leia.nextInt();
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						
						a[l][c] = a[l][c] + valor;
						System.out.println("\nConstante somada a matriz A: "+a[l][c]);
						a[l][c] = b[l][c] + valor;
						System.out.println("\nConstante somada a matriz B: "+b[l][c]);
					}
				}
				break;
			case 4:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						
						a[l][c] = a[l][c] + valor;
						System.out.println("\nMatriz A: "+a[l][c]);
						
						System.out.println("\nMatriz B: "+b[l][c]);
					}
				}
				break;
				default:
					System.out.println("\nOpção inválida...");
	}
	}
	}
