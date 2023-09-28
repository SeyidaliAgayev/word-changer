import exceptions.ServiceException;
import model.Sentence;
import service.ChangerServiceInter;
import service.impl.ChangerServiceImpl;

public class Main {
    public static void main(String[] args) {
        try {
            Sentence sentence = new Sentence("Bu gun 6 ci gundur. Bu munasibetle her kesi tebrik edirem.");
            System.out.println(sentence);
            ChangerServiceInter changerServiceInter = new ChangerServiceImpl();
            changerServiceInter.changeWord(sentence);
        } catch (ServiceException exception) {
            System.err.println(exception.getMessage());
        }
        
    }
}