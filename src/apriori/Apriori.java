/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apriori;

import java.io.IOException;

/**
 *
 * @author dee-shamay
 */
public class Apriori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String File = "contextCFPGrowth.txt";
        //String File = "testtext.txt";
        String fileOutput = "hasil.txt";
        //String fileDirectory = "./KoleksiDokumenSample";
        
        AlgoApriori apriori = new AlgoApriori();
        apriori.runAlgorithm(0.01, File, fileOutput);
        apriori.printStats();
        
//        AlgoAprioriClose apriori = new AlgoAprioriClose();
//        apriori.runAlgorithm(0, File, fileOutput);
//        apriori.printStats();
    }
    
}
