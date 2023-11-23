import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class WordProcessor {
    HashSet<String> uniqueWords = new HashSet<String>();
    private String filePath;

    public WordProcessor (String filePath){
        this.filePath = filePath;
    }

    public void readFile() throws FileNotFoundException {
        File file = new File(this.filePath);
        Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String word = reader.next();
                this.uniqueWords.add(word);
            }
    }

    public HashSet<String> getDistinctWords(){
        return this.uniqueWords;
    }
}
