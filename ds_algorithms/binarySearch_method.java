// This program uses the find() method to search for a specified
// item by repeatedly dividing in half the range of array elements
// to be considered. 
///////////////////////////////////////////////////////////////////
class binarySearch_method {
	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = 0;
		int curIn;

		while(true) {
			curIn = (lowerBound + upperBound) / 2;
			if(a[curIn] == searchKey) {
				return curIn;				   // found it
			} else if(lowerBound > upperBound){
				return nElems;			       // can't find it
			} else {						   // divide range
				if(a[curIn] < searchKey) {
					lowerBound = curIn + 1;    // it's in upper half
				} else {
					upperBound = curIn - 1;    // it's in lower half
				}
			}
		}
	}
}