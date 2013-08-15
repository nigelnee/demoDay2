package demoDay2;

/**
 * 利用for循环打印 9*9 表
 * 
 * @author Administrator
 * 
 */
public class Code1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义该类对象，调用不同的方法
		Code1 c1 = new Code1();
		c1.method1();
		c1.method2();
		
		c1.method3();
		c1.method4();
		c1.method5();

	}

	/**
	 * 利用 For 循环
	 */
	public void method1() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				if (i == j)

					System.out.println();
			}
		}
	}

	/**
	 * 利用 while 循环
	 */
	public void method2() {
		int i = 1;
		while (i <= 9) {
			for (int n = 1; n <= i; n++) {
				System.out.print(n + "*" + i + "=" + n * i + " ");
			}
			System.out.println();
			i++;
		}
	}

	/**
	 * 在 for 循环中利用 continue
	 */
	public void method3() {
		outer: for (int i = 1; i < 10; i++) {
			inner: for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				if (i == j) {
					System.out.println();
					continue outer;
				}
			}
		}
	}

	/**
	 * 使用数组进行计算
	 */
	public void method4() {
		int[] a = new int[10]; // 数组里的数字最好大于9
		int[] b = new int[10];
		int m = 0;
		System.out.println("-----------------");
		for (int i = 1; i < 10; i++) { // FOR后面的（）里一定要加INT
			a[i] = i;
			for (int j = 1; j <= i; j++) {
				b[j] = j;
				m = b[j] * a[i];
				System.out.print(i + "*" + j + "=" + m + "\t"); // 是print不是println
				if (i == j)
					System.out.println();
			}
		}
	}

	/**
	 * 图形化输出
	 */
	public void method5() {
		int i, j;
		System.out.print("    *   |");
		for (i = 1; i <= 9; i++)
			System.out.print("    " + i);

		System.out.print("\n--------|");
		for (i = 1; i < 10; i++)
			System.out.print("-----");
		System.out.println();

		for (i = 1; i < 10; i++) {
			System.out.print("   " + i + "    |");
			for (j = 1; j <= i; j++)
				System.out.print("      " + i * j);
			System.out.println();
		}
	}

}
