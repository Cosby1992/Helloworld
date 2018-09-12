import java.awt.*;

public class Car
{
    // Data types:
    // int -> interger 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "alb2" or "Hello World"
    // Color -> From awt libary
    // boolean -> true or false
    //
    //

    double averageMilesPerGallon;
    String licencePlate;
    Color paintColor;
    boolean areTailightsWorking;

    public Car(double inputAverageMPG, String inputLicensePlate,
               Color inputPaintColor, boolean inputAreTaillightsWorking) {

        this.averageMilesPerGallon = inputAverageMPG;
        this.licencePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailightsWorking = inputAreTaillightsWorking;

    }

    public void chancePaintColor(Color newPaintColor)
    {
        this.paintColor = newPaintColor;
    }

}
