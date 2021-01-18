package ExampleStub;

import java.util.ArrayList;
import java.util.List;

public class LoadDataStub implements LoadData {
    @Override
    public List<String> getData(String fileName) {
        List<String> stubData= new ArrayList<String>();
        stubData.add("Author,Title,Release");
        stubData.add("Derek Somerville,MyBook,2019");
        stubData.add("Derek Somerville,MyBookSecond,2020");
        return stubData;
    }
}
