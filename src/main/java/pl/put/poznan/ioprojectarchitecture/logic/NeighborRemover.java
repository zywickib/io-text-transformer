package pl.put.poznan.ioprojectarchitecture.logic;

public class NeighborRemover {

	private boolean removeAllow;
	private String text;
	
	public NeighborRemover() {
	}

	/**
	 *
	 * @param removeAllow - bool variable to select the transformation
	 * @param text - text to tramsform
	 */
	public NeighborRemover(boolean removeAllow, String text) {
		this.removeAllow = removeAllow;
		this.text = text;
	}


	/**
	 *
	 * @return String without multiple words
	 */
	public String removeNeighbor() {
		String[] arr = text.split(" ");
		String result = "";
		if(removeAllow) {
			for ( int i = 0; i < arr.length - 1; i++) {
				result += (arr[i].equals(arr[i + 1])) ? "": arr[i] + " ";
			}
			result += arr[arr.length - 1];
			return result;
		}
		else
			return text;
	}
}
