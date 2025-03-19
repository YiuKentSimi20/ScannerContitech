package org.example.DataMatrixDecoding;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.decoder.*;
import com.google.zxing.datamatrix.detector.Detector;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        String imagePath = "D:\\Faculta\\ScannerContitech\\src\\main\\resources\\exampleImages\\datamatrix.png";

        BufferedImage imagineDataMatrix = ImageIO.read(new File(imagePath));

        BitMatrix dmImageBitmatrix = new BitMatrix(imagineDataMatrix.getWidth(), imagineDataMatrix.getHeight());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ImageIO.write(imagineDataMatrix, "jpg", baos);

        Detector detector;

        
    }
}
