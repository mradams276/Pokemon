package poke.view;

import javax.swing.*;
import poke.controller.PokeController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

	public class PokePanel extends JPanel {
	private PokeController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;

	public PokePanel(PokeController baseController) 
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		numberField.setEditable(false);
	}

	private void setupLayout() {

	}

	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener())
		{
			
		});
		
		updateButton.addActionListener(new ActionListener())
		{
			
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent entered)
			{
				JOptionPane.showMessageDialog(baseController.getBaseFrame(),  "The mouse is in!!!");
			}
			
			public void mouseExited(MouseEvent exited)
			{
				JOptionPane.showMessageDialog(baseController.getBaseFrame(),  "The mouse is out!!!");
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				JOptionPane.showMessageDialog(baseController.getBaseFrame(),  "The mouse is pressed!!!");
			}
			
			public void mouseReleased(MouseEvent released)
			{
				JOptionPane.showMessageDialog(baseController.getBaseFrame(),  "The mouse is released!!!");
			}
			
			public void mouseClicked(MouseEvent clicked)
			{
				JOptionPane.showMessageDialog(baseController.getBaseFrame(),  "The mouse is clicked!!!");
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent dragged)
			{
				setRandomColor();
			}
			
			public void mouseMoved(MouseEvent moved)
			{
				JOptionPane.shoeMessageDialog(baseController.getBaseFrame(), "Moving frim x:" + moved.getX() + ", Y:" + moved.getY();
			}
		});
	}
	
	private void setRandomColor()

}
