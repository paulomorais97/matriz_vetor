package ListaExe;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Classificacao {

	public static void main(String[] args) {
	/*
	 * Fazer dois vetores, um com 4 posições e outro com 3 posições. 
	 *		 No primeiro vetor coloque a lista de times na ordem (Corinthians, Palmeiras, Santos e São Paulo).
	 * 		
	 * 		 No segundo, a pontuação (3, 1 ou 0). Serão três rodadas.
	 *  	
	 *  	 A cada rodada, cada time que ganha, ganha 3 pontos, se empata 1 e se perde nenhum ponto. 
	 *  	
	 *  	 Mostre a lista de times e pontos em ordem a cada rodada. 
	 *  	
	 *  	 No final coloque uma opção para selecionar o time e saber sua posição e pontuação.
	 */

		Scanner ler = new Scanner(System.in);
		
		String vTimes[] = {"Corinthians", "Palmeiras","Santos", "São Paulo"};
		int resultado[]=new int[4];
		int aux[]= new int [4];
		int i, j, k,l, time=0;
		final int RODADAS =3, TIMES=4;
		
		System.out.println("Lista de times: ");
		for(String x : vTimes) { System.out.println("\t"+x); }
		
		
		for(i=0;i<RODADAS;i++) 
		{			
			for(j=0;j<TIMES;j++) 
			{	int opcao;
				System.out.println("--------------------------------------");
				System.out.println((i+1)+"º rodada ");
				System.out.println("O "+ vTimes[j]+" ganhou, empatou ou perdeu? ");
				System.out.println("1- Ganhou | 2 - Empatou | 3 - Perdeu");
				opcao=ler.nextInt();
				
				if(opcao == 1) {	
					resultado[j]+=3;
				}
				else if(opcao==2) {
					resultado[j]+=1;
				}
				else if(opcao==3) {
					resultado[j]+=0;
				}	
			}
			
			for(k=0;k<vTimes.length;k++) {
				for(l=0;l<resultado.length;l++) {
					if(vTimes.equals(resultado));
				}
				System.out.print(vTimes[k]+"-->");
				System.out.println(resultado[k]);
			}	
	}
		/*
		 //Ordena o vetor string
		Set<String> set = new TreeSet<String>();
		
		for (String x : vTimes) {
			set.add(x);
		}
		
		for (String string : set) {
			System.out.print(string + " ");
		}
		/*System.out.println("----------------------\n");
		for(k=0;k<resultado.length;k++) {
			
			for(l=0;l<resultado.length;l++)
			{
				if(resultado[k]>resultado[l])
				{
					auxiliar = resultado[k];
					resultado[k]=resultado[l];
					resultado[l]=auxiliar;
				}
			}	
		
		}*/
		
		 System.out.println("\nDigite seu time : \n1-Corinthians | 2-Palmeiras | 3-Santos | 4-São Paulo");
		 time=ler.nextInt();
		 
		 
		 if(time==1) {
			 System.out.println(vTimes[0]+"-->"+resultado[0]);
		 }
		 else if(time==2) {
			 System.out.println(vTimes[1]+"-->"+resultado[1]);
		 }
		 else if(time==3) {
			 System.out.println(vTimes[2]+"-->"+resultado[2]);
		 }
		 else if(time==4) {
			 System.out.println(vTimes[3]+"-->"+resultado[3]);
		 }
		
		
				
		
		ler.close();
	}

}
