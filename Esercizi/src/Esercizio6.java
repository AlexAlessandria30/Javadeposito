

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) 
	{
		int valore;
		
		boolean controllo=true;
		
			
		
		Scanner in = new Scanner(System.in);
		
		while(controllo)
		{
			try
			{
				System.out.println("1- Ordinamento Array");
				System.out.println("2- Valore massimo in un array");
				System.out.println("3- Fatture");
				System.out.println("4- Ciclo For");
				System.out.println("5- primo esempio Array");
				System.out.println("6- costutto for-each");
				System.out.println("7- For nidificato");
				System.out.println("8- FINE");	
				System.out.println("Effettua una scelta");
				
				String scelta = in.nextLine();
				valore = Integer.parseInt(scelta);
				
				switch(valore)
				{
				case 1:
					int[] valori={10,34,1,7,2};
					System.out.println("Array senza ordinamento");
					for(int contenuto:valori)
					{
						System.out.println(contenuto);
					}
					System.out.println("Array Crescente");
					int app=0;
					
					
					for(int x=0;x<=4;++x)
					{
						for(int y=x+1;y<=4;y++)
						{
							if(valori[x]>=valori[y])
							{
								app=valori[x];
								valori[x]=valori[y];
								valori[y]=app;
							}
						}
						
						System.out.println(valori[x]);
					}

					break;
				case 2:
					int[] sequenza = new int[10];
					System.out.println("Inserire 10 numeri");
					for(int x=0;x<=9;x++)
					{
						sequenza[x]=Integer.parseInt(in.nextLine());
					}
					int appoggio=0;
					for(int xy=0;xy<=9;++xy)
					{
						for(int z=xy+1;z<=9;z++)
						{
							if(sequenza[xy]<=sequenza[z])
							{
								appoggio=sequenza[z];
								sequenza[z]=sequenza[xy];
								sequenza[xy]=appoggio;
							}
						}
							
					}
					System.out.println("Il valore massimo inserito �: "+sequenza[0]);
					System.out.println("Il valore minimo inserito �: "+sequenza[9]);
					break;
				case 3:
					System.out.println("Archivio Fatture");
					break;
				case 4:
					String nome2="Mario Rossi";
					String A = nome2.substring(6,11);
					System.out.println(A);
					int tot = nome2.length();
					for(int var = 0;var<=tot;++var)
					{
						System.out.println(nome2.substring(var,var+1));
						//System.out.println("Valore: "+var);
					}
					break;
				case 5:
					int[] mesi;
					mesi = new int[13];
					int totmesi=12;
					for(int conta=1;conta<=totmesi;conta++)
					{
						mesi[conta]=conta;
						//System.out.println("mesi["+conta+"]="+conta);
					}
					for(int vararray:mesi)
					{
						System.out.println(vararray);
					}
					
					String[] nome={"pippo","pluto","paperino","topolino"};
					int l = 3;
					for(int conta=1;conta<=l;conta++)
					{
						System.out.println(nome[conta]);
					}
					break;
				case 6:
					String[] persone={"giovanni","pietro","aldo","giacomo"};
					for(String campi:persone)
					{
						System.out.println(campi);
					}
					break;
				case 7:
					int i;
					for(i=1;i<=5;++i) {
						for(int z=1;z<=10;++z) {
							System.out.print((i*z)+" ");
							if(z==10) {
								System.out.println();
							}
						}
					}
					break;
				case 8:
					System.out.println("TERMINA");
					controllo=false;
					break;					
				}
			}
			catch(Exception e)
			{
				System.out.println("Inserire un numero");
			}
		}		
	}
}
