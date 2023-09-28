package service.impl;

import enums.ExceptionEnums;
import exceptions.ServiceException;
import model.Sentence;
import service.ChangerServiceInter;
import static utils.InputUtil.*;

public class ChangerServiceImpl implements ChangerServiceInter {

    @Override
    public String changeWord(Sentence sentence) {
        String oldWord = inputRequiredString("Which word do you want to change: ");
        String newWord = inputRequiredString("Please enter new word: ");
        String[] sentenceArray = sentence.getWord().split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].equals(oldWord)) {
                sentenceArray[i] = newWord;
            } else {
                throw new ServiceException(ExceptionEnums.WORD_NOT_FOUND);
            }
        }
        String modifiedSentence = "";
        for (int i = 0; i < sentenceArray.length; i++) {
            modifiedSentence += sentenceArray[i];
            if (i < sentenceArray.length - 1) {
                modifiedSentence += " ";
            }
        }
        sentence.setWord(modifiedSentence);
        System.out.println("Sentence after changing: " + modifiedSentence);
        return sentence.toString();
    }
}
