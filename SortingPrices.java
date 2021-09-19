package com.assignment2;

public class SortingPrices {

	// **************ASCENDING MERGE SORT*****************

	public void ascendingSort(double price[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			ascendingSort(price, low, mid);
			ascendingSort(price, mid + 1, high);
			ascendingMerge(price, low, mid, high);
		}
	}

	public void ascendingMerge(double price[], int low, int mid, int high) {
		int i = low;
		int k = low;
		int j = mid + 1;
		double aux_array[] = new double[high + 1];
		while (i <= mid && j <= high) {
			if (price[i] > price[j]) {
				aux_array[k] = price[j];
				k++;
				j++;
			} else {
				aux_array[k] = price[i];
				k++;
				i++;
			}
		}
		while (i <= mid) {
			aux_array[k] = price[i];
			k++;
			i++;
		}
		while (j <= high) {
			aux_array[k] = price[j];
			k++;
			j++;
		}
		for (int a = low; a <= high; a++) {
			price[a] = aux_array[a];
		}

	}

	// ************DESCENDING MERGE SORT******************

	public void descendingSort(double price[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			descendingSort(price, low, mid);
			descendingSort(price, mid + 1, high);
			descendingMerge(price, low, mid, high);
		}
	}

	public void descendingMerge(double price[], int low, int mid, int high) {
		int i = low;
		int k = low;
		int j = mid + 1;
		double aux_array[] = new double[high + 1];
		while (i <= mid && j <= high) {
			if (price[i] > price[j]) {
				aux_array[k] = price[i];
				k++;
				i++;
			} else {
				aux_array[k] = price[j];
				k++;
				j++;
			}
		}
		while (i <= mid) {
			aux_array[k] = price[i];
			k++;
			i++;
		}
		while (j <= high) {
			aux_array[k] = price[j];
			k++;
			j++;
		}
		for (int a = low; a <= high; a++) {
			price[a] = aux_array[a];
		}

	}

}
