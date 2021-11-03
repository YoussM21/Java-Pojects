import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        
        System.out.println("Welcome to Euro quiz!\n" + "Pour quitter taper 'd' ");

        // créer les questions 
          String q1 ="Depuis quand l'UEFA Euro existe-t-il?\n" 
          + "(a)1963\n(b)1972\n(c)1960\n";
        
          String q2 = "Combien d'équipes ont gagné l'Euro 3 fois ?\n" 
          + "(a)2\n(b)1\n(c)3\n";

          String q3 = "Combien d'équipes participent au tournoi ?\n"
          + "(a)18\n(b)16\n(c)24\n";

          String q4 = "Qui est le meilleur buteur de l'histoire du tournoi ?\n"
          + "(a)Cristiano Ronaldo\n(b)Michel Platini\n(c)thierry Henry\n";

          // créer un array des questions et des réponses
          Question [] questions = {
              new Question (q1, "c"),
              new Question (q2, "a"),
              new Question (q3, "b"),
              new Question (q4, "a")
            };
          takeTest(questions);
    }
    // créer une méthode qui va nous permettre de noté le score et jouer le quiz 
    public static void takeTest(Question [] questions){
        String d;
        int score = 0;
        
        // scanner pour les réponses de l"utilisateur
        Scanner keyboardInput = new Scanner(System.in);

        // créer un for loop pour gérer les questions et compter le score
        for (int i = 0; i < questions.length; i++) {
            
            // nous avons accès aux questions à cause du tableau(array)
            System.out.println(questions[i].prompt);
            
            // variable pour stocker les réponses
            String answer = keyboardInput.nextLine();
            
            // if statement pour checker si les réponses sont correct ou non
            if (answer.equals(questions[i].answer)) {
                score++;
            }
           
            // conditions pour quitter le quiz 
            if (answer.equals("d")) {
                System.exit(0);
            }   
         }
        // afficher le score final
        System.out.println("Vous avez " + score + "/" + questions.length + " des questions correctes!");
    } 
}