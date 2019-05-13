package validators;

import domain.PeopleOrder;
import answers.TrainAnswer;

public class TrainValidator {


    public TrainAnswer checkTrain(PeopleOrder po){
        System.out.println("Train is checking!");
        return new TrainAnswer();
    }
}
