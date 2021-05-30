package homework7;

import java.util.ArrayList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    private String path;
    private String name;
    private List<FileDetails> listedDirectory;


    public DirectoryDetails(String path, String name){
        super(path,name);
        this.listedDirectory = new ArrayList<>();
    }

    public void addFile(FileDetails fileDetails){
        listedDirectory.add(fileDetails);
    }

    @Override
    public void accept(FileVisitor visitor) { }
}
