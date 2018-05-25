package com.huatai.controller;

import com.huatai.common.PropertiesUtils;
import com.huatai.common.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EnvConfigController implements Initializable {

    @FXML
    private TextField indivTestUrl;

    @FXML
    private TextField indivProdUrl;

    @FXML
    private TextField eaTestUrl;

    @FXML
    private TextField eaProdUrl;

    @FXML
    private Button envConfigConfirm;

    @FXML
    private Button envConfigCancel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initEnvConfig();
    }

    private void initEnvConfig() {
        indivTestUrl.setText(PropertiesUtils.read("indivTestUrl"));
        indivProdUrl.setText(PropertiesUtils.read("indivProdUrl"));
        eaTestUrl.setText(PropertiesUtils.read("eaTestUrl"));
        eaProdUrl.setText(PropertiesUtils.read("eaProdUrl"));
    }

    /**
     * 取消修改url
     *
     * @param event e
     */
    public void resetEnvConfig(ActionEvent event) {
        initEnvConfig();
    }

    /**
     * 保存修改url到配置文件
     *
     * @param event e
     */
    public void setEnvConfig(ActionEvent event) {
        String indivTestUrlText = indivTestUrl.getText();
        String indivProdUrlText = indivProdUrl.getText();
        String eaTestUrlText = eaTestUrl.getText();
        String eaProdUrlText = eaProdUrl.getText();

        try {
            PropertiesUtils.write("indivTestUrl", indivTestUrlText);
            PropertiesUtils.write("indivProdUrl", indivProdUrlText);
            PropertiesUtils.write("eaTestUrl", eaTestUrlText);
            PropertiesUtils.write("eaProdUrl", eaProdUrlText);
        } catch (Exception e) {
            e.printStackTrace();
            Utils.showAlert("保存失败！");
        }
        Utils.showAlert("保存成功！");
    }

}
