package shapes.bai_03;

//Ä�Ã¢y lÃ  má»™t lá»›p áº£o chá»‰ chá»©a cÃ¡c phÆ°Æ¡ng thá»©c áº£o => thay tháº¿ nÃ³ báº±ng Interface
//ChÃº Ã½:
//1 - CÃ¡c phÆ°Æ¡ng thá»©c trong interface Ä‘á»�u lÃ  cÃ¡c phÆ°Æ¡ng thá»©c áº£o
//=> khÃ´ng cáº§n khai bÃ¡o tá»« khÃ³a abstract.

//2 - Gom cÃ¡c phÆ°Æ¡ng thá»©c cÃ³ cÃ¹ng má»¥c Ä‘Ã­ch vÃ o má»™t interface

public interface ShapesTinhToan extends ShapesInterface {
	// A. XÃ¢y dá»±ng cÃ¡c phÆ°Æ¡ng thá»©c hÃ¬nh há»�c
	// XÃ¢y dá»±ng bá»™ khung cá»§a Ä‘á»‘i tÆ°á»£ng - xÃ¡c Ä‘á»‹nh cÃ¡c hÃ nh vi cá»§a Ä‘á»‘i tÆ°á»£ng
	// 1. PhÆ°Æ¡ng thá»©c tÃ­nh diá»‡n tÃ­ch
	// - ChÆ°a xÃ¡c Ä‘á»‹nh Ä‘Æ°á»£c cÃ¡ch thá»©c cÃ i Ä‘áº·t phÆ°Æ¡ng thá»©c
	// => trá»«u tÆ°á»£ng hÃ³a phÆ°Æ¡ng thá»©c: sá»­ dá»¥ng tá»« khÃ³a abstract

	public double area();

	// 2. PhÆ°Æ¡ng thá»©c tÃ­nh chu vi
	// - ChÆ°a xÃ¡c Ä‘á»‹nh Ä‘Æ°á»£c cÃ¡ch thá»©c cÃ i Ä‘áº·t phÆ°Æ¡ng thá»©c
	// => trá»«u tÆ°á»£ng hÃ³a phÆ°Æ¡ng thá»©c: sá»­ dá»¥ng tá»« khÃ³a abstract

	public double perimeter();

}
