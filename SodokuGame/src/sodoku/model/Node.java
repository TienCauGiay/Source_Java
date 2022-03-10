package sodoku.model;

import sodoku.constants.Constants;

public class Node {
	// Attributes
	private int row;
	private int col;
	private int zone;
	private int value;
	private boolean isReserved;

	// Constructors
	public Node() {
		super();
	}

	public Node(int row, int col, int value, boolean isReserved) {
		super();
		this.row = row;
		this.col = col;
		this.value = value;
		this.isReserved = isReserved;
	}

	// Getter and setter
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	@Override
	public String toString() {
		return "Node [row=" + row + ", col=" + col + ", zone=" + zone + ", value=" + value + ", isReserved="
				+ isReserved + "]";
	}

	// Methods
	public boolean isValidate() {
		if (this.col < 0 || this.col > 8) {
			return false;
		}
		if (this.row < 0 || this.row > 8) {
			return false;
		}
		if (this.value < 0 || this.value > 9) {
			return false;
		}
		return true;
	}

	public int calculateZone() {
		int r = this.row / Constants.ZONE_SIZE;
		int c = this.col / Constants.ZONE_SIZE;

		int zone = r * Constants.ZONE_SIZE + c;
		return zone;
	}

}
