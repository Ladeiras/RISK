package logic;

public class Card
{
	public static final int INFANTRY = 0;
	public static final int CAVALRY = 1;
	public static final int ARTILLERY = 2;
	
	private int symbol;
	private boolean picked;
	private boolean used;

	public Card(int symbol) {
		super();
		this.symbol = symbol;
		this.picked = false;
		this.used = false;
	}

	public int getSymbol() {
		return symbol;
	}

	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}

	public boolean isPicked() {
		return picked;
	}

	public void setPicked(boolean picked) {
		this.picked = picked;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}
}
