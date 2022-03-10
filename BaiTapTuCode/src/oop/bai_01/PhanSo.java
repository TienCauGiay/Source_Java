package oop.bai_01;

public class PhanSo {
	private int t;
	private int m;

	public PhanSo() {

	}

	public PhanSo(int t, int m) {
		super();
		this.t = t;
		this.m = m;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "PhanSo [t=" + t + ", m=" + m + "]";
	}

	public PhanSo sum(PhanSo b) {
		PhanSo p = new PhanSo();
		p.t = this.t * b.m + this.m * b.t;
		p.m = this.m * b.m;
		return p;
	}

	public PhanSo sub(PhanSo b) {
		PhanSo p = new PhanSo();
		p.t = this.t * b.m - this.m * b.t;
		p.m = this.m * b.m;
		return p;

	}

	public PhanSo multi(PhanSo b) {
		PhanSo p = new PhanSo();
		p.t = this.t * b.t;
		p.m = this.m * b.m;
		return p;
	}

	public PhanSo div(PhanSo b) {
		PhanSo p = new PhanSo();
		p.t = this.t * b.m;
		p.m = this.m * b.t;
		return p;
	}

	public static int UCLN(int a, int b) {
		int r = 0;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public void rutGon() {
		int ucln = UCLN(this.t, this.m);
		if (ucln != 1) {
			this.t /= ucln;
			this.m /= ucln;
		}
	}

	public void soSanh(PhanSo b) {
		double t1 = (double) this.t / this.m;
		double t2 = (double) b.t / b.m;
		if (t1 > t2)
			System.out.println(this.toString() + " lon hon " + b.toString());
		if (t1 < t2)
			System.out.println(this.toString() + " nho hon " + b.toString());
		if (t1 == t2)
			System.out.println(this.toString() + " bang " + b.toString());
	}

	public double giaTriPhanSo() {
		return (double) this.t / this.m;
	}

	public PhanSo phanSoMax(PhanSo[] ps) {
		double max = ps[0].giaTriPhanSo();
		PhanSo maxx = new PhanSo();
		for (int i = 1; i < ps.length; i++) {
			if (ps[i].giaTriPhanSo() > max) {
				max = ps[i].giaTriPhanSo();
				maxx = ps[i];
			}
		}
		return maxx;
	}

	public double tongPhanSo(PhanSo[] ps) {
		double tong = 0;
		for (int i = 0; i < ps.length; i++) {
			tong += ps[i].giaTriPhanSo();
		}
		return tong;
	}

	public void checkPhanSoNguyen() {
		if (this.t % this.m != 0)
			System.out.println(this.toString() + " khong phai la so nguyen");
		if (this.t % this.m == 0)
			System.out.println(this.toString() + " la so nguyen");
	}
}
