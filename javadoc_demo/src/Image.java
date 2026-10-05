package src;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The Image class.
 *
 * @author definitely not pcr...
 */
public class Image implements AutoCloseable {
    private byte[] bytes;
    private String src;

    /**
     * Construct an image object.
     *
     * @param src filename
     */
    public Image(String src) {
        this.bytes = new byte[100];
        this.src = src;
    }

    /**
     * Returns an Image object that can then be painted on the screen.
     * The url argument must specify an absolute {@link java.net.URL}. The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * This method always returns immediately, whether or not the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     *
     * @param  url   an absolute URL giving the base location of the image
     * @param  name  the location of the image, relative to the url argument
     * @return the image at the specified URL
     * @throws MalformedURLException  if the input url is formatted incorrectly
     * @see    Image
     */
    public static Image getImage(URL url, String name) throws MalformedURLException {
        validateURL(url);
        return new Image(url.toExternalForm()+name);
    }

    /**
     * Validates a URL.
     *
     * @param url the URL to validate
     * @throws MalformedURLException if URL is invalid
     */
    private static void validateURL(URL url) throws MalformedURLException {
        if (!url.getPath().matches("valid URL pattern")) {
            throw new MalformedURLException("validateURL: malformed URL");
        }
    }

    /**
     * The underlyling bytes.
     *
     * @return the image as a byte array
     */
    public byte[] getBytes() {
        return this.bytes;
    }

    /**
     * The fullpath URL of the image.
     *
     * @return a string containing the fullpath URL of the image
     */
    public String getSrc() {
        return this.src;
    }

    public void close() {
        // do nothing
    }
}
