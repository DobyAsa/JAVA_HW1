public class TypeConvert {
    public static void main(String[] args) {
        int i = 1,j;
		// 0.1 默认是double, 直接赋值给float类型的f1会不安全。
		//float f1 = 0.1;
		float f1 = (float) 0.1;
		float f2 = 123;
		long l1 = 12345678;
		// 8888888888 对于long类型来说太大了
        //long l2 = 8888888888;
		long l2 = 8888;
		double d1 = 2e20;
        double d2 = 124;
		// 数字字面量对应的是int
        byte b1 = (byte)1,b2 = (byte)2,b3 = (byte)129;
		j = 99;
		// j 没有被初始化
		j = j+10;
		i = i/10;
		// i*0.1返回的是double
		i = (int)(i*0.1);
		char c1 = 'a',c2 = 125;
		// b1-b2 返回的是int
		byte b = (byte)(b1-b2);
		// c1+c2-1 返回的是int
		char c = (char)(c1+c2-1);
		float f3 = f1+f2;
		// 返回的double
        float f4 = (float)(f1+f2*0.1);
		double d = d1*i+j;
        float f = (float)(d1*5+d2);

    }
}
