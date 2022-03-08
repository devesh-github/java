package myproject.ms;


import java.util.Scanner;

public class Minesweeper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * String inputLayout[] = new String[3]; int inputCoOrdinates[] = new
		 * int[2];
		 * 
		 * System.out.println(
		 * "Please enter the Minesweeper Layout and iput co-ordinate:"); int
		 * countInCoOrd = 0; for (int i = 0; i < 5; i++) {
		 * System.out.println(args[i]); if (args[i] != null) { if (i < 3) {
		 * inputLayout[i] = args[i]; } else { inputCoOrdinates[countInCoOrd] =
		 * Integer.parseInt(args[i]); countInCoOrd++; } } }
		 * 
		 * // Getting the Minesweeper Layout //
		 * System.out.println("Please enter the Minesweeper Layout :");
		 * MSLayoutManager msLayout = new MSLayoutManager();
		 * msLayout.setMSLayout(inputLayout);
		 * 
		 * System.out.println("Please enter the co-ordinates :");
		 * MSInputEvaluator msInEvaluator = new MSInputEvaluator();
		 * System.out.println("Output MSLayout");
		 * msInEvaluator.displayResults(inputCoOrdinates);
		 */

		System.out.println("Please enter the Minesweeper Layout :");
		Scanner inputLayout = new Scanner(System.in);
		String inputMSLayout = inputLayout.nextLine();
		if (inputMSLayout != null) {
			String playerInput[] = inputMSLayout.split(",");
			MSLayoutManager msLayout = new MSLayoutManager();
			msLayout.setMSLayout(playerInput);
		}

		MSInputEvaluator msInEvaluator = new MSInputEvaluator();
		System.out.println("\n");
		int playerInCount = 0;
		while (MSInputEvaluator.msFlag == 0) {
			System.out.println("Please enter the co-ordinates :");
			Scanner inputMSCoOrdinates = new Scanner(System.in);
			String playerMSInputCo = inputMSCoOrdinates.nextLine();
			
			System.out.println("Do you want to flag the square :");
			Scanner inputMSFlag = new Scanner(System.in);
			String playerMSFlag = inputMSFlag.nextLine();
			
			int inputCoOrdinates[] = new int[2];
			if (playerMSInputCo != null) {
				String playerInputCo[] = playerMSInputCo.split(",");
				inputCoOrdinates[0] = Integer.parseInt(playerInputCo[0]);
				inputCoOrdinates[1] = Integer.parseInt(playerInputCo[1]);
				System.out.println("Output MSLayout----------------------------------------------------->");
				if(playerInCount==7){
					msInEvaluator.displayResults(inputCoOrdinates,playerInCount);
					break;
				} else if (playerMSFlag.equals("Y")){
					msInEvaluator.displayResults(inputCoOrdinates, 'f');
				} else {
					msInEvaluator.displayResults(inputCoOrdinates);
				}
				
			}
			playerInCount++;
		}
	}
}
