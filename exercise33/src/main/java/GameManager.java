import java.util.Random;
public class GameManager {

    //This class will have a constant "response" list
    //Also a function to choose a response.
    // I forgot to commit just a shell of this program. I swear I did it first


    final String[] list = {"Yes. ", "No. ", "Maybe. ", "Ask again later."};

    String pickRand() {
        Random rand = new Random();
        return list[rand.nextInt(4)];
    }


}
