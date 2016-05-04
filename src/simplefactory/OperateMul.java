package simplefactory;

public class OperateMul extends Operate {

	@Override
	public int getResult() {
		int result;
		result = numA * numB;
		return result;
	}
}
