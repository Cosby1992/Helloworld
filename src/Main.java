import java.awt.*;

/**
@author Cosby
 @version 1.0
 */

public class Main
{
    public static void main (String[] args)
    {
        System.out.println("Hello World");
        System.out.println("Cosby");

        Car myCar = new Car(25.5,
                            "BC58681",
                                            Color.BLUE,
                            true);

        Car cosbysCar = new Car(20,
                                "BZ80600",
                                                Color.GRAY,
                          false);

        System.out.println("Første bil har nummerplade: " + myCar.licencePlate);
        System.out.println("Min egen bil har nummerplade: " + cosbysCar.licencePlate);

        System.out.println(cosbysCar.paintColor);

        cosbysCar.chancePaintColor(Color.RED);

        System.out.println(cosbysCar.paintColor);
    }


}
