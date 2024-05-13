package org.herrera.mates;

public class Principal {
	static String verde = "\033[0;32m";
	static String normal = "\033[0m";
	public static void main(String[] args) {
		long t0, n;

		n = 1000000000000000003L;
		n = 91;
		n = 11 * 11;
		n = 5 * 9;
		n = 7 * 1000000000000000003L;
		n = 2;
		{
			n = (long) (Math.random() * Long.MAX_VALUE);
			if (n % 2 == 0)	n++;
			if (n % 3 == 0)	n += 2;
			if (n % 5 == 0)
				if ((n + 2) % 3 == 0) n += 4;
				else n += 2;
		}
		
		System.out.printf("- menor divisor de %d:\n", n);
		
		// Test algoritmo monohilo
		t0 = System.currentTimeMillis();
		System.out.printf(" %d ", Primos.getDivisor(n));
		System.out.printf("%s [ %.3f segs] %s \n", verde, (System.currentTimeMillis() - t0) / 1000., normal);

		// Test algoritmo multihilo
		t0 = System.currentTimeMillis();
		System.out.printf(" %d ", Primos.getDivisorEx(n));
		System.out.printf("%s [ %.3f segs] %s \n", verde, (System.currentTimeMillis() - t0) / 1000., normal);
	}
}
