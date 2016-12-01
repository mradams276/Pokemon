package poke.view;

import javax.swing.JFrame;
import poke.controller.PokeController;
import java.awt.Dimension;

public class PokeFrame extends JFrame
{
	private PokeController baseController;
	private PokePanel appPanel;
	
	public PokeFrame(PokeController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new PokePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("hot diggity dog");
		this.setVisible(true);
	}

}
