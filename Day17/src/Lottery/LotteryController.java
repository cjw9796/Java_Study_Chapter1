package Lottery;

import java.util.HashSet;

public class LotteryController extends LotteryMenu{
	
	
	private HashSet<Lottery> win = new HashSet<>(); // 당첨대상을 담을 hashset 객체 생성 
	
	boolean insertObject(String list, Lottery temp) {
		 HashSet<Lottery> lottery = new HashSet<>(); //추첨대상을 담을 hashset 객체 생성 
		lottery.add(mc.name);
		
		return true;
	}
	boolean deleteObject() {
		
		lottery.remove();
		
		return true;
	}
	HashSet<Lottery> winObject() {
		return win;
	}
	TreeSet<Lottery> sortedWinObject() {
		
		return null;
	}
	boolean searchWinner() {
		return true;
	}
	

}