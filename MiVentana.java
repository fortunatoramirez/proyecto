import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MiVentana extends JFrame implements ActionListener{

	JButton btnisma;
	public MiVentana()
	{
		JPanel panel;
		JLabel lblTexto1;
		JButton btnBoton1;
		JButton btnBoton2;
		

		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("Etiqueta 1");
		lblTexto1.setBounds(50, 40, 200, 10); //(x, y, w, h)
		btnBoton1 = new JButton("OK");
		btnBoton1.setBounds(50, 100, 100, 30);
		btnBoton2 = new JButton("OK 2");
		btnBoton2.setBounds(50, 150, 100, 30);
		btnisma = new JButton("Isma");
		btnisma.setBounds(300,100,100,30);



		panel.add(lblTexto1);
		panel.add(btnBoton1);
		panel.add(btnBoton2);
		panel.add(btnisma);

		btnisma.addActionListener(this);

		this.add(panel);
		this.setBounds(400,400,500,350);
		this.setTitle("Ventana Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==btnisma) {
			VentanaEmergente1 ve = new VentanaEmergente1();
		}
	}


}