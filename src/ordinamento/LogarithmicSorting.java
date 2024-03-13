package ordinamento;

public class LogarithmicSorting {
	
	/**
	 * Quicksort con perno
	 * @param A Array da ordinare
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] A, int left, int right) {
		if(left >= right) {
			return;
		}
		int i = partition(A, left, right);
		quickSort(A, left, i-1);
		quickSort(A, i+1, left);
		return;
	}
	
	
	
	
	
	
	/**
	 * Metodo partition ritorna l'indice dell'elemento perno che divede l'array in due sottovettori
	 * @param args
	 */
	public static int partition(int[] A, int left, int right) {
		int perno=A[right];
		int i = left;
		int j = right-1;
		while(true) {
			while(A[i]<perno) {
				i++;
			}
			while(A[j]>perno && j>left) {
				j--;
			}
			if(i>=j) break;
		}
		Utils.scambia(A, i, right);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
