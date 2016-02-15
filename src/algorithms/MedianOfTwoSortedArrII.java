package algorithms;

public class MedianOfTwoSortedArrII {

	public static void main(String args[]) {
		int arr1[] = {2,4,6,8,11};
		int arr2[] = {3,5,15,16};
		System.out.println("Median is :: " + findMedianSortedArrays(arr1,arr2));

	}

	private static double findMedianSortedArrays() {
		int nums1[] = { 1 };
		int nums2[] = {};
		int arr1Size = nums1.length;
		int arr2Size = nums2.length;
		int totalElements = arr1Size + arr2Size, n;
		n = totalElements / 2;

		int i = 0, j = 0, m1 = 0, m2 = 0;
		boolean flag = true;

		for (int count = 0; count <= n; count++) {

			if (j == arr1Size) {

				m1 = m2;
				m2 = nums2[i];
				i++;
				flag = false;
			} else if (i == arr2Size) {
				m1 = m2;
				m2 = nums1[j];
				j++;
				flag = false;
			} else if (flag) {
				if (nums1[j] < nums2[i]) {
					m1 = m2;
					m2 = nums1[j];
					j++;
				} else {
					m1 = m2;
					m2 = nums2[i];
					i++;
				}
			}

		}
		if (totalElements % 2 == 0)
			return (m1 + m2) / 2.0;
		else {
			return m2;
		}
	}

	public static double findMedianSortedArrays(int[] A, int[] B) {
		int m = A.length, n = B.length;
		int l = (m + n + 1) / 2;
		int r = (m + n + 2) / 2;
		return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
	}

	public static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
		if (aStart > A.length - 1)
			return B[bStart + k - 1];
		if (bStart > B.length - 1)
			return A[aStart + k - 1];
		if (k == 1)
			return Math.min(A[aStart], B[bStart]);

		int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
		if (aStart + k / 2 - 1 < A.length)
			aMid = A[aStart + k / 2 - 1];
		if (bStart + k / 2 - 1 < B.length)
			bMid = B[bStart + k / 2 - 1];

		if (aMid < bMid)
			return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check:
																	// aRight +
																	// bLeft
		else
			return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check:
																	// bRight +
																	// aLeft
	}

}
