/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.net.IDN;
import java.util.Scanner;

import jdk.jfr.Unsigned;
import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	private GUIManager gui;
	private int id;
	private int chosenPath;
	private String playerAnswer;

	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		return playerAnswer;
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		this.playerAnswer = playerAnswer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		return gui.getInputReader();
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		gui.setInputReader(reader);
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		return chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		this.chosenPath = chosenPath;
	}

	/* Methods */
	 /**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	/*public String getData() {
		/ * TO BE COMPLETED * /
	}*/

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	/*public void setData(String data) {
		/ * TO BE COMPLETED * /
	}*/

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	/*public Event getDaughter(int i) {
		/ * TO BE COMPLETED * /
	}*/

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	/*public void setDaughter(Event daughter, int i) {
		/ * TO BE COMPLETED * /
	}*/

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		return  gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		this.gui = gui;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public void run() {
	/* TO BE COMPLETED */
	}
}

// eof