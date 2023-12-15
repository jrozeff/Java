// lowArray.java
// This program demonstrates an array class with a low-level interface
//////////////////////////////////////////////////////////////////////
class LowArray {
	private long[] a;	// reference to a

	// Constructor that creates array a
	public LowArray(int size) {
		a = new long[size];			
	}

	// Sets value
	public void setElem(int index, long value) {
		a[index] = value;	
	}

	// Gets value
	public long getElem(int index) {
		return a[index];
	}
}