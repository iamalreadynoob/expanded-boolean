package expandedBoolean;

public class Reference {
	
	public static final double BASIC = 0.5;
	
	private double referencePoint;
	
	public Reference(double referencePoint) throws InvalidPointException
	{
		
		if(referencePoint > 0 && referencePoint < 1) this.referencePoint = referencePoint;
		else throw new InvalidPointException("Reference which is defined is out of the limits");
		
	}
	
	public void setReference(double referencePoint) throws InvalidPointException
	{

		if(referencePoint > 0 && referencePoint < 1) this.referencePoint = referencePoint;
		else throw new InvalidPointException("Reference which is defined is out of the limits");
		
	}

	public double getterReference()
	{
		return referencePoint;
	}
	
}
