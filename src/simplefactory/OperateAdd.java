package simplefactory;

public class OperateAdd extends Operate {

	@Override
	public int getResult() {
		int result;
		result = numA + numB;
		return result;
	}

}
