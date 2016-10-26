// ======================================================================================
// FILE: InputScene.java
// CREATION DATE: OCT 22, 2016
// ABOUT:
// ======================================================================================

package main;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;

public class InputScene
{
	// ----------------------------------------------------------------------------------
	// Properties 
	
	private Scene m_inputScene;
	
	private GridPane m_grid;
	
	private ArrayList<Control> m_sceneElements;
	
	private Label m_aInputLabel;
	private Label m_bInputLabel;
	private Label m_cInputLabel;
	
	private TextField m_aInputTF;
	private TextField m_bInputTF;
	private TextField m_cInputTF;
	
	private Button m_calculateButton;
	
	private InputVerifier m_inputVerifier;
	
	// ----------------------------------------------------------------------------------
	// Constructor 
	
	public InputScene()
	{
		createSceneElements();
		configureLayout();
		buildScene();
	}
	
	// ----------------------------------------------------------------------------------
	// Methods 
	
	public Scene getBuiltScene()
	{
		return m_inputScene;
	}
	
	// ----------------------------------------------------------------------------------
	// Helper Functions
	
	private void createSceneElements()
	{
		m_sceneElements = new ArrayList<Control>();
		
		// column 0, row 0
		m_aInputLabel = new Label("Enter A: ");
		GridPane.setConstraints(m_aInputLabel, 0, 0);
		m_sceneElements.add(m_aInputLabel);
		
		// column 0, row 1
		m_bInputLabel = new Label("Enter B: ");
		GridPane.setConstraints(m_bInputLabel, 0, 1);
		m_sceneElements.add(m_bInputLabel);
		
		// column 0, row 2
		m_cInputLabel = new Label("Enter C: ");
		GridPane.setConstraints(m_cInputLabel, 0, 2);
		m_sceneElements.add(m_cInputLabel);
		
		m_aInputTF = new TextField();
		GridPane.setConstraints(m_aInputTF, 1, 0);
		m_sceneElements.add(m_aInputTF);
		
		m_bInputTF = new TextField();
		GridPane.setConstraints(m_bInputTF, 1, 1);
		m_sceneElements.add(m_bInputTF);
		
		m_cInputTF = new TextField();
		GridPane.setConstraints(m_cInputTF, 1, 2);
		m_sceneElements.add(m_cInputTF);
		
		m_calculateButton = new Button("Calculate");
		m_calculateButton.setTooltip(new Tooltip("Click to start calculation"));
		m_calculateButton.setOnMouseReleased(e ->{
			Logger.print("Calculate button was clicked and released");
			attemptCalculation();
		});
		
		
	}
		
	private void configureLayout()
	{
		m_grid = new GridPane();
		m_grid.setPadding(new Insets(10, 10, 10, 10));
		m_grid.setVgap(8);
		m_grid.setHgap(10);
		
		m_grid.getChildren().addAll(m_sceneElements);
	}

	private void buildScene()
	{
		m_inputScene = new Scene(m_grid, 600, 600);	
		
	}
	
	private void attemptCalculation()
	{
		
	}
}
