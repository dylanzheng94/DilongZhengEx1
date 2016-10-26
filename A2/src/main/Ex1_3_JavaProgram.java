// ======================================================================================
// FILE: Ex1_3_JavaProgram.java
// CREATION DATE: OCT 24, 2016
// ABOUT: 

// ======================================================================================
// REFERENCES 

package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

// ======================================================================================
// CLASSES

public class Ex1_3_JavaProgram extends Application
{
	private Stage m_window;
	
	private Scene m_inputScene;
	
	// ----------------------------------------------------------------------------------
	// Methods 
	
	public static void main(String[] args)
	{
		Logger.print("Entered main()");
		
		launch(args);
		
		Logger.print("Exiting main()");
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Logger.print("Entered start()");
		
		m_window = primaryStage;
		m_window.setTitle("COMP4004 A2");
		
		InputScene inputScene = new InputScene();
		m_inputScene = inputScene.getBuiltScene();
		
		m_window.setScene(m_inputScene);
		m_window.show();
	}

}
