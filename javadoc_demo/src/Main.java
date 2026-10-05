package src;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * The main class.
 *
 * @author pcr
 */
public class Main {
    private Main() {}

    /**
     * The main method.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        System.setProperty("url", "https://some.where");
        try (Image image = Image.getImage(new URI(System.getProperty("url")).toURL(), "something")) {
            System.out.println(image.getSrc());
        } catch (MalformedURLException | URISyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
