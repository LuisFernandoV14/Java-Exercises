package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt( (Math.pow(width, 2) + Math.pow(height, 2)));
	}
	
	public void showResults() {
		System.out.printf("\nArea = %.2f\n", this.Area());
		System.out.printf("Perímetro = %.2f\n", this.Perimeter());
		System.out.printf("Diagonal = %.2f\n", this.Diagonal());
	}

}
