package controller;

public class StringController {
    String content = "Example content: Lorem ipsum Lorem ipsum";

    public boolean isCharacter(char c){
      int search = content.indexOf(c);
      return search != -1 ? true : false;
    }

    public int countAllCharacters(char c){
        int charCounter = 0;
        for(int i = 0; i < content.length(); i++){
            if(content.charAt(i) == c){
                charCounter++;
            }
        }
        return charCounter;
    }


    }


