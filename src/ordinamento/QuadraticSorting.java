package ordinamento;
public class QuadraticSorting {

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
					Utils.scambia(v, i - 1, i);
					scambiAvvenuti = true;
				}
			}
			if (!scambiAvvenuti)
				break;

			fine--;
			// Scansione da dx verso sx
			for (int i = fine; i > inizio + 1; i--) {
				if (v[i - 1] > v[i]) {
					Utils.scambia(v, i - 1, i);
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
					Utils.scambia(v, i, i + passo);
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
	 * Questa versione lavora "parallelamente" sulle colonne. Non serve l'indice dell'elemento?
	 * @param v
	 */
	public static void shellSort(int[] col, int[] v) {
		int i,j,k,h,t;
		for(k=0; k<col.length; k++) {
			h=col[k];
			for(i=h; i<v.length; i++) {
				t=v[i];
				j=i;
				while(j>=h && v[j-h]>t) {
					j=j-h;
				}
				v[j]=t;
			}
		}
	}
	
	
	/**
	 * TODO da documentare
	 */
	public static void shellSort2(int[] col, int[] v) {
		int i,j,k,h,t;
		for(k=0; k<col.length; k++) {
			h=col[k];
			for(int ell=0; ell<= h-1; ell++) {
				for(i=h+ell; i<v.length; i=i+h) {
					t=v[i];
					j=i;
					while(j>=h && v[j-h]>t) {
						j=j-h;
					}
					v[j]=t;
				}
			}
		}
	}	
	
	
	/**
	 * Versione ricorsiva dell'insertion sort
	 * @param v
	 * @param n Parametro per ricorsione. Indica la posizione limite su cui operare.
	 */
	public static void insertionSortRicorsivo(int[] v, int n) {
		if(n>1) {
			insertionSortRicorsivo(v,n-1);
		}
		int value = v[n-1];
		int j = n-1;
		while(j >= 1 && v[j-1]>value) {
			v[j] = v[j-1];
			j=j-1;
		}
		v[j]=value;
	}
	
	
	/**
	 * Selection sort: per ogni elemento cerco nell'array l'elemento minimo e se lo trovo lo metto in prima posizione.
	 * @param v Array da ordinare
	 */
	public static void selectionSort(int[] v) {
		int i,j,min;
		for(i=0; i<=v.length-2;i++) {
			min=i;
			for(j=i+1;j<=v.length-1;j++) {
				if(v[j]<min) {
					min=j;
				}
			}
			if(min!=i) Utils.scambia(v,i,min);
			
		}
	}
	
	
	/**
	 * Selection sort ricorsivo
	 * @preview 
	 */
	public static void selectionSortRicorsivo(int[] v, int i, int n) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
