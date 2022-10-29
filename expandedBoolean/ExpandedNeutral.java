package expandedBoolean;

public class ExpandedNeutral {
	
	
	protected static TruthLevels setDefaultBehave()
	{
		return TruthLevels.NEUT;
	}
	
	protected static void setBahave(TruthLevels neutralBehave, Reference point, TruthLevels newNeutral) throws InvalidPointException 
	{
		
		if(newNeutral == TruthLevels.TIRESIAS) neutralBehave = newNeutral; 
		else if(newNeutral == TruthLevels.NEUF) neutralBehave = newNeutral;
		else throw new InvalidPointException("This Truth level is not a part of Neutral interval");
		
	}

}
