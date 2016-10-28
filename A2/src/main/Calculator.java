// ======================================================================================
// FILE: Calculator.java
// CREATION DATE: OCT 27, 2016
// ABOUT: 

package main;

// ======================================================================================
// REFERENCES

import java.util.ArrayDeque;

// ======================================================================================
// CLASSES 

public class Calculator
{
	private double m_root1;
	private double m_root2;
	
	// ----------------------------------------------------------------------------------
	// Methods
	
	public void calculateQuadratic(
		ArrayDeque<Double> arrayDeque
		)
	{
		Double coeffA = arrayDeque.pollFirst();
		Double coeffB = arrayDeque.pollFirst();
		Double coeffC = arrayDeque.pollFirst();
		
		Logger.print("A: " + coeffA + " B: " + coeffB);
		
		double discriminant = calculateDiscriminant(coeffA, coeffB, coeffC);
		
		// two real roots
		if (discriminant > 0)
		{
			m_root1 = (-coeffB + Math.sqrt(discriminant))/(2*coeffA);
			m_root2 = (-coeffB - Math.sqrt(discriminant))/(2*coeffA);
			Logger.print("Two real roots: " + m_root1 + ", " + m_root2);
		}
		else if (discriminant < 0)
		{
			double imagRoot = Math.sqrt(-discriminant)/(2*coeffA);
			Logger.print("Two imag roots: " + (-coeffB/(2*coeffA)) + "+/- i" + imagRoot);
		}
		else
		{
			m_root1 = -coeffB/(2*coeffA);
			Logger.print("One real root: " + m_root1);
		}
		
		
		
		
	}
	
	public double calculateDiscriminant(
		Double a,
		Double b,
		Double c
		)
	{
		double discriminant = b*b - 4*a*c;
		
		return discriminant;
	}
}
