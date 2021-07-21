package com.example.demo.controller;

import com.example.demo.bean.LoginUserInfo;
import com.example.demo.mapper.QueryMapper;
import com.example.demo.services.LoginService;
import de.felixroske.jfxsupport.GUIState;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.example.demo.SpringBootJavafxApplication.loadFxml;

/**
 * @author qiuyue
 * @create 2021/7/21  12:21
 */
@Component
public class LoginController {

    @Autowired
    private LoginService loginService;

    public TextField txtUsername;
    public PasswordField txtPassword;


    public void loginButtonClicked() throws Exception {

        String username=txtUsername.getText().trim();

        String password=txtPassword.getText().trim();

        if(loginService.login(username,password)){
            openMainWindow();
        }else{
            alertLoginFail();
        }
    }


    private void alertLoginFail() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("用户名密码不正确！");
        alert.showAndWait();

    }

    private void openMainWindow() throws IOException {
        //todo
        System.out.println("login success.");
        Stage mainStage =new Stage();
        mainStage.setScene(new Scene(loadFxml("/view/main.fxml").load()));
        mainStage.show();

        Window window = txtUsername.getScene().getWindow();
        if(window instanceof Stage){
            ((Stage)window).close();
        }

    }
}
