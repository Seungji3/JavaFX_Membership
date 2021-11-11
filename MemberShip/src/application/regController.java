package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class regController implements Initializable {
	@FXML TextField txtId,txtPwd1,txtPwd2,txtSnum,txtName,txtPhone,txtMajor,txtAddress;
	@FXML Button btnReg,btnCancel,btnClose;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	
	public void btnRegAction(ActionEvent event) {
		
	}
	
	public void btnCancelAction(ActionEvent event) {
		txtId.setText(null); 
		txtPwd1.setText(null);
		txtPwd2.setText(null);
		txtSnum.setText(null);
		txtName.setText(null);
		txtPhone.setText(null);
		txtMajor.setText(null);
		txtAddress.setText(null);
	}
	
	public void btnCloseAction(ActionEvent event) {
		Stage xe = (Stage) btnCancel.getScene().getWindow();
		xe.close();
	}
}
