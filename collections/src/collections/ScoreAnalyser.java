package collections;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

class ScoreAnalyser 
{
	int avg=0;
	int total=0;

	public ScoreAnalyser() 
	{
		super();
	}
	private LinkedList<Integer> runData=new LinkedList<Integer>();

	public void addRunsList( int runs)
	{

		runData.add(runs);	

	}

	public int calculateRunRate()
	{

		for(int i=0;i<runData.size();i++)
		{
			total=total+runData.get(i);
			avg=total/50;
		}
		return avg;
	}
	public int lowestRunScored()
	{
		int min=Collections.min(runData); 
		return min;
	}
	public void displayRuns()
	{
		for(Integer r:runData)
		{
			System.out.println(r);
		}
	}
}