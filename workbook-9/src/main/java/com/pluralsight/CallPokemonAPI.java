package com.pluralsight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallPokemonAPI {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://bulbapedia.bulbagarden.net/wiki/Jolteon_%28Pok%C3%A9mon%29#/media/File:0135Jolteon.png");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedImage image = ImageIO.read(connection.getInputStream());
            ImageIO.write(image, "png", new File("jolteon" + ".png"));

        }

    }
}
