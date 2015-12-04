package rat.view;

import javax.swing.*;

//imports
import rat.controller.RatController;


import java.awt.Canvas;
//pulls controller info
import java.awt.Color;
import java.awt.event.*;

public class RatPanel extends JPanel
{
	private RatController baseController;
	private JButton idleButton;
	private JButton runButton;
	private JButton attackButton;
	private JButton dieButton;
	private SpringLayout baseLayout;
	private Canvas screen;
	
	//declare components
	public RatPanel(RatController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		idleButton = new JButton("sit");
		runButton = new JButton("run");
		attackButton = new JButton("attack");
		dieButton = new JButton("die");
		screen = new Canvas();
		
		screen.setBackground(Color.WHITE);
		screen.setSize(100,100);
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupCanvas();
	//after the declarations are finished the setup starts
	}	
		//constraints for components layout
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, runButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, runButton, 0, SpringLayout.NORTH, dieButton);
		baseLayout.putConstraint(SpringLayout.NORTH, idleButton, 0, SpringLayout.NORTH, dieButton);
		baseLayout.putConstraint(SpringLayout.WEST, idleButton, 44, SpringLayout.EAST, dieButton);
		baseLayout.putConstraint(SpringLayout.NORTH, attackButton, 0, SpringLayout.NORTH, dieButton);
		baseLayout.putConstraint(SpringLayout.WEST, dieButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, dieButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, attackButton, -46, SpringLayout.WEST, runButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, screen, -79, SpringLayout.NORTH, idleButton);
		baseLayout.putConstraint(SpringLayout.EAST, screen, -174, SpringLayout.EAST, this);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(dieButton);
		this.add(idleButton);
		this.add(attackButton);
		this.add(runButton);
		this.add(screen);
	}
	
	private void setupListeners()
	{
		idleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		runButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		dieButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		attackButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
	
	private void setupCanvas()
	{
		//this.setSize(100,100);
	}
}
