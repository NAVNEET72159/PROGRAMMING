import java.applet.*;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {
    public void init() {
        System.out.println("Applet initialized successfully.");
    }
    public void start() {
        System.out.println("Applet started successfully.");
    }
    public void paint(Graphics g) {
        g.drawString("Hello! My name is Ambika Gaur.", 20,  30);
    }
    public void stop() {
        System.out.println("Applet has stopped.");
    }
    public void destroy() {
        System.out.println("Applet has been destroyed.");
    }
    public static void main(String[] args) {
        AppletLifeCycle alc = new AppletLifeCycle();
        alc.init();
        alc.start();
        alc.stop();
        alc.destroy();
    }
}