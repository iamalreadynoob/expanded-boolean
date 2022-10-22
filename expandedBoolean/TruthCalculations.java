package expandedBoolean;

public class TruthCalculations {
	
	public void add(double add, Gact obj) throws InvalidPointException
	{
		if(obj.getterTruth() + add <= 1) obj.setterTruth(obj.getterTruth() + add);
		else throw new InvalidPointException("New truth value which is defined is out of the limits");
	}
	
	public void subtract(double minus, Gact obj) throws InvalidPointException
	{
		if(obj.getterTruth() - minus >= 0) obj.setterTruth(obj.getterTruth() - minus);
		else throw new InvalidPointException("New truth value which is defined is out of the limits");	
	}

}
