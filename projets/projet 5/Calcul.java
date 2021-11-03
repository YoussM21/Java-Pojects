public class Calcul {
	private int width,length;
	
	public Calcul(int width, int length) {
		this.width=width;
		this.length=length;
	}
// getter methode for width
	public int getWidth() {
		return width;
	}
//setter methode for width 
	public void setWidth(int width) {
		this.width = width;
	}
//getter methode for length
	public int getLength() {
		return length;
	}
//setter methode for length 
	public void setLength(int length) {
		this.length = length;
	}
	
//introduce a new int, and define 
	public int area() {
		return width*length;
	}
// to string methode	
	public String toString() {
		return "Area of rectangle of width: "+getWidth()+ " and length: "+ getLength()+" is: ";
	}
}
