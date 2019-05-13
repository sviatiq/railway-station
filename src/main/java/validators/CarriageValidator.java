package validators;

import answers.CarriageAnswer;
import domain.PeopleOrder;

public class CarriageValidator {

    public CarriageAnswer checkCarriage(PeopleOrder po){
        System.out.println("Carriage is checking!");
        return new CarriageAnswer();
    }
}
