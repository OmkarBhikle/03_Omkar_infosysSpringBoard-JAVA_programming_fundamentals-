public class EventRegistration {
    public String name;
    public String nameOfEvent;
    public double registrationFee;

    EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
        setNameOfEvent(this.nameOfEvent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent(String nameOfEvent) {
        double baseFee=0;
        switch(nameOfEvent) {
            case "ShakeALeg" : baseFee = 100;
            break;
            case "Sing&Win" : baseFee = 150;
            break;
            case "Actathon" : baseFee = 70;
            break;
            case "PlayAway" : baseFee = 130;
            break;
        }
        registrationFee = baseFee;
    }

}
