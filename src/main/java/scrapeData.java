import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class scrapeData {

  public static void main(String[] args) {

  }

  public void grabData() throws IOException {
    Document document = Jsoup.connect("https://animalcrossing.fandom.com/wiki/Villager_list_(New_Horizons)").get();
    
  }


}
