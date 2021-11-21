package day4;

public class SnakesL {

	public static void roll() {
		int dice1, dice2, s = 0, i = 0, e;
		while (s < 100) {
			if (s < 0) {
				s = 0;
			} else {
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 3);
				if (dice2 == 0) {
					System.out.println("No Play");
				} else if (dice2 == 1) {
					System.out.println("Ladder - Player moves ahead by " + dice1);
					i++;
					e = s;
					s = s + dice1;
					System.out.println("Position of Player " + s);
					if (s > 100) {
						s = e;
					} else if (s == 100) {
						System.out.println("Player reached " + s + " and won by rolling the dice " + i + " times");
						System.exit(0);
					} else {
						continue;
					}
				} else {
					System.out.println("Snake - Player moves behind by " + dice1);
					s = s - dice1;
				}
			}
		}

	}

	public static void main(String[] args) {
		roll();
	}
}