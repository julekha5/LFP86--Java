package day4;

import java.util.Random;

//Player rolls the die get number between 1 to 6

public class SnakeLadderUC2 {
	public static void main(String[] args) {
		int num = rollDice();
		System.out.println(num);

		// another logic
		int x = (int) (Math.random() * 6) + 1;
		System.out.println("The Number On Dice is:" + x);

	}

	public static int rollDice() {
		int n = 0;
		Random r = new Random();
		n = r.nextInt(7);
		return (n == 0 ? 1 : n);

	}
}
