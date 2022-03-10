package baitap1_oop;

public class matphang extends duongthang {
	private double HSc;

	public matphang() {
		super();
		HSc = 0;
	}

	public matphang(double a, double b, double c) {
		super(a, b);

		HSc = c;
	}

	public double getHSc() {
		return HSc;
	}

	public void setHSc(double hSc) {
		HSc = hSc;
	}

	@Override
	public String toString() {
		return "z = " + this.getHSa() + "x + " + this.getHSb() + "y + " + HSc;
	}

	public double khoangCach() {
		return Math.abs(HSc) / Math.sqrt(super.khoangCach() * super.khoangCach() + HSc * HSc);
	}

	public boolean checkPoint(double x, double y, double z) {
		double kt = this.getHSa() * x + this.getHSb() * y - z + this.getHSc();
		if (kt == 0)
			return true;
		return false;
	}
}
