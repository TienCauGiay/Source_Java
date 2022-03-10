package baitap1_oop;

public class duongthang {
	private double HSa;
	private double HSb;

	public duongthang() {
		HSa = 0;
		HSb = 0;
	}

	public duongthang(double hSa, double hSb) {
		super();
		HSa = hSa;
		HSb = hSb;
	}

	public double getHSa() {
		return HSa;
	}

	public void setHSa(double hSa) {
		HSa = hSa;
	}

	public double getHSb() {
		return HSb;
	}

	public void setHSb(double hSb) {
		HSb = hSb;
	}

	@Override
	public String toString() {
		return "y = " + HSa + "x + " + HSb;
	}

	public double khoangCach() {
		return Math.abs(HSb) / Math.sqrt(HSa * HSa + 1);
	}

	public boolean checkPoint(double x, double y) {
		double kt = HSa * x - y + HSb;
		if (kt == 0)
			return true;
		return false;
	}
}
