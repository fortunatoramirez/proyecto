import javax.swing.*;
class MiVentana extends JFrame{

	public MiVentana()
	{
		JPanel panel;
		JLabel lblTexto1;
		JButton btnBoton1;

		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("Etiqueta 1");
		lblTexto1.setBounds(50, 40, 200, 10); //(x, y, w, h)
		btnBoton1 = new JButton("OK");
		btnBoton1.setBounds(50, 100, 100, 30);

		panel.add(lblTexto1);
		panel.add(btnBoton1);

		this.add(panel);
		this.setBounds(400,400,500,350);
		this.setTitle("Ventana Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}