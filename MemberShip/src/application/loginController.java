package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController implements Initializable {
	@FXML Button btnLogin,btnReg,btnCancel,btnClose;
	@FXML PasswordField txtPwd;
	@FXML TextField txtId;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void btnLoginAction(ActionEvent event) {
		
	}
	
	public void btnRegAction(ActionEvent event) {
		try {
			Stage stage= (Stage) btnLogin.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("reg.fxml")); 
			Scene re = new Scene(root,600,400);
			re.getStylesheets().add(getClass().getResource("application.css").
			toExternalForm()); stage.setScene(re); 
			stage.setTitle("회원가입");
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void btnCancelAction(ActionEvent event) {
		txtId.setText(null);
		txtPwd.setText(null);
	}
	
	public void btnCloseAction(ActionEvent event) {
		Stage xe = (Stage) btnCancel.getScene().getWindow();
		xe.close();
	}
}
