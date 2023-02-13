import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCompression {
    public static void main(String[] args) {
        String inputFilePath = ".../input/image.jpg";
        String outputFilePath = ".../compressed/image.jpg";
        float quality = 0.5f; // compression quality

        try {
            // Read the input image
            BufferedImage inputImage = ImageIO.read(new File(inputFilePath));

            // Write the compressed image
            ImageIO.write(inputImage, "jpg", new File(outputFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
