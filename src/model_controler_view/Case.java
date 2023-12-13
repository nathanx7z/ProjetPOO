package model_controler_view;

import java.util.List;

public class Case {

	private Herbe herbe;
	private Sels_Min sels_Min;
	private Loup loup;
	private Mouton mouton;

	public Case(Herbe herbe, Sels_Min sels_Min, Loup loup, Mouton mouton) {
		super();
		this.herbe = herbe;
		this.sels_Min = sels_Min;
		this.loup = loup;
		this.mouton = mouton;
	}

	public Herbe getHerbe() {
		return herbe;
	}

	public void setHerbe(Herbe herbe) {
		this.herbe = herbe;
	}

	public Sels_Min getSels_Min() {
		return sels_Min;
	}

	public void setSels_Min(Sels_Min sels_Min) {
		this.sels_Min = sels_Min;
	}

	public Loup getLoup() {
		return loup;
	}

	public void setLoup(Loup loup) {
		this.loup = loup;
	}

	public Mouton getMouton() {
		return mouton;
	}

	public void setMouton(Mouton mouton) {
		this.mouton = mouton;
	}
	
}
