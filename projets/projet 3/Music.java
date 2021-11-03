public class Music { 
    String Name;
    String album;
    int date;

    public Music( String Name, String album, int date)
    {
      this.Name = Name;
      this.album = album;
      this.date = date;
    }
public String toString()
{
    return "Name: " + this.Name + ", Album: " + this.album + ", Date: " + this.date;
}
}


