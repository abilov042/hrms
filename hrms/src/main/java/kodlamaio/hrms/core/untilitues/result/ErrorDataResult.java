package kodlamaio.hrms.core.untilitues.result;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data) {
		super(false, data);
		
	}
	
	public ErrorDataResult(String massage, T data) {
		super(false, massage, data);
		
	}
	
	public ErrorDataResult() {
		super(false, null);
		
	}

}
