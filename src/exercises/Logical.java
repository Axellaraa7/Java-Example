package exercises;

public class Logical {
	public static void triangle(int numMax) /* throws ExceptionLong */{
		//if(numMax>9) throw new ExceptionLong();
		for(int i = 1; i < numMax*2; i++) {
			int it = (i>numMax) ? numMax-(i-numMax) : i;
			for(int j = 1; j <= it; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
