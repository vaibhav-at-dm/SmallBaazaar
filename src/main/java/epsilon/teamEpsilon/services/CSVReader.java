package epsilon.teamEpsilon.services;

import epsilon.teamEpsilon.Model.Product;
import org.apache.commons.csv.CSVParser;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVReader {


        public static final String delimiter = ",";

        public ArrayList<Product> read(String csvFile) {
            ArrayList<Product> productsFromSupp = new ArrayList<Product>();
            try {
                File file = new File(csvFile);
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = "";
                String[] tempArr;
                int i = 0;
//                String pname, String bname, String category, int qty, int pPerq
                while ((line = br.readLine()) != null) {
                    tempArr = line.split(delimiter);

//                    productsFromSupp.add(new Product(tempArr[0],tempArr[1],tempArr[2],tempArr[3],tempArr[4]));
                    if (i != 0) {
                        Product p = new Product(tempArr[0], tempArr[1], tempArr[2], Integer.parseInt(tempArr[3]), Integer.parseInt(tempArr[4]));
                        productsFromSupp.add(p);
                        System.out.print(tempArr[0] + " " + tempArr[1] + " " + tempArr[2] + " " + tempArr[3] + " " + tempArr[4]);
                    }

                    System.out.println();
                    i = i + 1;
                }
                br.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return productsFromSupp;
        }


}
