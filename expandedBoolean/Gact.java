package expandedBoolean;

public class Gact  
{
	
	private double truth;
	private TruthLevels neutralBehave = TruthLevels.NEUT;
	private Boolean tiresiasBehaviour = null;
		
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

		if(truth <= 1 && truth >= 0) this.truth = truth;
		else throw new InvalidPointException("Truth value which is defined is out of the limits");
		
	}
	
	public boolean getterTiresiasBehaviour(Reference point) throws InvalidPointException
	{
		
		if(level(point) == TruthLevels.TIRESIAS) return tiresiasBehaviour;
		else throw new InvalidPointException("This is not TIRESIAS");
		
	}
	
	public void setterTiresiasBehaviour(boolean tiresiasBehaviour, Reference point) throws InvalidPointException
	{
		if(level(point) == TruthLevels.TIRESIAS) this.tiresiasBehaviour = tiresiasBehaviour;
		else throw new InvalidPointException("This is not TIRESIAS");
	}
	
	
	public TruthLevels level(Reference point)
	{
		
		if(truth == 0) return TruthLevels.FALSE;	
		else if(truth < point.getterReference()) return TruthLevels.AFALSE;
		else if(truth == point.getterReference()) return neutralBehave;
		else if(truth > point.getterReference() && truth != 1) return TruthLevels.ATRUE;
		else return TruthLevels.TRUE;
		
	}
	
	
	
	public void changeNeutralBehaviour(Reference point, TruthLevels newNeutral) throws InvalidPointException
	{
		ExpandedNeutral.setBahave(neutralBehave, point, newNeutral);
	}
	
}
