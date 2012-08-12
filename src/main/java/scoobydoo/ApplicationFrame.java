package scoobydoo;

import javax.swing.*;

public class ApplicationFrame extends JFrame {

    public static final String STATUS = "status_label_name";
    public static final String APPLICATION_TITLE = "Scooby Doo";

    public ApplicationFrame() {

        setTitle(APPLICATION_TITLE);
        add(StatusLabel.running());
    }

    public static void Run() {
        ApplicationFrame game = new ApplicationFrame();
        game.pack();
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game.setVisible(true);
    }

    public enum Status {
        RUNNING("Running");
        private String status;


        Status(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }
}

class StatusLabel extends JLabel {
    public static final String NAME = "status_label_name";

    protected StatusLabel(ApplicationFrame.Status status){
        super(status.toString());
        setName(NAME);
    }

    public static StatusLabel running(){
        return new StatusLabel(ApplicationFrame.Status.RUNNING);
    }
}

