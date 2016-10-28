// ======================================================================================
// FILE: InputVerifier.java
// CREATION DATE: OCT 26, 2016
// ABOUT: 

package main;

import java.util.ArrayDeque;

import CustomExceptions.InvalidInputException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Control;

// ======================================================================================
// CLASSES

public class InputVerifier
{
	// ----------------------------------------------------------------------------------
	// Properties 
	
	private ArrayDeque<Double> m_verifiedCoeffs;
	
	// ----------------------------------------------------------------------------------
	// Constructor
	
	public InputVerifier()
	{
		m_verifiedCoeffs = new ArrayDeque<Double>();
	}
	
	// ----------------------------------------------------------------------------------
	// Methods
	
	public ArrayDeque<Double> getVerifiedCoeffs()
	{
		return m_verifiedCoeffs;
	}
	
	public boolean IsInt(
		Control i_textField,
		String i_inputValue
		) throws InvalidInputException
	{
		try
		{
			double parsedDouble = Double.parseDouble(i_inputValue);
			
			if (parsedDouble <= 0)
			{
				String errorMessage = "Coefficient must be greater than 0.";
				showInvalidInputAlert(errorMessage);
				throw new InvalidInputException(errorMessage);
			}
			else
			{
				Logger.print(parsedDouble + "has been verified.");
				m_verifiedCoeffs.add(parsedDouble);
			}
			
			return true;
		} 
		catch(NumberFormatException e) 
		{
			String errorMessage = "Input value must be a number.";
						
			showInvalidInputAlert(errorMessage);
			
			return false;
		}
	}
	
	private void showInvalidInputAlert(
			String i_message
			)
		{
			System.out.println("-- " + i_message);
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Invalid Input");
			alert.setHeaderText("Invalid Input");
			alert.setContentText(i_message);
			alert.showAndWait();
		}
}
