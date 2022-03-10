package sodoku.datagame;

import java.io.File;

public class DataGame {
	// Attributes
	private File inputFile;
	public static final String FILE_DATAGAME = "C:\\Users\\DELL\\workspace\\Input_Output_Flie\\sodoku_datagame.txt";

	// Constructor
	public DataGame() {
		this.inputFile = new File(FILE_DATAGAME);
	}

	public DataGame(File inputFile) {
		super();
		this.inputFile = inputFile;
	}

	// Getter and setter
	public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}
	
	// Methods

}
