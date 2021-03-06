/*
As ICC cricket world cup is going to be held in
Australia in the month of February, Indian team's
captain MSD decided to practice hard and try to
win this consecutive world cup title. He is very
much concern about his three slip fielders who
are going to play crucial part on that hard and
bouncy pitches of Perth and MCG.
Captain cool decided a very weird method to practice slip catches, he asked his three fielders to stand on the ground forming a triangle then he measures the distance as real number A between slip fielder 1 and 2, B between fielder 2 and 3 and C between fielder 3 and 1. After setting their position he tells the groundsmen to draw a circle so that it touches all the three players. But groundsmen is very weak in geometry and wants to know the radius of the circle, so he gives this problem to his son who studies in BIT Deoghar and asks him to write a code for this so he can draw this type of circle in future as well.
Input:

First line of input file contains the number of test cases T.
Next T lines contains real numbers A,B, and C on each line of Input file.
Output:

In each case output the radius of the circle correct up to 2 decimal places.
Constraints:

1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 500
Example

Input:
2
4.00 5.00 6.00
3.00 9.00 8.00

Output:
3.02
4.56

*/

import java.io.*;
import java.util.*;

class PRAC
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		Double rad[] = new Double[t];
		Double a,b,c;
		int n=t;
		while(n>0)
		{
			a = s.nextDouble();
			b = s.nextDouble();
			c = s.nextDouble();
			rad[n-1] = (a*b*c)/(Math.sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c)));
			--n;
		}
		n=t-1;
		while(n>=0)
		{
			//System.out.println(rad[n]);
			System.out.println(String.format("%.2f", rad[n]));
			--n;
		}



	}
}