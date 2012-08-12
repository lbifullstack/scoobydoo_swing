package scoobydoo;

import java.awt.*;

public class ApplicationLauncher {


    public static void main(String ... args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ApplicationFrame.Run();
            }
        });
    }
}
