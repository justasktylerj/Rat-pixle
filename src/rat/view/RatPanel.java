package rat.view;

import javax.swing.*;


//imports
import assets.Animation;


import java.awt.Canvas;
//pulls controller info
import java.awt.Color;


public class RatPanel extends JPanel
{
	private Animation animation;
	private SpringLayout baseLayout;
	private Canvas screen;
	
	//declare components
	public RatPanel(Animation animation)
	{
		this.animation = animation;
		baseLayout = new SpringLayout();
		screen.setBackground(Color.WHITE);
		screen.setSize(100,100);
		
		setupPanel();
		setupLayout();
		setupCanvas();
	//after the declarations are finished the setup starts
	}	
		//constraints for components layout
	private void setupLayout()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
	}
	
	private void setupCanvas()
	{
		
	}
	
}
