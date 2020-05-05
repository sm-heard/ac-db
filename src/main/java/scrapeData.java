import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class scrapeData {

  public static void main(String[] args) {

  }

  public void grabData() throws IOException {
    Document document = Jsoup.connect("https://animalcrossing.fandom.com/wiki/Villager_list_(New_Horizons)").get();
    Document document1 = Jsoup.connect("https://nookipedia.com/wiki/List_of_villagers").get();


    Elements elements = document.getElementsByTag("href");



    //grab names and species
    //personality,  bday, and catchphrase
  }


}
