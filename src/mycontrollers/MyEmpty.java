/**
* Verify JTextfields text using java swing
*
* Created on 23/07/2022
* @author  Acxel Orozco (ADOB Apps)
 */
package mycontrollers;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.InputVerifier;

import java.awt.*;
import java.awt.event.*;

public class MyEmpty extends InputVerifier{

	public boolean verify(JComponent input){
		if(input instanceof JTextField){
			JTextField tf = (JTextField) input;
			String text = ((JTextField)tf).getText();
			if(text != ""){
				return true;
			}else{
				JOptionPane.showMessageDialog(tf, "Campo requerido");
				return false;
			}
		}
		return true;
	}
}