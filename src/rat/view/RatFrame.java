package rat.view;

import javax.swing.JFrame;
import assets.Animation;

public class RatFrame extends JFrame
{
	private Animation animation;
	private RatPanel basePanel;
	
	public RatFrame(Animation animation)
	{
		this.animation = animation;
		basePanel = new RatPanel(animation);
		
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
	
	public Animation getanimation()
	{
		return animation;
	}
}
