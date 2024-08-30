package gui.util;

import javafx.scene.control.TextField;
/*Basicamente são métodos que atuarão sobre os Controllers
 Será passado um text, caso este texto seja nulo ou não for do tipo esperado o valor settado será o antigo
 */

public class Constraints { //Litações
	
	public static void setTextFieldInteger(TextField txt) { 
		  txt.textProperty().addListener((obs, oldValue, newValue) -> { 
		         if (newValue != null && !newValue.matches("\\d*")) { //indica um numero inteiro
		          txt.setText(oldValue); 
		         } 
		     }); 
		 } 
		 
		 public static void setTextFieldMaxLength(TextField txt, int max) { 
		  txt.textProperty().addListener((obs, oldValue, newValue) -> { 
		         if (newValue != null && newValue.length() > max) { //Não pode ser maior que o máximo
		          txt.setText(oldValue); 
		         } 
		     }); 
		 } 
		 
		 public static void setTextFieldDouble(TextField txt) { 
		  txt.textProperty().addListener((obs, oldValue, newValue) -> { 
		       if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) { //Deve ter esse formato para ser float
		                    txt.setText(oldValue); 
		                } 
		      }); 
		 } 
}
