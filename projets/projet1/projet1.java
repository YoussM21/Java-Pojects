import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class projet1 //la class 
{
    public static void main(String[] args) throws Exception
    {   // 
        String name1, name2, name3;
        int a, b, c, d;
        double w1, w2, w3;
    
            Scanner fileIn = new Scanner(new File("info.txt"));// gettting data from another file 
            //Scanner fileIn = new Scanner(new File(args[0])); // pour les tests
            a = fileIn.nextInt();
            name1 = fileIn.next();
            b = fileIn.nextInt();
            w1 = fileIn.nextDouble();
            name2 = fileIn.next();
            c = fileIn.nextInt();
            w2 = fileIn.nextDouble();
            name3 = fileIn.next();
            d = fileIn.nextInt();
            w3 = fileIn.nextDouble();
            fileIn.close();

            // creation des lists
            double maxweight = 0.0;
            String nom = "";
            double[] weightlist = new double []{w1, w2, w3};
            String[] namelist = new String[]{name1, name2, name3};
            for (int i = 0; i < weightlist.length; i++) // les conditions necessaires pour les nom et les masses
            {
              if (weightlist[i] >= maxweight)
              {
                  maxweight = weightlist[i];
                  nom = namelist[i];
              }
            }

        PrintWriter fileout = new PrintWriter("sortie.txt"); // afficher les resultats sur sortie.txt

        int sum; 
        sum = b + c + d;
        
        fileout.print(sum + " ");
        fileout.print(nom);
        fileout.close(); 
    }
}