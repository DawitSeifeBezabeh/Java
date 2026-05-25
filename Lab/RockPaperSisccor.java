import java.util.Scanner;
public class RockPaperSisccor{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		String p1;
		System.out.println("Player 1 enter your choice of P, S, or R: ");
		p1 = keyboard.next();
		p1 = p1.toLowerCase();

		String p2;
		System.out.println("Player 2 enter your choice of P, S, or R: ");
		p2 = keyboard.next();
		p2 = p2.toLowerCase();
		
		if (!p1.equals("r") && !p1.equals("p") && !p1.equals("s")) {
    			System.out.println("Invalid input for Player 1.");
    			return;
		}
		if (!p2.equals("r") && !p2.equals("p") && !p2.equals("s")) {
    			System.out.println("Invalid input for Player 2.");
    			return;
		}

		if(p1.equals(p2)){
			System.out.println("You both have the same choice lol.");
		}
		else if(p1.equals("s") && p2.equals("p")){
			System.out.println("Player 1 Wins.\nSiscoor cuts Paper.");
		}
		else if(p1.equals("p") && p2.equals("s")){
			System.out.println("Player 2 Wins.\nSiscoor cuts Paper.");
		}
		else if(p1.equals("p") && p2.equals("r")){
			System.out.println("Player 1 Wins.\nPaper covers Rock.");
		}
		else if(p1.equals("r") && p2.equals("p")){
			System.out.println("Player 2 Wins.\nPaper covers Rock.");
		}
		else if(p1.equals("r") && p2.equals("s")){
			System.out.println("Player 1 Wins.\nRock breaks Siscoor.");
		}
		/*else if(p1.equals("s") && p2.equals("r")){
			System.out.println("Player 2 Wins.\nRock breaks Siscoor.");
		}*/
	}
}