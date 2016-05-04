package simplefactory;

public class OperateFactory {

	public static Operate createOperate(String op) {
		Operate opt = null;
		switch (op) {
		case "+":
			opt = new OperateAdd();
			break;
		case "-":
			opt = new OperateSub();
			break;
		case "*":
			opt = new OperateMul();
			break;
		case "/":
			opt = new OperateDiv();
			break;
		}

		return opt;

	}
	
}
