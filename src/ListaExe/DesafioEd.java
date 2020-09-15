package ListaExe;

import java.util.Random;

public class DesafioEd {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		final int LINHA = 3, COLUNA=3;
		int matriz[][] = new int[LINHA][COLUNA];
		int l, c, soma=0, total=0;
		
		System.out.println("\t-----MATRIZ 3x3-----");
		for(l=0;l<LINHA;l++) {
			for(c=0;c<COLUNA;c++) {
				
				matriz[l][c] = r.nextInt(10);
				System.out.print("\t["+matriz[l][c]+"]");
				
				total+=matriz[l][c];
				if (l==c) {
					soma+=matriz[l][c];
				}
			}
			System.out.print("\n");
		}
		System.out.print("\nSoma dos valores da matriz é: "+total);
		System.out.print("\nSoma da diagonal principal é: "+soma);
	}

}
