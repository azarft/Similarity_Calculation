import java.util.HashSet;
import java.util.Set;

public class SimilarityCalculator  {
    public static double calculateSimilarity(Set<String> set1, Set<String> set2){
        // Calculate the intersection of set1 and set2

        if (set1 == null || set2 == null) {
            throw new NullPointerException("Input sets cannot be null");
        }
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Calculate the union of set1 and set2
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        // Calculate the Jaccard similarity coefficient
        double jaccardSimilarity = (double) intersection.size() / union.size();

        return jaccardSimilarity;
    }
}
