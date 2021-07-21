package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class SpringBootJavafxApplication extends Application {

    private static ApplicationContext applicationContext;

    public static FXMLLoader loadFxml(String fxmlPath){
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(SpringBootJavafxApplication.class.getResource(fxmlPath));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        return fxmlLoader;

    }

    public static void main(String[] args) {
        applicationContext= SpringApplication.run(SpringBootJavafxApplication.class,args) ;
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(loadFxml("/view/login.fxml").load()));
        primaryStage.show();
    }
}
