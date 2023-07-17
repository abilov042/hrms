package kodlamaio.hrms.core.untilitues.result;

public class Result {
	
	private boolean success;
	private String massage;
	
	public Result(boolean succsess) {
		this.success = succsess;
	}
	
	public Result(boolean success, String massege) {
		this.massage = massege;
		this.success = success;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getMassage() {
		
		return massage;
	}

}
