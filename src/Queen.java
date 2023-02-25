public class Queen extends Pieces implements Moves
{
    int id;
    String position;
    int count;


    @Override
    public String moves()
    {
        return null;
    }


    public Queen(int coordinates, int numberOfQueens, String team)
    {
        super(coordinates,numberOfQueens, team);
        count++;
    }

    public Queen(int coordinates, String team)
    {
        super(coordinates,team);
        count++;
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
