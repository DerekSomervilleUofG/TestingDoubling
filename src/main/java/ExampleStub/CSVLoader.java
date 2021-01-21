package ExampleStub;

import java.util.ArrayList;
import java.util.List;

public class CSVLoader {

    private String delimitor = ",";
    private Loader loader;

    CSVLoader(){
        System.out.println("First constructor");
        this.loader = new FileLoader();
    }

    CSVLoader(Loader loader){
        System.out.println("Second constructor");
        this.loader = loader;
    }

    public void setLoader(Loader loader){
        this.loader = loader;
    }

    public void setDelimitor(String delimitor){
        this.delimitor = delimitor;
    }

    protected List<String[]> getData(String fileName,List<String> rawFileData){
        List<String[]> fileData = new ArrayList<String[]>();
        for (String row: rawFileData){
            fileData.add(row.split(delimitor));
        }
        return fileData;
    }

    public List<String[]> getData(String fileName){
        List<String> rawFileData = loader.getData(fileName);
        return getData(fileName,rawFileData);
    }

}
