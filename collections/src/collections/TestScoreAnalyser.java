package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyser {

	public static void main(String[] args) {
		int count=0;
		ScoreAnalyser score=new ScoreAnalyser();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter runs");
		int r = 0;
		for(int i=0;i<5;i++)
		{
			 r=scan.nextInt();
			 if(r!=0)
			 {
				 score.addRunsList(r);
				 count++;
			 }
		}
		System.out.println("runrate : " +score.calculateRunRate());
		System.out.println("lowest run:"+score.lowestRunScored());
		score.displayRuns();
		System.out.println("total players:" +count);
		scan.close();
	}

}
