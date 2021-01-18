package ExampleStub;

import java.util.ArrayList;
import java.util.List;

public class LoadDelimitedFile {

    private String delimitor = ",";
    private LoadData loadDataFile = new LoadDataFile();

    public void setLoadData(LoadData loadData){
        this.loadDataFile = loadData;
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
        List<String> rawFileData = loadDataFile.getData(fileName);
        return getData(fileName,rawFileData);
    }

}
