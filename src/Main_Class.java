import java.util.Scanner;

public class Main_Class
{
    //public static Pawn[] userPawns;

    public static void main(String[] args)
    {
        Pieces test = new Pieces (11, 8, "Black");

        //System.out.println("Your pieces are: " + test.toString());

        Scanner input = new Scanner(System.in);

        System.out.println("How many pawns do you want? ");

        int num = input.nextInt();

        Pawn[] whiteUserPawns = new Pawn[num];

        for(int i = 0; i<num; i++)
        {
            whiteUserPawns[i] = new Pawn(i,num, "black");
        }

        System.out.println(whiteUserPawns.length);


    }


    public static void generateBoard()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pawns do you want? ");

        int num = input.nextInt();

        for(int i = 0; i<num; i++)
        {
            Pawn userPawns = new Pawn(11,num, "white");
        }


    }

}
