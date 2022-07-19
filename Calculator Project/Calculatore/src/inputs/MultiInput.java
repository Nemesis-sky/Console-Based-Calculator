package inputs;
import java.util.Scanner;
public class MultiInput {
Integer x=0;
Integer y=0;
public Integer getX() {
	return x;
}
public void setX(Integer x) {
	this.x = x;
}
public Integer getY() {
	return y;
}
public void setY(Integer y) {
	this.y = y;
}
public static int[] takeInput() {
	MultiInput mi=new MultiInput();
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter the first value");
		mi.setX(sc.nextInt());
		System.out.println("Enter the Second value");
		mi.setY(sc.nextInt());
	}catch(Exception e) {
		System.out.println("Problem because of "+e);
	}
	int[] variable=new int[2];
	variable[0]=mi.getX();
	variable[1]=mi.getY();
	return variable;

}

}
