package shapes.bai_03;

//Ä�Ã¢y lÃ  má»™t lá»›p áº£o chá»‰ chá»©a cÃ¡c phÆ°Æ¡ng thá»©c áº£o => thay tháº¿ nÃ³ báº±ng Interface
//ChÃº Ã½:
//1 - CÃ¡c phÆ°Æ¡ng thá»©c trong interface Ä‘á»�u lÃ  cÃ¡c phÆ°Æ¡ng thá»©c áº£o
//=> khÃ´ng cáº§n khai bÃ¡o tá»« khÃ³a abstract.

//2 - Gom cÃ¡c phÆ°Æ¡ng thá»©c cÃ³ cÃ¹ng má»¥c Ä‘Ã­ch vÃ o má»™t interface

public interface ShapesBienDoi extends ShapesInterface {
	// B. XÃ¢y dá»±ng cÃ¡c phÆ°Æ¡ng thá»©c biáº¿n Ä‘á»•i hÃ¬nh há»�c
	// XÃ¢y dá»±ng bá»™ khung cá»§a Ä‘á»‘i tÆ°á»£ng - xÃ¡c Ä‘á»‹nh cÃ¡c hÃ nh vi cá»§a Ä‘á»‘i tÆ°á»£ng
	// 1. PhÆ°Æ¡ng thá»©c dá»‹ch chuyá»ƒn
	public void move(double dx, double dy);

	// 2. PhÆ°Æ¡ng thá»©c xoay
	public void rotate(double alpha);

	// 3. PhÆ°Æ¡ng thá»©c zoom
	public void zoom(double ratio);

	// 4. PhÆ°Æ¡ng thá»©c tÃ¢m
	public Point center();
}
