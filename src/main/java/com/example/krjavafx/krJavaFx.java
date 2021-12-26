package com.example.krjavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;  
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;

public class krJavaFx extends Application {
    @Override
    public void start(Stage stage) {
        //Label for name
        Text nameLabel = new Text("Название");

        //Text field for name
        TextField nameText = new TextField();

        //Label for date of birth
        Text dobLabel = new Text("Дата");

        //date picker to choose date
        DatePicker datePicker = new DatePicker();

        //Label for gender
        Text genderLabel = new Text("Планировка");

        //Toggle group of radio buttons
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton kuhnyaRadio = new RadioButton("кухня");
        kuhnyaRadio.setToggleGroup(groupGender);
        RadioButton stolovayaRadio = new RadioButton("столовая");
        stolovayaRadio.setToggleGroup(groupGender);

        //Label for yes no question
        Text reservationLabel = new Text("Наличие посудомоечной машины");

        //Toggle button for reservation
        ToggleButton Reservation = new ToggleButton();
        ToggleButton yes = new ToggleButton("Да");
        ToggleButton no = new ToggleButton("Нет");
        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);

        //Label for furnitures
        Text furnituresLabel = new Text("Мебель");

        //check box for furniture
        CheckBox holodilnikCheckBox = new CheckBox("Холодильник");
        holodilnikCheckBox.setIndeterminate(false);

        //check box for furniture
        CheckBox gazCheckBox = new CheckBox("Газовая плита");
        gazCheckBox.setIndeterminate(false);

        //Label for shops
        Text shopsLabel = new Text("Магазины");

        //list View for shops
        ObservableList<String> names = FXCollections.observableArrayList(
                "Мебель Шара", "Кухниспаркс", "ВАЗАРИ", "Цвет мебели", "62 кухни", "МебельХолл", "Арт Мебель");
        ListView<String> shopsListView = new ListView<String>(names);

        //Label for location
        Text locationLabel = new Text("Производитель");

        //Choice box for location
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll
                ("Россия", "Беларусь", "Италия", "Венгрия", "Германия");

        //Label for register
        Button buttonRegister = new Button("Показать варианты");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(500, 500);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(kuhnyaRadio, 1, 2);
        gridPane.add(stolovayaRadio, 2, 2);
        gridPane.add(reservationLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(furnituresLabel, 0, 4);
        gridPane.add(holodilnikCheckBox, 1, 4);
        gridPane.add(gazCheckBox, 2, 4);

        gridPane.add(shopsLabel, 0, 5);
        gridPane.add(shopsListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);

        //Styling nodes
        buttonRegister.setStyle(
                "-fx-background-color: darkslateblue; -fx-textfill: white;");

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        furnituresLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        shopsLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting the back ground color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Форма создания дизайн-проекта кухни/столовой");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}