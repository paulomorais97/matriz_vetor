package ListaExe;

public class Exe1 {

	public static void main(String[] args) {

		int[] a = {1,0,5,-2,-5,7};
		int linha, soma=0, p0=0,p1=0,p5=0;
		
		System.out.println("Vetor A: ");
		 for(linha=0;linha<6;linha++) {
			 System.out.print("["+a[linha]+"]");
		 }
		 System.out.println("\n\nVetor Modificado: ");
		 for(linha=0;linha<6;linha++) {
			 System.out.print("["+a[linha]+"]");
			 p0 = a[0];
			 p1 =a[1];
			 p5 =a[5];
			 
			 a[4]=100;
		 }
		 soma=p0+p1+p5;
		 System.out.println("\n\nSoma das possições A[0], A[1] e A[5]: "+soma);
		
	}

}
