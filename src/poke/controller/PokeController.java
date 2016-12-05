package poke.controller;

import poke.model.*;
import java.util.ArrayList;
import poke.view.PokeFrame;

import javax.swing.JOptionPane;

public class PokeController
{
	private ArrayList<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokeFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame,  "Welcome to the Rice Fields!");
	}
	
	private void buildPokedex()
	{
		
	}

}
