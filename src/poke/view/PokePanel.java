package poke.view;

import javax.swing.*;
import poke.controller.PokeController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PokePanel extends JPanel
{
	private PokeController pokeController;
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
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		numberField.setEditable(false);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	

}
