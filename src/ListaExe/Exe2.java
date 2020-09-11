package ListaExe;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[6];
		int linha;
		int  somaPar=0, impar=0, quantImpar=0;
		
		for(linha=0;linha<6;linha++) {
			System.out.printf("Posição [%d] ", linha);
			vetor[linha] = ler.nextInt();
			}
			System.out.println("\nVetor: ");
		for(int i : vetor) {	System.out.print("["+i+"]");	}
		
		System.out.println("\n\nNúmeros pares digitados: ");
		
		for(linha=0;linha<6;linha++) {

			if((vetor[linha]%2)==0) {
				
					System.out.print("\t"+vetor[linha]);
		
				      somaPar+=vetor[linha];
			} 
		}
			System.out.println("\nNúmeros ímpares digitados: ");
			for(linha=0;linha<6;linha++) {
				if(vetor[linha]%2==1) {
					quantImpar++;
					System.out.print("\t"+vetor[linha]);	
				}
			}		
		System.out.print("\nSoma dos números pares digitados: "+somaPar);
		System.out.print("\nQuantidade de número ímpares digitados: "+quantImpar);
		
		ler.close();
	}

}
