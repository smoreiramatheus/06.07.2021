package Familia28;

import java.util.Scanner;

public class ExemploArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que leia as m�dias dos alunos e calcule a m�dia geral
		
		float [] media = new float[4];
		float somamedia=0, mediageral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nEntre com a sua m�dia: ");
			media[x] = leia.nextFloat();
			
			somamedia = somamedia +media[x];
		}
		mediageral = somamedia / 4;
		System.out.printf("\nM�dia geral: %2.2f", mediageral);
	}

}
