import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author di_lella_andrea
 */

public class NBValidateXML {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List lista = null;
        Parser dom = new Parser();
        try {
            lista = dom.parseDocument("Consigli_di_classe_Circolari_2770A_2018-2019.xml");
            for(int i = 0; i < lista.size(); i++)
            {
                System.out.println(lista.get(i).toString());
            }
           
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        //System.out.println("Numero di libri: " + libri.size());
        //Iterator iterator = libri.iterator();
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next().toString());
        //}
        

    }
   
}
