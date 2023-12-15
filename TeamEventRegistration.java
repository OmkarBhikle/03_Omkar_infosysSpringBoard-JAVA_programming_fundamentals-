public class TeamEventRegistration extends EventRegistration {
    public int noOfParticipants;
    public int teamNo;
    
    TeamEventRegistration(String name, String nameOfEvent,  int noOfParticipants, int teamNo) {
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent(String nameOFEvent) {
        double baseFee=0;
        switch(nameOfEvent) {
            case "ShakeALeg" : baseFee = 50;
            break;
            case "Sing&Win" : baseFee = 60;
            break;
            case "Actathon" : baseFee = 80;
            break;
            case "Playaway" : baseFee = 100;
            break;
        }
        registrationFee = baseFee;
        registrationFee = baseFee * noOfParticipants;
        System.out.println("Thank You " + name + " for your registration. Your registration fee is: " + registrationFee);
    }
}
