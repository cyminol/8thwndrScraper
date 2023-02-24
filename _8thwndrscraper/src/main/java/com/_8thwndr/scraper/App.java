package com._8thwndr.scraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://8thwndr.com/collections/all-products").get();

            // With the document fetched, we use JSoup's title() method to fetch the title
            System.out.printf("Title: %s\n", doc.title());

            Elements products = doc.getElementsByClass("\n" +
                    "  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  one-fifth\n" +
                    "\n" +
                    "\n" +
                    "  medium-down--one-half\n" +
                    "  \n" +
                    "    small-down--one-half\n" +
                    "  \n" +
                    "  column\n" +
                    "  \n" +
                    "  \n" +
                    "    has-thumbnail-sticker\n" +
                    "  \n" +
                    "  \n" +
                    "    has-secondary-image-swap\n" +
                    "  \n" +
                    "  thumbnail\n" +
                    "  product__thumbnail\n" +
                    "  product__grid-item\n" +
                    "  thumbnail__hover-overlay--false\n" +
                    "  has-padding-bottom");

            for (Element product : products) {

                String productName = product.getElementsByClass("product-thumbnail__title").text();


                String productPrice = product.getElementsByClass("money").text();
                System.out.println(productName + " - " + productPrice);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
