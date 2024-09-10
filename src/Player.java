public class Player implements Information{

    String nameOfPlayer;
    String sportType;
    int numberPosition;
    String teamName;

    @Override
    public void getInfo() {
        System.out.println(nameOfPlayer);
    }

    @Override
    public void getTeamName() {
        System.out.println(teamName);
    }
}
