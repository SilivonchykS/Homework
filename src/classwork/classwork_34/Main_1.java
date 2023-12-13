package classwork.classwork_34;

import java.util.Random;
import java.util.Scanner;

public class Main_1 {
    public static String whoWon(String pick, String userPick) {
        switch (pick + userPick) {
            case "SteinSchere":

            case "ScherePapire":

            case "PapireStein":

                return "Computer gewinnt";
            case "SteinPapire":

            case "SchereStein":

            case "PapireSchere":

                return "Sie Gewonnen";
        }
        return "Remis";
    }

          /*  case "Stein":
                if (userPick.equals("Schere")) {
                    return "Computer Gewinnt";
                } else if (userPick.equals("Papire")) {
                    return "Sie Gewinner";
                }
                break;
            case "Schere":
                if (userPick.equals("Schere")) {
                    return "Computer Gewinnt";
                } else if (userPick.equals("Papire")) {
                    return "Sie Gewinner";
                }
                break;
            case "Papire":
                if (userPick.equals("Schere")) {
                    return "Computer Gewinnt";
                } else if (userPick.equals("Papire")) {
                    return "Sie Gewinner";
                }
                break;
        }
        return "Remis";
    }*/
          public static void main(String[] args) {

    String[]answers={"stein", "Schere","Papire"};
    String pick=answers[new Random().nextInt(answers.length)];
    Scanner scanner=new Scanner(System.in);
    String userPick=scanner.next();
        System.out.println(pick);
                }}
