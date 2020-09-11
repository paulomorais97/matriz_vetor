package ListaExe;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		final int LINHA =2, COLUNA=2;
		double [][] matrizA = new double[LINHA][COLUNA];
		double [][] matrizB = new double[LINHA][COLUNA];
		double [][] matrizC = new double [LINHA][COLUNA];
		int linha, coluna, opcao=0;
		System.out.print("\tMATRIZ A: ");
		for(linha=0;linha<LINHA;linha++) {
			for(coluna=0;coluna<COLUNA;coluna++) {
				System.out.print("\nPosição ["+linha+"] ["+coluna+"]: ");
				matrizA[linha][coluna] = ler.nextDouble();
			}
			System.out.println("\n");
		}
		System.out.print("\tMATRIZ B: ");
		for(linha=0;linha<LINHA;linha++) {
			for(coluna=0;coluna<COLUNA;coluna++) {
				System.out.print("\nPosição ["+linha+"] ["+coluna+"]: ");
				matrizB[linha][coluna] = ler.nextDouble();
			}
			System.out.println("\n");
		}
		
		System.out.println("Qual opção você deseja realizar?");
		System.out.println("\t(1) somar as duas matrizes \n\t(2) subtrair a primeira matriz da segunda"
				+ "\n\t(3) adicionar uma constante as duas matrizes\n\t(4) imprimir as matrizes");
		opcao=ler.nextInt();
		
		switch(opcao) {
		case 1:
			
			for(linha=0;linha<LINHA;linha++) {
			
				for(coluna=0;coluna<COLUNA;coluna++) {
					matrizC[linha][coluna]=matrizA[linha][coluna]+matrizB[linha][coluna];
				}
			}
			System.out.println("\nSoma das Matrizes A & B");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizC[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
			break;
		case 2:
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					matrizC[linha][coluna]=matrizA[linha][coluna]-matrizB[linha][coluna];
				}
			}
			System.out.println("\nSubtração das Matrizes A & B");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizC[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
			break;
		case 3:
			final double A;
			final double B;
			System.out.println("Digite o valor a ser inserido na Matriz A: ");
			A = ler.nextDouble();
			System.out.println("Digite o valor a ser inserido na Matriz B: ");
			B = ler.nextDouble();
			
			
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					matrizA[linha][coluna] += A;
					matrizB[linha][coluna]+= B;
				}
			}
			System.out.println("\n\tMatriz A");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizA[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
			System.out.println("\n\tMatriz B");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizB[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
			break;
			
		case 4:System.out.println("\tMATRIZ A");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizA[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
			System.out.println("\n\tMatriz B");
			for(linha=0;linha<LINHA;linha++) {
				
				for(coluna=0;coluna<COLUNA;coluna++) {
					System.out.print("\t["+matrizB[linha][coluna]+"]\t");
				}
				System.out.println("\n");
			}
		
			break;
		}
		ler.close();
		
	}

}
