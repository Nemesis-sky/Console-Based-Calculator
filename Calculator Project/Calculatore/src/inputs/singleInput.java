package inputs;

import java.util.Scanner;

public class singleInput {
	private Integer x = 0;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public static int takeInput() {
		Scanner sc = new Scanner(System.in);
		singleInput sn = new singleInput();
		System.out.println("Enter the value");
		try {
			sn.setX(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Problem because of " + e);
		}
		int variable = sn.getX();
		return variable;
	}
}
