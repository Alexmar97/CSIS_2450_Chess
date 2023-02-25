public class Pawn extends Pieces implements Moves
{
    int id;
    String position;
    int count;


    @Override
    public String moves()
    {
        return null;
    }


    public Pawn(int coordinates, int numberOfPawns, String team)
    {
        super(coordinates,numberOfPawns, team);
        count++;
        id++;
    }

    public Pawn(int coordinates, String team)
    {
        super(coordinates,team);
        count++;
        id++;
    }

    public int getCount()
    {
        return count;
    }


    //We need setter for count so that any time a piece is taken by the opponent
    //the count reflects the change
    public void setCount(int count)
    {
        this.count = count;
    }
}


