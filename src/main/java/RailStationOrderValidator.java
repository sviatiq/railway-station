import answers.CarriageAnswer;
import answers.PlaceAnswer;
import answers.TrainAnswer;
import domain.*;
import mail.Mail;
import validators.CarriageValidator;
import validators.PlaceValidator;
import validators.TrainValidator;

import java.util.List;

public class RailStationOrderValidator {

    private TrainValidator trainValidator;
    private CarriageValidator carriageValidator;
    private PlaceValidator placeValidator;
    private Mail mail;

    public RailStationOrderValidator(){
        trainValidator = new TrainValidator();
        carriageValidator = new CarriageValidator();
        placeValidator = new PlaceValidator();
        mail = new Mail();
    }

    public static void main(String[] args) {
        RailStationOrderValidator rsov = new RailStationOrderValidator();
        rsov.checkAll();
    }

    private void checkAll() {
        try {
            List<PeopleOrder> peopleOrderList = readPeopleOrder();

            for (PeopleOrder po : peopleOrderList) {
                checkOneOrder(po);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private List<PeopleOrder> readPeopleOrder() {
        return null;//new PeopleData().getPeopleOrder();
    }


    private void checkOneOrder(PeopleOrder po) {
        TrainAnswer trainAnswer = checkTrain(po);
        CarriageAnswer carriageAnswer = checkCarriage(po);
        PlaceAnswer placeAnswer = checkPlace(po);
        sendMail(po);
    }
    public PlaceAnswer checkPlace(PeopleOrder po) {
        return placeValidator.checkPlace(po);
    }
    public CarriageAnswer checkCarriage(PeopleOrder po) {
        return carriageValidator.checkCarriage(po);
    }
    public TrainAnswer checkTrain(PeopleOrder po) {
        return trainValidator.checkTrain(po);
    }
    public void sendMail(PeopleOrder po){ mail.sendMail(po);}




}
