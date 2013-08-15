package demoDay2;

public class Example4 {

	/**
	*利用程序输出如下图形:
	 *
	 *	*  
	 *	** 
	 *	**** 
	 *	****** 
	 *	**** 
	 *	**
	 *	* 
	 */
	public static void main(String[] args) {

		int sum = 5;  //一半的大小

		for (int i = 1; i <= sum; i++) {  //行数循环
			for (int j = 1; j <= i * 2 - 1; j++) {  //星号个数循环
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = sum - 1; i > 0; i--) {//行数循环
			for (int j = 1; j <= i * 2 - 1; j++) {//星号个数循环
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
