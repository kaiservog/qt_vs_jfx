package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			long inicio = 0;

			for(int i=0; i<11000; i++) {
				if(i==1000) {
					inicio = System.currentTimeMillis();
				}

				BorderPane root = new BorderPane();
				Scene scene = new Scene(root,400,400);
				BackgroundImage myBI= new BackgroundImage(new Image("file:///D:/qtprojetos/animegirl.jpg",400,400,false,true),
				        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				          BackgroundSize.DEFAULT);
				root.setBackground(new Background(myBI));
				primaryStage.setScene(scene);
				primaryStage.show();
				primaryStage.hide();
			}

			long fim = System.currentTimeMillis();
			System.out.println("elapsed time: " + (new Double(fim) - new Double(inicio))/new Double(1000)+ "s");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
