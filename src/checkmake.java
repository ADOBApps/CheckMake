/**
* Create a check generator using java swint and awt tools
*
*
* @author  Acxel Orozco (ADOB Apps)
 */

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.*;

class CheckMake implements ActionListener {
	// Variables declaration - do not modify//GEN-BEGIN:variables
	Container contentPane;
	GridBagConstraints gbctts;
	GridLayout gl1;
	JButton button1, button2;
	JFrame frame1;
	JLabel jl_name, jl_total, jl_product, jl_vunt, jl_cant, jl_vtol;
	JPanel jpanel_info, jpanel_control;
	JTextField txf_name, txf_p1, txf_p2, txf_p3;
	JTextField txf_vu1, txf_vu2, txf_vu3;
	JTextField txf_c1, txf_c2, txf_c3;
	JTextField txf_vt1, txf_vt2, txf_vt3;
	JTextField txf_vtf;
	// End of variables declaration//GEN-END:variables
	
	public static void main (String arg[]){
		System.out.println("CheckMake");
		CheckMake cm = new CheckMake();
	}

	public CheckMake(){

		//Panels
		jpanel_info = new JPanel();
		jpanel_info.setLayout (new GridBagLayout());
		jpanel_control = new JPanel();
		gbctts = new GridBagConstraints();

		frame1 = new JFrame();
		frame1.setTitle("Orden de compra");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = frame1.getContentPane();
		
		//Labels
		jl_name = new JLabel();
		jl_name.setText("Ingrese su nombre");
		jl_name.setHorizontalAlignment(SwingConstants.LEFT);

		jl_total = new JLabel();
		jl_total.setText("Total factura: ");

		jl_product = new JLabel();
		jl_product.setText("Producto");

		jl_vunt = new JLabel();
		jl_vunt.setText("Valor unitario");

		jl_cant = new JLabel();
		jl_cant.setText("Cantidad");

		jl_vtol = new JLabel();
		jl_vtol.setText("Valor total");


		//Buttons
		button1 = new JButton("Total");
		button1.setHorizontalAlignment(SwingConstants.LEFT);
		button1.addActionListener(this);
		button2 = new JButton("Borrar");
		button2.addActionListener(this);

		//TextFields
		txf_name = new JTextField(50);
		txf_p1 = new JTextField(50);
		txf_vu1 = new JTextField(10);
		txf_c1 = new JTextField(10);
		txf_vt1 = new JTextField(10);
		txf_p2 = new JTextField(50);
		txf_vu2 = new JTextField(10);
		txf_c2 = new JTextField(10);
		txf_vt2 = new JTextField(10);
		txf_p3 = new JTextField(50);
		txf_vu3 = new JTextField(10);
		txf_c3 = new JTextField(10);
		txf_vt3 = new JTextField(10);

		//----Add elements to panel::jpanel_info
		/**Set positions config for jl_name**/
		gbctts.gridx = 0; //colums-position
		gbctts.gridy = 0; //row-position
		gbctts.gridwidth = 1;//Set size
		gbctts.gridheight = 1;//Set size
		jpanel_info.add(jl_name, gbctts);

		/**Set positions config for txf_name**/
		gbctts.gridx = 1; //colums-position
		gbctts.gridy = 0; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.weightx = 2.0;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_name, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for jl_product**/
		gbctts.gridx = 0; //colums-position
		gbctts.gridy = 1; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_product, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for jl_vunt**/
		gbctts.gridx = 1; //colums-position
		gbctts.gridy = 1; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_vunt, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for jl_cant**/
		gbctts.gridx = 2; //colums-position
		gbctts.gridy = 1; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_cant, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for jl_vtol**/
		gbctts.gridx = 3; //colums-position
		gbctts.gridy = 1; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(jl_vtol, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for txf_p1**/
		gbctts.gridx = 0; //colums-position
		gbctts.gridy = 2; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_p1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for txf_vu1**/
		gbctts.gridx = 1; //colums-position
		gbctts.gridy = 2; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vu1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for txf_c1**/
		gbctts.gridx = 2; //colums-position
		gbctts.gridy = 2; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_c1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config

		/**Set positions config for txf_vt1**/
		gbctts.gridx = 3; //colums-position
		gbctts.gridy = 2; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vt1, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_p2**/
		gbctts.gridx = 0; //colums-position
		gbctts.gridy = 3; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_p2, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_vu2**/
		gbctts.gridx = 1; //colums-position
		gbctts.gridy = 3; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vu2, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_c2**/
		gbctts.gridx = 2; //colums-position
		gbctts.gridy = 3; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_c2, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_vt2**/
		gbctts.gridx = 3; //colums-position
		gbctts.gridy = 3; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vt2, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_p3**/
		gbctts.gridx = 0; //colums-position
		gbctts.gridy = 4; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_p3, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_vu3**/
		gbctts.gridx = 1; //colums-position
		gbctts.gridy = 4; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vu3, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_c3**/
		gbctts.gridx = 2; //colums-position
		gbctts.gridy = 4; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_c3, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for txf_vt3**/
		gbctts.gridx = 3; //colums-position
		gbctts.gridy = 4; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		gbctts.fill = GridBagConstraints.HORIZONTAL;
		jpanel_info.add(txf_vt3, gbctts);
		gbctts.fill = GridBagConstraints.NONE; //restore fill config
		
		/**Set positions config for jl_totals**/
		gbctts.gridx = 2; //colums-position
		gbctts.gridy = 5; //row-position
		gbctts.gridwidth = 1;
		gbctts.gridheight = 1;
		jpanel_info.add(jl_total, gbctts);

		//Add panel to frame
		contentPane.add(jpanel_info, BorderLayout.CENTER);

		//Add elements to panel::jpanel_control
		jpanel_control.add(button1);
		jpanel_control.add(button2);
		//Add panel to frame
		contentPane.add(jpanel_control, BorderLayout.SOUTH);

		//Set dimensions adaptable to content
		frame1.pack();

		//Allowed visibility
		frame1.setVisible(true);
	}

	/**Method implemented by Action listener
	* to catch button that generates action 
	* and to do something
	*/
	public void actionPerformed(ActionEvent e){
		
		//get origin
		if (e.getSource() == button1){
			System.out.println("Pressed button1 Sr: " + txf_name.getText());
		}
		else if (e.getSource() == button2){
			System.out.println("Pressed button2");
		}
	}
}