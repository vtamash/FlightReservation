package edu.gsu.flightReservation;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import edu.gsu.flightReservation.ui.view.LandingView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport{
    public static void main(String[] args) {
        launch(Main.class, LandingView.class, args);
    }
}
