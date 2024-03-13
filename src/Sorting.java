
public class Sorting {

	/**
	 * Variante del bubble sort che opera bidirezionalmente da sx verso dx e
	 * viceversa. Questo perché se avessimo numeri molto piccoli a dx, questi ad
	 * ogni iterazione guadagnerebbero solo qualche posizione.
	 * 
	 * @param v Array da ordinare.
	 */
	public static void shakerSort(int[] v) {
		int inizio = 0;
		int fine = v.length - 1;
		for (int j = 1; j <= v.length - 1; j++) {
			boolean scambiAvvenuti = false;
			// Scansione da sx verso dx
			for (int i = inizio + 1; i <= fine; i++) {
				if (v[i - 1] > v[i]) {
					scambia(v, i - 1, i);
					scambiAvvenuti = true;
				}
			}
			if (!scambiAvvenuti)
				break;

			fine--;
			// Scansione da dx verso sx
			for (int i = fine; i > inizio + 1; i--) {
				if (v[i - 1] > v[i]) {
					scambia(v, i - 1, i);
					scambiAvvenuti = true;
				}
			}
			if (!scambiAvvenuti)
				break;

			inizio++;
		}
	}

	/**
	 * TODO da documentare
	 * 
	 * @param v Array da ordinare.
	 */
	public static void combSort(int[] v) {
		int passo = v.length;
		boolean scambiAvvenuti = false;
		while (passo > 1 || scambiAvvenuti == true) {
			if (passo > 1) {
				passo = (int) (passo / 1.25);
			}
			scambiAvvenuti = false;
			for (int i = 0; i + passo <= v.length - 1; i++) {
				if (v[i] > v[i + passo]) {
					scambia(v, i, i + passo);
					scambiAvvenuti = true;
				}
			}
		}
	}

	/**
	 * TODO da documentare
	 * 
	 * @param v Array da ordinare.
	 */
	public static void insertionSort(int[] v) {
		int i, j, t;
		for (i = 1; i <= v.length - 1; i++) {
			t = v[i];
			j = i;
			while (j >= 1 && v[j - 1] > t) {
				v[j] = v[j - 1];
				j--;
			}
			v[j]=t;
		}
	}
	
	/**
	 * Metodo che permette di inserire un numero nell'array mantenendolo ordinato sempre.
	 * @param v
	 * @param n
	 * @param k
	 */
	public static void ins(int v[], int n, int k) {
		//V è già ordinato crescente
		//Inserire k in v mantenendo l'ordinamento
		int j = n;
		while(j>0 && k<v[j-1]) {
			v[j]=v[j-1];
			j--;
		}
		v[j] = k;
	}
	
	/**
	 * Si sfrutta il metodo precedente
	 * @param v
	 * @param dim
	 */
	public static void insertionSort2(int[] v, int dim) {
		for(int i=1; i<dim; i++) {
			ins(v, i, v[i]);
		}
	}
	
	/**
	 * 
	 * @param v
	 */
	public static void shellSort(int[] v) {
		
	}
	
	

	/**
	 * Scambia gli elementi in posizione index1 e index2 all'interno dell'array v.
	 * 
	 * @param v      Array su cui effettuare lo scambio
	 * @param index1 Indice elemento 1.
	 * @param index2 Indice elemento 2.
	 */
	public static void scambia(int[] v, int index1, int index2) {
		int temp = v[index1];
		v[index1] = v[index2];
		v[index2] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
