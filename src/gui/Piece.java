package gui;

import java.awt.Color;

import gui.Window.CirclePanel;

import javax.swing.JLabel;

/**
 * Classe do elemento Pe�a usado na interface do tabuleiro
 *  
 * @author Jo�o Ladeiras
 * @author Rui Lima
 * 
 */

public class Piece
{
	private String country;
	private JLabel label;
	private Window.CirclePanel circle;
	
	/**
	 * Construtor
	 * 
	 * @param country Nome do pa�s correspondente
	 * @param x Coordenada horizontal na imagem do tabuleiro
	 * @param y Coordenada vertical na imagem do tabuleiro
	 * @param color Cor da pe�a
	 */
	public Piece(String country, int x, int y, Color color)
	{
		super();
		this.country = country;
		//C�rculo
		this.circle = new CirclePanel();
		this.circle.setForeground(color);
		this.circle.setOpaque(false);
		this.circle.setBounds(x, y, 50, 50);
        
		this.label = new JLabel();
		//Cor do texto
		this.label.setForeground(Color.white);
		//Label inicial (n�mero de tropas)
		label.setText("<html><h3>NaN</h3></html>");
		this.circle.add(label);
	}

	public Window.CirclePanel getCircle() {
		return circle;
	}
	
	public void setText(String text)
	{
		label.setText("<html><h3>"+text+"</h3></html>");
	}

	public String getCountry() {
		return country;
	}
	
	public void setColor(Color color)
	{
		this.circle.setForeground(color);
	}
}
