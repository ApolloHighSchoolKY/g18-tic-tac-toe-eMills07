//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int x = file.nextInt();
		file.nextLine();
		for(int i = 0; i < x; i++)
		{
		TicTacToe game = new TicTacToe(file.nextLine());

		
		//Read how many times you should read

		//TicTacToe only want this: file.nextline()
		//Make a TicTacToe for each game in the file
		//Print the game (TicTacToe)
		System.out.println(game);
		//Print the winner
		System.out.println(game.getWinner() + "\n\n");
		}
		file.close();
	}
}



