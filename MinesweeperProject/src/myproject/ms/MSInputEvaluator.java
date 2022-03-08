package myproject.ms;

public class MSInputEvaluator extends MSLayoutManager {

	public static char[][] msOutLayout = new char[layoutIndex][layoutIndex];
	public static int msFlag = 0;

	{
		createOutLayout();
	}

	public char[][] evaluateResults(int inputCoOrdinates[]) {

		//for (int i = 0; i < inputCoOrdinates.length; i++) {
			//if (i % 2 == 0) {
				char msValue = msLayout[inputCoOrdinates[0]][inputCoOrdinates[1]];
				if (msValue == 'm') {
					System.out.println("Oops, you stepped on a mine !Game Over!");
					//msOutLayout[inputCoOrdinates[i]][inputCoOrdinates[i+1]] = 'm';
					msOutLayout[inputCoOrdinates[0]][inputCoOrdinates[1]] = 'm';
					msFlag = 1;
					return msOutLayout;
				} else {
					//msOutLayout[inputCoOrdinates[i]][inputCoOrdinates[i+1]] = '0';
					msOutLayout[inputCoOrdinates[0]][inputCoOrdinates[1]] = '0';
					return msOutLayout;
				}
			//}
		//}
		//return msOutLayout;
	}

	public void displayResults(int inputCoOrdinates[]) {
		char[][] msOutput = evaluateResults(inputCoOrdinates);
		for (int i = 0; i < layoutIndex; i++) {
			System.out.println("\n");
			for (int j = 0; j < layoutIndex; j++) {
				System.out.print(msOutLayout[i][j]);
			}
		}
	}
	
	public void displayResults(int inputCoOrdinates[],int playerInCount) {
		System.out.println("Wow,you have cleared the minefield !Game Over!");
		for (int i = 0; i < layoutIndex; i++) {
			System.out.println("\n");
			for (int j = 0; j < layoutIndex; j++) {
				System.out.print(msLayout[i][j]);
			}
		}
	}

	public void displayResults(int inputCoOrdinates[],char flag) {
		msOutLayout[inputCoOrdinates[0]][inputCoOrdinates[1]] = flag;
		for (int i = 0; i < layoutIndex; i++) {
			System.out.println("\n");
			for (int j = 0; j < layoutIndex; j++) {
				System.out.print(msOutLayout[i][j]);
			}
		}
	}
	
	protected void createOutLayout() {
		for (int i = 0; i < layoutIndex; i++) {
			for (int j = 0; j < layoutIndex; j++) {
				msOutLayout[i][j] = 'x';
			}
		}
	}

}
