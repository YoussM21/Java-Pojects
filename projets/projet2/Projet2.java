import java.io.IOException;

// defining a record called Games
class Game {
String name;
String releasedate;
double playtime;
}

//here our real class starts (public)
public class Projet2 {
    public static void main (String[] args) throws IOException {
      
      // ps is a variable that could refer to an array of games
      Game[] ps;
      // initializing ps 
      ps = new Game[5];  
      
      // array of games(elements) 
      ps[0] = new Game();
      ps[0].name = "<COD warzone>";
      ps[0].releasedate = "10-3-2020";
      ps[0].playtime = 2.5;

      ps[1] = new Game();
      ps[1].name = "<COD cold war>";
      ps[1].releasedate = "13-11-2020";
      ps[1].playtime = 1.7;

      ps[2] = new Game();
      ps[2].name = "<FIFA21>";
      ps[2].releasedate = "6-10-2020";
      ps[2].playtime = 2.7;

      ps[3] = new Game();
      ps[3].name = "<Apex>";
      ps[3].releasedate = "4-2-2019";
      ps[3].playtime = 1.5;

      ps[4] = new Game();
      ps[4].name = "<NBA 2k21>";
      ps[4].releasedate = "4-9-2020";
      ps[4].playtime = 0.9;

      // creating a for each loop to display the arrays 
      for (int i=0; i < ps.length; i++ ) {
          System.out.print("\n" + ps[i].name + " est un jeu qui a été publié le ");
          System.out.print(ps[i].releasedate + ". je l'ai joué pendant ");
          System.out.println(ps[i].playtime + " jours");
      }
      
      //defining a string called fav
      String fav ="";
         
      // creating a loop to get the data from an array 
      for (int i=0; i < ps.length; i++) {
        
        // gets the second last element of the array 
        if (i == ps.length-2){
            fav = ps[i].name;    
        } 
        else {}
      }  

      // print out the results
        {
        System.out.println("\nl'avant dernier élément du tableau est " + fav);
        }    
  }
}
