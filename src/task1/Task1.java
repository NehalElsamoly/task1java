/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nehal
 */
public class Task1 extends Application{

 





    ImageView v1;

    @Override
    public void start(Stage primaryStage) {

        Image im = new Image("/image/1.jpg");
        v1 = new ImageView(im);
        StackPane root = new StackPane();
        root.getChildren().add(v1);

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Task1");
        primaryStage.setScene(scene);
        primaryStage.show();
        (new Thread(new RNn())).start();
    }

    public class RNn implements Runnable {

        @Override
        public void run() {
            for (int i = 0; true; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Image im = new Image("/image/1.jpg");
                Image im2 = new Image("/image/2.jpg");
                Image im3 = new Image("/image/3.jpg");
                Image im4 = new Image("/image/4.jpg");
                if (i % 2 == 0) {
                    v1.setImage(im);
                } else if (i % 3 == 0) {
                    v1.setImage(im2);
                } else {
                    v1.setImage(im3);
                }
            }
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}

 





