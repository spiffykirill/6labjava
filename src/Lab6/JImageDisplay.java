package Lab6;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class JImageDisplay extends JComponent{
    private BufferedImage img;

    JImageDisplay(int w, int h){
        img = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);

        Dimension imageDimension = new Dimension(w, h);
        super.setPreferredSize(imageDimension);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, img.getWidth(),img.getHeight(), null);
    }

    public void clearImage()
    {
        int[] blankArray = new int[getWidth() * getHeight()];
        img.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    }

    public void drawPixel(int x, int y, int rgbColor)
    {
        img.setRGB(x, y, rgbColor);
    }

    public BufferedImage getImage() {
        return img;
    }
}