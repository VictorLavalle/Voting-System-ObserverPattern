package Pattern;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author Victor Lavalle
 */
public class ExcelGenerator implements Observer{
    
    @Override
    public void update(int[] votes, String[] nominees) {

        try (PrintWriter esc = new PrintWriter("ObserverVotes.csv")) {
            String vote="";
            for(int i=0; i<votes.length;i++){
             vote+=votes[i]+",";
            }
            esc.println(Arrays.toString(nominees));
            esc.println(vote);
            esc.close();
           }        
        catch(Exception e){
        }
    }
}
