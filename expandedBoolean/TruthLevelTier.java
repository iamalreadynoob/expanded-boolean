package expandedBoolean;

public abstract class TruthLevelTier {
	
	protected static boolean tierComparison(Gact obj1, Gact obj2, Reference point)
	{
		
		TruthLevels lvl1 = obj1.level(point);
		TruthLevels lvl2 = obj2.level(point);
		
		if(lvl1 == TruthLevels.TRUE && lvl2 != TruthLevels.TRUE) return true;
		else if(lvl2 == TruthLevels.TRUE || lvl1 == TruthLevels.FALSE) return false;
		else if(lvl1 != TruthLevels.FALSE && lvl2 == TruthLevels.FALSE) return true;
		else if((lvl1 == TruthLevels.ATRUE && lvl2 == TruthLevels.ATRUE) || (lvl1 == TruthLevels.AFALSE && lvl2 == TruthLevels.AFALSE) || (lvl1 == TruthLevels.NEUTRAL && lvl2 == TruthLevels.NEUTRAL)) return false;
		else if((lvl1 == TruthLevels.ATRUE && lvl2 == TruthLevels.NEUTRAL) || (lvl1 == TruthLevels.ATRUE && lvl2 == TruthLevels.AFALSE) || (lvl1 == TruthLevels.NEUTRAL && lvl2 == TruthLevels.AFALSE)) return true;
		else return false;
		
	}

}
