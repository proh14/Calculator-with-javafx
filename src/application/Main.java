package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			FXMLLoader a = new FXMLLoader(getClass().getResource("Mains.fxml"));
			
			Parent root = a.load();
			Scene scene = new Scene(root);
			
			cont c = a.getController();
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

				@Override
				public void handle(KeyEvent e) {
				
					
					
					
					switch(e.getCode()){
						
						case DIGIT0 : c.on0(); break;
						
						case DIGIT1 : c.on1(); break;
						
						case DIGIT2 : c.on2(); break;
						
						case DIGIT3 : c.on3(); break;
						
						case DIGIT4 : c.on4(); break;
						
						case DIGIT5 : c.on5(); break;
						
						case DIGIT6 : c.on6(); break;
						
						case DIGIT7 : c.on7(); break;
						
						case DIGIT8 : 
						
						if (e.isShiftDown()) {
							
							
							
							c.onmu();
							
							
								
							} else{
								
								c.on8();	
								
								
							}	break;			
							
						case DIGIT9 : c.on9(); break;
						
						case SLASH : c.ond(); break;
						
						case MINUS : c.onm(); break; 
						
						case BACK_SPACE : c.ondel(); break;
						
						case PERIOD : c.ondot(); break;
						
						case ENTER : c.oe(); break;
						 
						case PLUS : c.onp(); break;
						
						case C    :  c.onc(); break;
					
					
						default   :  break;
						
						
					}
				
		
						if(e.isShiftDown() && e.getCode() == KeyCode.EQUALS) {
							
							
							c.onp();
							
							
						}
						
						
					
					
				}		
				
				
				
				
			});
			
			
			
			
			
			
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.ico")));
			primaryStage.setResizable(false);
			primaryStage.setTitle("Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
