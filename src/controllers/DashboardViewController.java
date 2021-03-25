package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Professor;
import models.Student;
import utilities.DBUtility;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardViewController  implements Initializable {

    @FXML
    private Label studentsLabel;

    @FXML
    private ListView<Student> studentsListView;

    @FXML
    private Label coursesLabel;

    //@FXML
    //private ListView<Course> coursesListView;

    @FXML
    private Label professorsLabel;

    @FXML
    private ListView<Professor> professorsListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentsListView.getItems().addAll(DBUtility.getStudentsFromDB());
        studentsLabel.setText(String.format("Students: %d", studentsListView.getItems().size()));
    }

}