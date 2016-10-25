// ======================================================================================
// FILE: InputScene.java
// CREATION DATE: OCT 22, 2016
// ABOUT:
// ======================================================================================

package main;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class InputScene implements IScene
{
	// ----------------------------------------------------------------------------------
	// Properties 
	
	private Scene m_inputScene;
	
	private GridPane m_grid;
	
	private Label m_coeffALabel;
	private Label m_coeffBLabel;
	private Label m_coeffCLabel;
	
	// ----------------------------------------------------------------------------------
	// Constructor 
	
	public InputScene()
	{

	}
	
	// ----------------------------------------------------------------------------------
	// Methods
	
	@Override
	public void createSceneElements()
	{
		// row 0, column 0
		m_coeffALabel = new Label("Enter A: ");
		GridPane.setConstraints(m_coeffALabel, 0, 0);
		
		// row 1, column 0
		m_coeffBLabel = new Label("Enter B: ");
		GridPane.setConstraints(m_coeffBLabel, 1, 0);
		
		// row 2, column 0
		m_coeffCLabel = new Label("Enter C: ");
		GridPane.setConstraints(m_coeffCLabel, 2, 0);
	}
		

	@Override
	public void configureLayout()
	{
		
	}

	@Override
	public void buildScene()
	{
		// TODO Auto-generated method stub
		
	}
}
