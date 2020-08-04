package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController  implements Initializable{

	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("Button save");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("Button Cancel");
	}
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}
	
	private void initializeNodes() {
		
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 35);
		
	}
	
	public void updateFormData() {
		if(entity== null) {
			throw new IllegalStateException("Entity was null");
		}
		txtName.setText(entity.getName());
		txtId.setText(String.valueOf(entity.getId()));
		
	}

}
