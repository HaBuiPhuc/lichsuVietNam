package crawl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class VuaVietNamWiki {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("https://vi.wikipedia.org/wiki/Vua_Vi%E1%BB%87t_Nam").get();
		FileWriter fw = new FileWriter("data//vuavietnam.html", false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(doc.html());
		bw.close();
		fw.close();
		
		
		

	}

}
