import me.postaddict.instagram.scraper.Instagram;
import me.postaddict.instagram.scraper.model.Account;
import me.postaddict.instagram.scraper.model.Media;
import me.postaddict.instagram.scraper.model.PageObject;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class InstagramFeed {



    public static void main(String[] args)  {

        try {
            OkHttpClient httpClient = new OkHttpClient();
            Instagram instagram = new Instagram(new OkHttpClient());
            Account account = instagram.getAccountByUsername("username");
            System.out.println(account.getMedia().getCount());
            PageObject<Media> medias = instagram.getMedias("username", 1);
            System.out.println(medias.getNodes().get(0).getDisplayUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}