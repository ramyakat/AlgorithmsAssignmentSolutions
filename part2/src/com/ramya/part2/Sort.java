package com.ramya.part2;

public class Sort {
	public static void merge(double[] notes, int left, int right, int mid) {
		int len1 = mid - left + 1;
		int len2 = right - mid;

		int i, j, k;
		double[] leftArr = new double[len1];
		double[] rightArr = new double[len2];

		for (i = 0; i < len1; i++)
			leftArr[i] = notes[left + i];

		for (j = 0; j < len2; j++)
			rightArr[j] = notes[mid + 1 + j];

		i = 0;
		j = 0;
		k = left;

		while (i < len1 && j < len2) {
			if (leftArr[i] > rightArr[j]) {
				notes[k] = leftArr[i];
				i++;
			} else {
				notes[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < len1) {
			notes[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < len2) {
			notes[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public static void sorttechnique(double[] notes, int left, int right) {
		if (left >= right)
			return;
		int mid = (left + right) / 2;

		sorttechnique(notes, left, mid);
		sorttechnique(notes, mid + 1, right);

		merge(notes, left, right, mid);
	}

	public static void sort(double[] notes) {
		sorttechnique(notes, 0, notes.length - 1);
	}

}
