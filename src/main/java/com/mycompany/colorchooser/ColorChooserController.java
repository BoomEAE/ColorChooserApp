/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
/**
 * FXML Controller class
 *
 * @author Eric
 */
public class ColorChooserController implements Initializable {


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
        // TODO
    }    
    
}
