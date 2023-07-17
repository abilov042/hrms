package kodlamaio.hrms.core.untilitues.result;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(boolean succsess, T data) {
		super(succsess);
		this.data = data;
	}
	
	public DataResult(boolean success, String massage, T data) {
		super(success, massage);
		this.data = data;
	}

	public T getData() {
		
		return data;
	}
}
