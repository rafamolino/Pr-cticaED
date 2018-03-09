package es.studium.Grados;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//He editado esta clase

public class Grados extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Label etiqueta1= new Label("Celsius");
	Label etiqueta2= new Label(" Fahrenheit");
	TextField txtTexto1 = new TextField(5);
	TextField txtTexto2 = new TextField(5);
	Button btnBoton1 = new Button("C->F");
	Button btnBoton2 = new Button("F->C");

	
	
	
	
	//He editado esta clase (Álvaro M)
	public Grados()
	{
		setLayout( new GridLayout( 3,2 ) );
		setTitle("Grados");
		add(etiqueta1);
		add(txtTexto1);
		add(etiqueta2);
		add(txtTexto2);
		add(btnBoton1);
		add(btnBoton2);
	
		
		setLocationRelativeTo(null);
		addWindowListener(this);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		setSize(200,120);
		setVisible(true); 
	}
	public static void main(String[] args)
	{
	new Grados();
	}
	@Override
	public void windowActivated(WindowEvent arg0)
	{
		
		
	}
	@Override
	public void windowClosed(WindowEvent arg0)
	{
		
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		
		
	}
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		
		
	}
	@Override
	public void windowIconified(WindowEvent e)
	{
		
		
	}
	@Override
	public void windowOpened(WindowEvent e)
	{
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a = e.getSource();
		if(a.equals(btnBoton1))
		{
			convertirCF();
			Double c =Double.parseDouble(txtTexto1.getText()); //Capturar
			Double resultado=(c*1.8)+(32.0); //Calcular
			System.out.println(resultado);
			txtTexto2.setText(resultado.toString());
		}
		else
		{
			convertirFC();
			Double f =Double.parseDouble(txtTexto2.getText()); //Capturar
			Double resultado=(f-32.0)*5/9; //Calcular
			System.out.println(resultado);
			txtTexto1.setText(resultado.toString());
		}
		
		
	}
	public void convertirCF()
	{
		
	}
	public void convertirFC()
	{
		
	}
}
