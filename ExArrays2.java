package Familia28;

import java.util.Scanner;

public class ExArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int[6];
		int somap=0,cont=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um número");
			numeros[x] = leia.nextInt();
		}
		
		for(x=0;x<6;x++)
		{
			if(numeros[x] % 2 ==0)
			{
				System.out.println("\n"+numeros[x]+" números pares: ");
				somap = somap + numeros[x];
			}
			else
			{
				cont++;
				System.out.println("\nNúmeros pares: "+numeros[x]);
			}
		}
		System.out.println("\nSoma dos números pares digitados: "+somap);
		System.out.println("\nQuantidade de números ímpares: "+ cont);
	}

}
