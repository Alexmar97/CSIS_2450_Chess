public class King extends Pieces implements Moves
{
    int id;
    String position;
    int count;


    @Override
    public String moves()
    {
        return null;
    }


    public King(int coordinates, int numberOfKings, String team)
    {
        super(coordinates,numberOfKings,team);
        count++;
    }

    public King(int coordinates, String team)
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
