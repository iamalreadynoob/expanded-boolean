package expandedBoolean;

public class Comparison extends TruthLevelTier {
	
	public boolean singleComparison(Gact obj, Reference point)
	{
		
		TruthLevels level = obj.level(point);
		
		if(level == TruthLevels.FALSE || level == TruthLevels.AFALSE) return false;
		else if(level == TruthLevels.NEUTRAL) 
		{
			if(obj.getterNeutralize() == true) return true;
			else return false;
		}
		else return true;
		
	}
	
	public boolean compare(Gact requested, Gact compareWith, Reference point)
	{

		return TruthLevelTier.tierComparison(requested, compareWith, point);
		
	}
	
	public boolean specificCompare(Gact requested, Gact compareWith, Reference point)
	{
		
		if((requested.getterTruth() > compareWith.getterTruth()) || ((requested.getterTruth() == compareWith.getterTruth()) && requested.getterTruth() > point.getterReference())) return true;
		else return false;
		
	}

}
