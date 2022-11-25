package json;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataTests{

	@SerializedName("DataTests")
	private List<DataTestsItem> dataTests;

	public List<DataTestsItem> getDataTests(){
		return dataTests;
	}
}