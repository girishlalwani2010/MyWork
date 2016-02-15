public class Test {

	private String[] array;
	private String[] tempMergArr;
	private int length;

	public static void main(String args[]) {
		String[] startAndEndTimeArr = { "6AM#8AM", "11AM#1PM", "7AM#3PM",	
				"7AM#10AM", "10AM#12PM", "2PM#4PM", "1PM#4PM", "8AM#9AM" };
		// 6AM#8AM, 8AM#9AM, 7AM#10AM, 11AM#1PM, 7AM#3PM, 2PM#4PM, 1PM#4PM,
		// 10AM#12PM
		Test test = new Test();
		test.sort(startAndEndTimeArr);
		int endTime, startTime;
		int maxProfit = 500;
		endTime = test.calculateEndTime(startAndEndTimeArr[0]);
		for (int i = 0; i < startAndEndTimeArr.length - 1; i++) {
			startTime = test.calculateStartTime(startAndEndTimeArr[i + 1]);
			if (startTime >= endTime) {
				maxProfit = maxProfit + 500;
				endTime = test.calculateEndTime(startAndEndTimeArr[i + 1]);
			}
		}

		System.out.println(maxProfit);

	}

	public void sort(String[] startAndEndTimeArr) {
		this.array = startAndEndTimeArr;
		this.length = startAndEndTimeArr.length;
		this.tempMergArr = new String[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		int ithEndTime;
		int jthEndTime;
		while (i <= middle && j <= higherIndex) {

			ithEndTime = calculateEndTime(tempMergArr[i]);
			jthEndTime = calculateEndTime(tempMergArr[j]);

			if (ithEndTime <= jthEndTime) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

	private int calculateEndTime(String startAndEndTime) {

		String endTimeStr;
		int endTime = 0;
		if (startAndEndTime.charAt(startAndEndTime.length() - 4) == '#') {
			endTimeStr = startAndEndTime.charAt(startAndEndTime.length() - 3)
					+ "";
			endTime = Integer.parseInt(endTimeStr);
		} else {
			endTimeStr = startAndEndTime.charAt(startAndEndTime.length() - 4)
					+ "" + startAndEndTime.charAt(startAndEndTime.length() - 3);
			endTime = Integer.parseInt(endTimeStr);
		}
		if (startAndEndTime.charAt(startAndEndTime.length() - 2) == 'P') {
			endTime = endTime + 12;
		}

		return endTime;
	}

	private int calculateStartTime(String startAndEndTime) {
		String startTimeStr;
		int startTime = -1;
		if (startAndEndTime.charAt(4) == '#') {
			startTimeStr = startAndEndTime.charAt(0) + ""
					+ startAndEndTime.charAt(1);
			startTime = Integer.parseInt(startTimeStr);
			if (startAndEndTime.charAt(2) == 'P') {
				startTime = startTime + 12;
			}
		}
		else {
			startTimeStr = startAndEndTime.charAt(0) + "";
			startTime = Integer.parseInt(startTimeStr);
			if (startAndEndTime.charAt(1) == 'P') {
				startTime = startTime + 12;
			}
		}
		return startTime;
	}

}
