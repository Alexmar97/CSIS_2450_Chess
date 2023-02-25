public class Knight extends Pieces implements Moves
{
    int id;
    String position;
    int count;


    @Override
    public String moves()
    {
        return null;
    }


    public Knight(int coordinates, int numberOfKnights, String team)
    {
        super(coordinates,numberOfKnights,team);
        count++;
    }

    public Knight(int coordinates, String team)
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


//all legal possible moves for knights: when 35 is the position of our knight
//35 + 6
//35 -6
//35 + 10
//35 - 10
//35 + 15
//35 - 15
//35 + 17
//35 - 17

