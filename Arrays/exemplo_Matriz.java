package Arrays;

import java.util.Scanner;

public class exemplo_Matriz {

	public static void main(String[] args) {
		int mat [][] = new int[3][3];
		int l,c,soma=0;
		
		Scanner ler = new Scanner(System.in);
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.print("Digite um n�mero: ");
				mat[l][c]=ler.nextInt();
				soma+=mat[l][c];
			}
		}
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.print(mat[l][c]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n A soma �: "+ soma);

	}

}
