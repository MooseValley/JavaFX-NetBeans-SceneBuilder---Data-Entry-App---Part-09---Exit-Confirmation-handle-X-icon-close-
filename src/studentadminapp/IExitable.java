/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author omalleym
 */
public interface IExitable 
{
    @FXML
    default void exitClick()
    {
        Alert alert = new Alert (Alert.AlertType.CONFIRMATION, 
                                "Are you sure you want to Close?");

        alert.showAndWait().ifPresent(response -> 
        {
            if (response == ButtonType.OK) 
            {
                System.out.println ("Exiting application ...");

                Platform.exit();
            }
        });
    }
}
