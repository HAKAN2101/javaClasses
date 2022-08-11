package day29_Methods;

public class VoidMethodsPractice3 {

    public static void main(String[] args) {
        eligibleToVote("John","USA",45,true );

        eligibleToVote("Daniel","Japan",35,true);

        eligibleToVote("Aaron","USA",135,false);

    }

    public static void eligibleToVote(String name,String citizenShip, int age, boolean isAlive){
        if (citizenShip.equalsIgnoreCase("USA")){

            if (isAlive){
                if (age>=18){
                    System.out.println(name+", You are  eligible to vote");
                }else{
                    System.err.println(name+", You must be at least 18 years old");
                }

            }else {
                System.out.println(name+", You must be come back to life in order to vote");
            }

        }else {
            System.err.println(name+", You must be citizen of USA");
        }

    }

}
