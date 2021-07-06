package Familia28;

import java.util.Scanner;

public class ArrayVetorMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45};
		float[] nota = new float[5];
		
		Scanner leia = new Scanner(System.in);
		
		//length, informa o tamanho do array
		if(arrayDois.length >8) 
		{
			System.out.println("Tamanho do ArrayDois é MAIOR QUE 8!");
		}
		else
		{
			System.out.println("Tamanho do ArrayDois é MENOR QUE 8!");
		}
		
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		
		//**** utilizando FOR-EACH
		String[] cars = {"\nVolvo", "", "Ford", "Mazda"};
		
		for(String i : cars)
		{
			System.out.println(i);
		}
		
		
		//**** populando um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i] = leia.nextFloat();
		}
		
		//**** apresentando um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Nota "+i+" = "+nota[i]);
		}

	}

}
