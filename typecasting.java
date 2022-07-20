package typecasting_example;

public class typecasting {
		public static void main(String[] args) {
			
			int a=100;
			long b=a;
			float c=b;
			double d=500.50;
			long e=(long)d;
			int f=(int)e;
			
			System.out.println("Example for Implicit Typecasting int a = " +a);
			System.out.println("Example for Implicit Typecasting long b = "+b);
			System.out.println("Example for Implicit Typecasting float c = "+c);
			System.out.println("Example for Explicit Typecasting double d = "+d);
			System.out.println("Example for Explicit Typecasting long e = "+e);
			System.out.println("Example for Explicit Typecasting int f = "+f);
			
		}

	}

