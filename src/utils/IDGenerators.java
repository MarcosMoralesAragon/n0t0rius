package utils;

public class IDGenerators {

    public String idCourseCreator(){
        String result ="";
        int count = 0;
        do {
            int number = (int) (Math.random()*2);
            if( number == 0){
                result += randomNumber();
            }else{
                result += randomString();
            }
            count++;
        }while (count < 6);
        return result;
    }

    private int randomNumber(){
        return (int) (Math.random()*9);
    }

    private String randomString(){
        int asciiCode = (int) Math.floor(Math.random()*(122 - 97)+97);
        return String.valueOf((char) asciiCode);
    }

}
