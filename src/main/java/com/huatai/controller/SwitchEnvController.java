package com.huatai.controller;

import com.huatai.common.Constants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SwitchEnvController implements Initializable {

    private static final String UNKNOWN = "不知道。。。";

    @FXML
    private ComboBox<String> indivUrl;

    @FXML
    private ComboBox<String> eaUrl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initEnvState();
    }

    /**
     * 初始化各环境状态
     */
    private void initEnvState() {
        String indivTestDb = "";
        String indivProdDb = "";
        String eaTestDb = "";
        String eaProdDb = "";

    }

    /**
     * 变更个险核心url事件
     *
     * @param event e
     */
    public void changeIndivUrl(ActionEvent event) {
        String url = indivUrl.getValue().equals(Constants.PROD) ?
                Constants.INDIV_PROD : Constants.INDIV_TEST;
    }

    /**
     * 变更EA核心url事件
     *
     * @param event e
     */
    public void changeEaUrl(ActionEvent event) {
        String url = eaUrl.getValue().equals(Constants.PROD) ?
                Constants.EA_PROD : Constants.EA_TEST;
    }
}
