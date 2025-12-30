
import javafx.stage.Stage;
import  .scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class MainUI extends Application {
    @Override
    public void start(stage stage   ) {
        System.out.println("check");
        VBox inputpanel = new VBox(); 
        inputpanel.setPadding(new Insets(10)); 
        inputpanel.setstyle("-fx-background-color: #F0F0F0;");
        LabelTitle .set style ("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #333333;");


        //input fields 
        TextField cityNameField = new TextField();
        cityNameField.setPromptText("City Name");

        TextField xCoordField = new TextField();
        xCoordField.setPromptText("X Coordinate");

        TextField yCoordField = new TextField();
        yCoordField.setPromptText("Y Coordinate");

        Button addCityBtn = new Button("Add City");
        addCityBtn.setMaxWidth(Double.MAX_VALUE);

        Button addIncidentBtn = new Button("Add Incident");
        addIncidentBtn.setMaxWidth(Double.MAX_VALUE);

        inputPanel.getChildren().addAll(
                inputTitle,
                cityNameField, xCoordField, yCoordField,
                addCityBtn, addIncidentBtn
        );


        //map making 
        Canvas mapCanvas = new Canvas(600, 400);
        GraphicsContext gc = mapCanvas.getGraphicsContext2D();




        gc.strokeRect(0,0,600,400);

        StackPane mapPanel = new StackPane(mapCanvas);
        mapPanel.setstyle("-fx-background-color: #FFFFFF;");


        //status panel 
        TextArea statusArea = new TextArea();
        statusArea.setEditable(false);
        statusArea.setPrefHeight(100);
        statusArea.setStyle("-fx-control-inner-background: #f9f9f9;");
        BorderPane root = new BorderPane();
        root.setLeft(inputPanel);
        root.setCenter(mapPane);
        root.setBottom(statusArea);

        Scene scene = new Scene(root, 1100, 700);
        stage.setScene(scene);
        stage.setTitle("Emergency Response Dispatch System");
        stage.show();

    public static void main(String[] args) {
        launch(args);










    }

 







}