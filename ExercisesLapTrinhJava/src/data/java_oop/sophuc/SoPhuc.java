package data.java_oop.sophuc;

public class SoPhuc {
	// Attributes
	private double a;
	private double b;

	// Constructors
	public SoPhuc() {
		super();
		this.a = 1.0;
		this.b = -1.0;
	}

	public SoPhuc(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	// Getter and setter
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		if (this.b < 0) {
			return "z=" + a + b + "i";
		} else {
			return "z=" + a + "+" + b + "i";
		}
	}

	// Methods
	public SoPhuc congHaiSoPhuc(SoPhuc sp2) {
		double thuc = this.a + sp2.a;
		double ao = this.b + sp2.b;
		return new SoPhuc(thuc, ao);
	}

	public double modulus() {
		double result = this.a * this.a + this.b * this.b;
		return Math.sqrt(result);
	}

	public boolean demSoPhucKhongCoPhanAo() {
		if (this.b == 0.0) {
			return true;
		} else {
			return false;
		}
	}

}
