/* Youssef Mroue 
driver file*/
public class Driver {
    public static void main(String[] args) 
    {
        Games play = new Games("Cold war" , "PC PS XBOX" , 100);
        System.out.println(play);
       
        Music album = new Music("J Cole" , "The Off-season" , 2021);
        System.out.println(album);
       
        SoccerTeams followers = new SoccerTeams("Real Madrid" , "Spain" , 98.2);
        System.out.println(followers);

    }
}
