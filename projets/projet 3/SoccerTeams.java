public class SoccerTeams {
    String Name;
    String country;
    double follower;


    public SoccerTeams( String Name, String country, double follower)
    {
      this.Name = Name;
      this.country = country;
      this.follower = follower;
    }
public String toString()
{
    return "Name: " + this.Name + ", Country: " + this.country + ", Insta. followers: " + this.follower;
}
}
