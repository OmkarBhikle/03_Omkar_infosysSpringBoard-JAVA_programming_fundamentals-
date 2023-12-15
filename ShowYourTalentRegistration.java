public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration participant1 = null;
        participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent("Sing&Win");

        EventRegistration participant2 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
        participant2.registerEvent("ShakeALeg");

        EventRegistration participant3 = null; 
        participant3 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant3.registerEvent("PlayAway");
    }
}
