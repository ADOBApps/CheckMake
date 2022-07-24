/**
* Detect JTextfields text change using java swing
* Using special implementation at class where
* was imported
* Created on 23/07/2022
* @author  Acxel Orozco (ADOB Apps)
 */
package mycontrollers;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class MyChanger implements DocumentListener{

	public JTextField tf;

/*	public MyChanger(JTextField jtf){
		tf = (JTextField) jtf;
	}*/

	public void changedUpdate(DocumentEvent e){}

	public void insertUpdate(DocumentEvent de){
		/**Get owner, it value  and relate totalvalue
		 * using docs properties get previus JTextfields relate
		*/ 
		Object owner = de.getDocument().getProperty("owner");
		Object val = de.getDocument().getProperty("assVal");
		Object tval = de.getDocument().getProperty("assTVal");

		/**Convert text to float and get total value
		 * and force conversion Object to JTexfield
		 * also force conversion float to string
		/*/
		Float myValue = Float.parseFloat(((JTextField)owner).getText())*Float.parseFloat(((JTextField)val).getText());
		((JTextField)tval).setText( ((String)Float.toString(myValue)) );
	}

	public void removeUpdate(DocumentEvent e){}
}