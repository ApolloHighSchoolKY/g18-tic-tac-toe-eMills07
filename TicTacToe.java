//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat = new char[3][3];

	public TicTacToe()
	{
		int letter = 0;
		String game = "XXXOOXXOO";

	for(int i = 0; i < mat.length; i++)
		for(int j = 0; j < mat[0].length; j++)
		{
			mat[i][j] = game.charAt(letter);
			letter++;
		}
	}

	public TicTacToe(String game)
	{

		int letter = 0;

	for(int i = 0; i < mat.length; i++)
		for(int j = 0; j < mat[0].length; j++)
		{
			mat[i][j] = game.charAt(letter);
			letter++;
		}

	}

	public String getWinner()
	{
		//String winner = "";
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
		{
			return mat[0][0] + " wins horizontally!";
		}
		else if(mat[1][0] == mat[1][1] && mat[2][1] == mat[1][2])
		{
			return mat[1][0] + " wins horizontally!";
		}
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])
		{
			return mat[2][0] + " wins horizontally!";
		}
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
		{
			return mat[2][0] + " wins vertically!";
		}
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])
		{
			return mat[2][1] + " wins vertically!";
		}
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
		{
			return mat[2][2] + " wins vertically!";
		}
		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
		{
			return mat[0][0] + " wins diagnoly!";
		}
		else if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
		{
			return mat[2][0] + " wins diagnolly!";
		}
		else
		{
			return "cat's game - No Winner";
		}






	}

	public String toString()
	{
		String output="";




		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[0].length; j++)
			{
				output += mat[i][j] + " ";
			}
			output += "\n";
		}

		return output+"";
	}
}