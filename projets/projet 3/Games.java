public class Games {
    String Name;
    String platform;
    int num;

    public Games( String Name, String platform, int num)
    {
      this.Name = Name;
      this.platform = platform;
      this.num = num;
    }
public String toString()
{
    return "Name: " + this.Name + ", Available platforms: " + this.platform + ", Number of players: " + this.num;
}
}