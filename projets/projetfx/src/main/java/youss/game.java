/* Youssef Mroue
   ICS4U
   le 20 juin 2020
   projetFX
   Un jeux de famille, deux joueurs doit participer, ou vous pouvez jouer seule :). 
   Pour gagner le jouer doit connecter quatres disques de même couleur 
*/  

package youss;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
 
 
public class game extends Application {
     
    //definir les variables utiliser pour les disque et les colonnes
    private SimpleObjectProperty<Color> playerColorProperty = new SimpleObjectProperty<Color>(Color.AQUA);
    private int r;
    private int c;
     
     
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage Stage) {
        
        // creations de la fenetre (grid et border et le titre)
        BorderPane root = new BorderPane();
        GridPane gridpane = new GridPane();
        Stage.setTitle("Connectez quatre!");
       
         
        Button addCellButton = new Button("Ajouter des Grids");
        
        //création de la scene
        Scene scene = new Scene(root, 750, 680);
        scene.setFill(Color.BLACK);
        
         
        gridpane.setTranslateY(20);
        gridpane.setAlignment(Pos.CENTER);
        
        // les contraintes de la gride
        gridpane.getColumnConstraints().addAll(new ColumnConstraints(100,100,Double.MAX_VALUE), 
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE));
        gridpane.getRowConstraints().addAll(new RowConstraints(100,100,Double.MAX_VALUE), 
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE));
         
        createGrids(gridpane);
         
        root.setCenter(gridpane);
         
        // l'effet de shadow sous la console 
        DropShadow effect = new DropShadow();
        effect.setColor(Color.BLACK);
        addCellButton.setEffect(effect);
         
        addCellButton.setTranslateY(10);
        addCellButton.setTranslateX(10);
         
        root.setTop(addCellButton);
        
        // ajouter la fonction du button (top left)
        addCellButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
                addGrid(gridpane);
            }
        });
  
        Stage.setScene(scene);
        Stage.show();
    }
     
    //ajouter des colonnes et rangées
    private void addGrid(GridPane gridpane){
        gridpane.getColumnConstraints().addAll(new ColumnConstraints(100,100,Double.MAX_VALUE));
        gridpane.getRowConstraints().addAll(new RowConstraints(100,100,Double.MAX_VALUE));
        createGrids(gridpane);
    }
     
    //créer des Grides
    private void createGrids(GridPane gridpane){
        gridpane.getChildren().clear();
        
        // for loop pour générer les contraintes définient en haut
        for(r=0;r<gridpane.getColumnConstraints().size(); r++){
            for(c=0; c<gridpane.getColumnConstraints().size(); c++){
              
            // le designe des grides
            Rectangle rect = new Rectangle(100,100);
            // création des troux dans la grides
            Circle circ = new Circle(47);
            circ.centerXProperty().set(50);
            circ.centerYProperty().set(50);
            
            // la forme des cellules et les couleurs
            Shape cell = Path.subtract(rect, circ);
            cell.setFill(Color.BLACK);
            cell.setStroke(Color.BLACK);
            cell.setOpacity(.8);
            
            // drop shadow pour les disques l
            DropShadow effect = new DropShadow();
            effect.setSpread(.2);
            effect.setRadius(25);
            effect.setColor(Color.BLACK);
            cell.setEffect(effect);
             
            // les preview des disques lors du mouvement du souris(mouse)
            Circle diskPreview = new Circle(40);
            diskPreview.setOpacity(.5);
            diskPreview.setFill(Color.TRANSPARENT);
             
            // confirmation des positions des disques par cliquer sur la souris 
            diskPreview.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.WHITE);
                    // changement de couleur pour les preview dependant de la positions 
                    if(playerColorProperty.get()==Color.AQUA){
                        diskPreview.setFill(Color.AQUA);
                    }else{
                        diskPreview.setFill(Color.MAGENTA);
                    }
                }
            });
             
            diskPreview.setOnMouseExited(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.TRANSPARENT);
                }
            });
            
            // les vrais disque, lorsque le joueur confirme la position les disques seront colorés avec une couleur opaque.
            Circle disk = new Circle(40);
            disk.fillProperty().bind(playerColorProperty);
            disk.setOpacity(.5);
            disk.setTranslateY(-(100*(r+1)));
             
            // la transition des disques 
            TranslateTransition translateTranstion = new TranslateTransition(Duration.millis(300), disk);
             
            disk.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.WHITE);
                    if(playerColorProperty.get()==Color.AQUA){
                        diskPreview.setFill(Color.AQUA);
                    }else{
                        diskPreview.setFill(Color.MAGENTA);
                    }
                }
            });
             
            disk.setOnMouseExited(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.TRANSPARENT);
                }
            });
             
            // methode pour effectuer la transition des disque 
            disk.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    
                    // changer de tour entre Aqua et Magenta
                    if(disk.getTranslateY()!=0){
                        translateTranstion.setToY(0);
                        translateTranstion.play();
                        if(playerColorProperty.get()==Color.AQUA){
                            playerColorProperty.set(Color.MAGENTA);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.AQUA));
                        }else{
                            playerColorProperty.set(Color.AQUA);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.MAGENTA));
                        }
                    }
                }
            });
             
            diskPreview.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    if(disk.getTranslateY()!=0){
                        translateTranstion.setToY(0);
                        translateTranstion.play();
                        if(playerColorProperty.get()==Color.AQUA){
                            playerColorProperty.set(Color.MAGENTA);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.AQUA));
                        }else{
                            playerColorProperty.set(Color.AQUA);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.MAGENTA));
                        }
                    }
                }
            });
             
            // stacker ensemble 
            StackPane stack = new StackPane();
            
            // ajouter tous ensemble
            stack.getChildren().addAll(cell, diskPreview, disk);
             
            gridpane.add(stack, c, r); 
             
                // changer la forme de l'effect selon le nombres des colonnes 
                if(r==gridpane.getColumnConstraints().size()-1){
                    stack.setEffect(new Reflection());
                }
            }
             
        }
    }
} 