package 行为型模式.命令模式;


public class CommandImpl extends Command {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
