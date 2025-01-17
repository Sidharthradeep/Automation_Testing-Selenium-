package junitpkg;

import java.net.URI;
import java.net.URISyntaxException;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class response_code {
		String link="https://www.facebook.com";
		@Test
		public void test() throws Exception {
			URI ob=new URI(link);
			HttpsURLConnection con=(HttpsURLConnection)ob.toURL().openConnection();
			System.out.println(con.getResponseCode());
		}

}
