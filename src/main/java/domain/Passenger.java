package domain;

public class Passenger extends Person {


    //TODO make a class for docs
    private Documents document;


    public Passenger() {
    }

    public Passenger(String name, String surname) {
        super(name, surname);
    }

    public Documents getDocument() {
        return document;
    }

    public void setDocument(Documents document) {
        this.document = document;
    }
}
