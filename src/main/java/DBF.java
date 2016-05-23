import org.jamel.dbf.DbfReader;

import java.io.File;

/**
 * Created by A.Litvinau on 5/17/2016.
 */
public class DBF {

    public static void main(String[] args) {
        File dbf = new File("c:/Users/A.Litvinau/IdeaProjects/tream-reading/src/main/resources/origin.dbf");

        DbfReader reader = new DbfReader(dbf);
        double totalSum = 0;

        Object[] row;
        while ((row = reader.nextRecord()) != null) {
            // assuming that there are prices in the 4th column
            totalSum += ((Number) row[3]).doubleValue();
        }

        System.out.println("Total sum: " + totalSum);
        System.out.println("Average price: " + totalSum / reader.getHeader().getNumberOfRecords());

    }
}
