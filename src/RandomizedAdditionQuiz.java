import javax.swing.JOptionPane;

public class RandomizedAdditionQuiz {

	public static void main(String[] args) {
		String response;
		int a;
		int b;
		int Answer;
		double correct = 0;
		double wrong = 0;
		double percent;

		do {

			a = (int) (Math.random() * 101);
			b = (int) (Math.random() * 101);

			response = JOptionPane.showInputDialog("What is " + a + "+" + b + "?");
			Answer = Integer.parseInt(response);

			if (Answer == a + b) {
				correct = correct + 1;
				percent = 100 * correct / (correct + wrong);
				System.out.println("Correct! so far you have answered " + percent + "% of my questions correctly");

			}

			if (Answer != a + b) {
				wrong = wrong + 1;
				percent = 100 * correct / (correct + wrong);
				System.out.println("Wrong! So far you have answered " + percent + "% of my questions correctly");
			}

			if (correct == 3) {
				percent = 100 * correct / (correct + wrong);
				System.out.println("You win! Good job. You answered " + percent + "% of my questions correctly");

			}

		} while (correct < 3);

	}

}
