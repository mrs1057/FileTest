package SkibidiToilet;

class rizzler {
	private String name;
	private int rizzLevel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRizzLevel() {
		return rizzLevel;
	}
	public void setRizzLevel(int rizzLevel) {
		this.rizzLevel = rizzLevel;
	}
}
public class OnlyInOhio extends rizz {
	public Boolean isSigma(rizzler sigma) {
		if(sigma.getRizzLevel() >= 90) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void hawkTuah() {
		System.out.println("Hawk Tuah");
	}
		
	
	public static void main(String[] args) {
		rizzler kaiCenat = new rizzler();
		kaiCenat.setName("Kai Cenat");
		kaiCenat.setRizzLevel(99);
		
		OnlyInOhio Ohio = new OnlyInOhio();
		System.out.println(Ohio.isSigma(kaiCenat));
		hawkTuah();
	}
}
