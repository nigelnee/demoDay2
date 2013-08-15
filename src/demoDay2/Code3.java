package demoDay2;

/**
 * 从命令行接受一个参数年份，计算此年份是否为闰年?
 * @author Administrator
 *
 */
public class Code3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length < 1)
		{
			System.out.println("请输入年份");
			System.exit(0);
		}
		
		String year = args[0];
		int y = Integer.parseInt(year); //这里需要进行异常处理
		System.out.println("用户输入的年份是:"+y);
		
		if((y%4==0 && y%100 != 0) || y%400 == 0)
		{
			System.out.println("这一年是闰年");
		}else
		{
			System.out.println("这一年不是闰年");
		}
		
		

	}

}
