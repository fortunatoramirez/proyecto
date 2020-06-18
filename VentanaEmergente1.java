
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class VentanaEmergente1 extends JFrame{

	/*JTextField tf_nombreArchivo;
	JButton aceptarNombreArchivo;*/
	JLabel lbl1;
	JPanel panel;

	public VentanaEmergente1()
	{


		panel= new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,400,200);
		panel.setVisible(true);

		lbl1= new JLabel("Hola, si funicona jeje");
		lbl1.setBounds(30,30,450,50);

		panel.add(lbl1);

		this.setTitle("Isma");
		this.setSize(500, 200);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.add(panel);
	}
}