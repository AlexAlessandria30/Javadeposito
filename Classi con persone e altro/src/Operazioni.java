
public class Operazioni {

	public void sommaCost(int b) {

		int A = 100;
		int somma = A + b;
		System.out.println(somma);
		
	}
	public void somma(int a, int b) {

		
		int somma = a + b;
		System.out.println(somma);
	}
	
	
	public int addizione (int c , int d) {
		
		int somma = c + d;
		
		return somma;
		
	}
	

	public void maxArray(int[] a) {

		int maxNum = a[0];

		for (int j : a) {
			if (j > maxNum)
				maxNum = j;
		}

		System.out.println(maxNum);
	}
	
	
	public void array (int [] f ) {
		for(int val:f) {
			System.out.println(val);
		}
		
	}
	
	public int [] dammiArray() {
		
		int [ ] d = {12,32,54,34,4};
		return d;
		
	}

}
