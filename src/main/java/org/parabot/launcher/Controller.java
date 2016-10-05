package org.parabot.launcher;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    public static boolean loadLocal;
    public static boolean noVerify;
    public static boolean verbose;
    public static boolean debug;
    public static boolean server;
    public static String serverName;

    @FXML // fx:id="clearCacheButton"
    public JFXButton clearCacheButton;

    @FXML // fx:id="loadLocalToggleButton"
    public JFXToggleButton loadLocalToggleButton;

    @FXML // fx:id="versionLabel"
    public Label versionLabel;

    @FXML // fx:id="startButton"
    public JFXButton startButton;

    @FXML // fx:id="noVerifyToggleButton"
    public JFXToggleButton noVerifyToggleButton;

    @FXML // fx:id="verboseToggleButton"
    public JFXToggleButton verboseToggleButton;

    @FXML // fx:id="debugToggleButton"
    public JFXToggleButton debugToggleButton;

    @FXML // fx:id="serverTextField"
    public JFXTextField serverTextField;

    @FXML // fx:id="javaVersionLabel"
    public Label javaVersionLabel;

    @FXML // fx:id="serverToggleButton"
    public JFXToggleButton serverToggleButton;

    @FXML // fx:id="statusLabel"
    public Label statusLabel;

    @FXML
    void clearCache() {

    }

    @FXML
    void startClient() {

    }

    @FXML
    void getLoadLocalSelected() {
        loadLocal = loadLocalToggleButton.isSelected();
    }

    @FXML
    void getNoVerifySelected() {
        noVerify = noVerifyToggleButton.isSelected();
    }

    @FXML
    void getVerboseSelected() {
        verbose = verboseToggleButton.isSelected();
    }

    @FXML
    void getDebugSelected() {
        debug = debugToggleButton.isSelected();
    }

    @FXML
    void getServerSelected() {
        server = serverToggleButton.isSelected();
    }

    @FXML
    void setServerName() {
        serverName = serverTextField.getText();
    }

}

