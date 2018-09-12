package 行为型模式.观察者模式;

public class LongHuaCitizen extends Citizen {

    public LongHuaCitizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++){
            Policeman pol = pols.get(i);
            pol.action(this);
        }
    }
}
