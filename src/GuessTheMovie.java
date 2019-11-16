/**
 * Created by Danielle on November 11, 2019
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String[] args) throws Exception{

//        This is to read in a file and save items to arraylist
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> movies = new ArrayList<>();
        int count = 0;
        while(scanner.hasNextLine() == true){
            movies.add(scanner.nextLine());
//            String line = scanner.nextLine();
//            System.out.println(line);
            count++;
        }

//        This is picking a random number to a pick a random movie from the list
        int num = (int) (Math.random() * count) + 1;
        System.out.println(num);

        String movieTitle = movies.get(num);
        System.out.println(movieTitle);


    }


}
