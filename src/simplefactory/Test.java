package simplefactory;

public class Test {

	public static void main(String[] args) {
		Operate opt;
		opt = OperateFactory.createOperate("+");
		opt.numA = 5;
		opt.numB = 6;
		System.out.println(opt.getResult());
	}
}
