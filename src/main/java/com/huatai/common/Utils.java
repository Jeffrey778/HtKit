package com.huatai.common;

import javafx.scene.control.Alert;

import java.io.File;

public class Utils {

    /**
     * 获取程序同级目录（父目录）
     *
     * @return 路径
     */
    public static String getParentPath() {
        return new File(getProjectPath()).getParent();
    }

    /**
     * 获取项目路径
     *
     * @return 项目路径
     */
    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    /**
     * 消息提示框
     *
     * @param message 显示消息
     */
    public static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
