package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class DataProvider {
    private static Gson gson = new Gson();

    public static Object[][] getTestsDataFromJson(String pathJsonFile) throws IOException {
//        Reader reader = new FileReader("src/main/java/json/dataForTests.json");

        Type collectionType = new TypeToken<List<DataTestsItem>>() {
        }.getType();
        List<DataTestsItem> dataTests = gson.fromJson(pathJsonFile, collectionType);

        Object[][] objectTestData = new Object[dataTests.size()][4];


        for (int i = 0; i < dataTests.size(); i++) {
            objectTestData[i][0] = dataTests.get(i).getOption();
            objectTestData[i][1] = dataTests.get(i).getFirstNumber();
            objectTestData[i][2] = dataTests.get(i).getSecondNumber();
            objectTestData[i][3] = dataTests.get(i).getExpectedResult();

        }

        return objectTestData;

    }

}
