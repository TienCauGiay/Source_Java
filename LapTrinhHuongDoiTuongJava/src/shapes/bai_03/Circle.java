package shapes.bai_03;

//ThÃ´ng qua trá»«u tÆ°á»£ng hÃ³a: lá»›p Rectangle vÃ  lá»›p Circle => quan há»‡ anh em.
//XÃ¢y dá»±ng má»™t há»� cÃ¡c Ä‘á»‘i tÆ°á»£ng cÃ³ cÃ¹ng cÃ¡c phÆ°Æ¡ng thá»©c => xÃ¢y dá»±ng bá»™ khung
//cho há»� cÃ¡c Ä‘á»‘i tÆ°á»£ng.

//Vá»›i abstract class: chÃºng ta sá»­ dá»¥ng káº¿ thá»«a [extends]
//Vá»›i interface: chÃºng ta sá»­ dá»¥ng cÃ i Ä‘áº·t [implements]

public class Circle implements ShapesBienDoi, ShapesTinhToan {
	private Point tam;
	private double r;

	public Circle(Point tam, double r) {
		super();
		this.tam = tam;
		this.r = r;
	}

	public Point getTam() {
		return tam;
	}

	public void setTam(Point tam) {
		this.tam = tam;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [tam=" + tam + ", r=" + r + "]";
	}

	@Override
	public double area() {
		return Math.PI * r * r;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * r;
	}

	@Override
	public void move(double dx, double dy) {
		this.tam.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		// N.A (Ä�Æ°á»�ng trÃ²n xoay bao nhiÃªu Ä‘á»™ thÃ¬ váº«n giá»¯ nguyÃªn)

	}

	@Override
	public void zoom(double ratio) {
		this.r *= ratio;
	}

	@Override
	public Point center() {
		return this.tam;
	}

}
