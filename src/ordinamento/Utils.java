package ordinamento;

public class Utils {
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
}
