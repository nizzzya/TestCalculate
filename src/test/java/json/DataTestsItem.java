package json;

import com.google.gson.annotations.SerializedName;

public class DataTestsItem{

	@SerializedName("secondNumber")
	private String secondNumber;

	@SerializedName("expectedResult")
	private String expectedResult;

	@SerializedName("firstNumber")
	private String firstNumber;

	@SerializedName("option")
	private String option;

	public String getSecondNumber(){
		return secondNumber;
	}

	public String getExpectedResult(){
		return expectedResult;
	}

	public String getFirstNumber(){
		return firstNumber;
	}

	public String getOption(){
		return option;
	}
}