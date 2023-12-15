public class SingleEventRegistration extends EventRegistration{
    public int participantNo;

    SingleEventRegistration(String name,String nameOfEvent, int participantNo) {
        super(name,nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent(String nameOfEvent) {
        if(nameOfEvent != "Actathon") {
            super.registerEvent(nameOfEvent);
        }
        System.out.println("Thank You " + name + " for your registration. Your registration fee is: " + registrationFee);
    }
}
