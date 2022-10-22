package expandedBoolean;

public class Gact  
{
	
	private double truth;
	private Boolean neutralize = null;
		
	public Gact(double truth)
	{
		this.truth = truth;
	}
	
	public double getterTruth()
	{
		return truth;
	}
	
	public void setterTruth(double truth) throws InvalidPointException
	{

		if(truth < 1 && truth > 0) this.truth = truth;
		else throw new InvalidPointException("Truth value which is defined is out of the limits");
		
	}
	
	public boolean getterNeutralize()
	{
		return neutralize;
	}
	
	public void setterNeutralize(boolean newBehave)
	{
		neutralize = newBehave;
	}
	
	
	public TruthLevels level(Reference point)
	{
		
		if(truth == 0) return TruthLevels.FALSE;	
		else if(truth < point.getterReference()) return TruthLevels.AFALSE;
		else if(truth == point.getterReference()) 
		{
			
			ExpandedNeutral newNeutral = new ExpandedNeutral();
			neutralize = newNeutral.setDefaultBehave();
			
			return TruthLevels.NEUTRAL;
			
		}
		else if(truth > point.getterReference() && truth != 1) return TruthLevels.ATRUE;
		else return TruthLevels.TRUE;
		
	}
	
	
	
	

}
