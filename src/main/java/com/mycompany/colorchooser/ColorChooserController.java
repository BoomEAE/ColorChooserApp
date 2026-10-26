/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

//Github repo link: https://github.com/BoomEAE/ColorChooserApp.git
package com.mycompany.colorchooser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
/**
 * FXML Controller class
 *
 * @author Eric
 */
public class ColorChooserController implements Initializable {
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    @FXML
    private Label redLabel;
    @FXML
    private Label greenLabel;
    @FXML
    private Label blueLabel;
    @FXML
    private Label alphaLabel;
    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private TextField redTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;
    @FXML
    private Circle circle;
    @FXML
    private Rectangle square;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Bind the textFIelds text property to the sliders value property
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));
        
        //Add listeners to every slider so that when the user uses the slider
        //it also updates the color of the square
        redSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            red = newValue.intValue();
            updateColor();
        });
        greenSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            green = newValue.intValue();
            updateColor();
        });
        blueSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            blue = newValue.intValue();
            updateColor();
        });
        alphaSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            updateColor();
        }); 
    }
    
    //Updates the color of the rectangle according to the red, blue, green and alpha values stored
    public void updateColor(){
        square.setFill(Color.rgb(red, green, blue, alpha));
    }
}
