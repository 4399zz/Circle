
public class Circle {
	private static double PI = 3.14;
	private double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	//面积
	public double area() {
		double area = PI * r * r;
		return area;
	}
	//周长
	public double circumference() {
		double circumference = 2 * PI *r;
		return circumference;
	}
	public void display() {
		System.out.println("圆的面积：+"+area()+"\n圆的周长为："+circumference());
	}
}
