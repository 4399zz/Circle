import java.util.Scanner;

public class test {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入半径：");
		Circle v = new Circle();
		v.setR(input.nextInt());
		v.display();
		input.close();
	}
}
