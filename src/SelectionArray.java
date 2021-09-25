
public class SelectionArray {
	private int[] arr;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public SelectionArray(int size) {
		this.arr = new int[size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting new value into the array
	 * @param value
	 */
	public void insertValue(int value) {
		this.arr[this.nItems] = value;
		this.nItems ++;
	}
	
	/**
	 * Displaying all the values in the array
	 */
	public void displayValues() {
		for(int value: this.arr) {
			System.out.println("Value => "+value);
		}
	}
	
	/**
	 * Sorting array using selection sort algorithm
	 */
	public void selectionSort() {
		int outerValue, innerValue, minValue;
		for(outerValue = 0; outerValue < this.nItems -1; outerValue ++) {
			minValue = outerValue;
			for(innerValue = outerValue + 1; innerValue < this.nItems; innerValue ++) {
				if(this.arr[innerValue] < this.arr[minValue]) {
					minValue = innerValue;
					swap(outerValue, innerValue);
				}
			}
		}
	}
	
	
	/**
	 * Swapping two values in the array
	 * @param outerValue
	 * @param innerValue
	 */
	public void swap(int outerValue, int innerValue) {
		int temp = this.arr[innerValue];
		this.arr[innerValue] = this.arr[outerValue];
		this.arr[outerValue] = temp;
	}
}
