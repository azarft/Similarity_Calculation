import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        try{
            WordProcessor file1 =  new WordProcessor("file1.txt");
            WordProcessor file2 =  new WordProcessor("file2.txt");
            try {
                file1.readFile(); file2.readFile();
            }
            catch (FileNotFoundException ex){
                System.out.println(ex.getMessage());
            }
            Set <String> file1Set = file1.getDistinctWords();
            Set <String> file2Set = file2.getDistinctWords();

            System.out.println(SimilarityCalculator.calculateSimilarity(file1Set,file2Set));
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}