 package kodlamaio.hrms.core.untilitues.result;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(String massage, T data) {
		super(true, massage, data);
		
	}
	
	public SuccessDataResult(T data) {
		super(true, data);
		
	}
	
	public SuccessDataResult() {
		super(true, null);
		
	}
	
	

}
