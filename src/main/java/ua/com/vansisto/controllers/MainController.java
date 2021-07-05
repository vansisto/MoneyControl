package ua.com.vansisto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class MainController {
    @FXML
    public Button do_operation;
    @FXML
    public TabPane chart_tab_pane;
    @FXML
    public AnchorPane main_split_pane;
    @FXML
    public AnchorPane account_statistic;

    @FXML
    public void initialize() {
        chart_tab_pane.setPrefHeight(1200);
        chart_tab_pane.setPrefWidth(700);
    }

    public void clickDoOperationButton(ActionEvent actionEvent) {

    }

    public void clickHistoryButton(ActionEvent actionEvent) {

    }

    public void clickAccountsButton(ActionEvent actionEvent) {

    }

    public void clickUsersButton(ActionEvent actionEvent) {

    }

    public void clickCategoriesButton(ActionEvent actionEvent) {

    }

    public void clickRatesButton(ActionEvent actionEvent) {

    }
}
