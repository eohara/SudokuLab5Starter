package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private int iDifficultyValue;
	
	
	private static final Map<Integer,eGameDifficulty> eGDMap = new HashMap<Integer, eGameDifficulty>();
	
	
	static {
        for (eGameDifficulty eGD : eGameDifficulty.values()) {
            eGDMap.put(eGD.getiDifficultyValue(), eGD);
        }
    }

    private eGameDifficulty(int iDifficultyValue) {
        this.iDifficultyValue = iDifficultyValue;
    }

    public int getiDifficultyValue() {
        return iDifficultyValue;
    }

    public eGameDifficulty get(int iDifficultyValue) {
        return eGDMap.get(iDifficultyValue);
    }
	
	
	
}