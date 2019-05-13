package validators;

import domain.PeopleOrder;
import answers.PlaceAnswer;

public class PlaceValidator {

    public PlaceAnswer checkPlace(PeopleOrder po){
        System.out.println("Place is checking!");
        return new PlaceAnswer();
    }
}
