package kodlamaio.nortwind.core.utilities.results;

public class Result {

	private boolean success;
	private String mesaage;

	public Result(boolean success) {
		this.success=success;
	}

	public Result(boolean success, String mesaage) {
		this(success);
		this.mesaage = mesaage;
	}

	public boolean isSuccess() {
		return success;
	}
	
	public String getMesaage() {
		return mesaage;
	}

	
}
