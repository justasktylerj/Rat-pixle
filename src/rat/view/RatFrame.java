package rat.view;

import javax.swing.JFrame;
import rat.controller.RatController;

public class RatFrame extends JFrame
{
	private RatController baseController;
	private RatPanel basePanel;
	
	public RatFrame(RatController baseController)
	{
		this.baseController = baseController;
		basePanel = new RatPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(400,400);
		this.setTitle("Rat animation!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public RatController getBaseController()
	{
		return baseController;
	}
}
