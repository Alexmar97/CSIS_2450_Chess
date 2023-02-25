public class Pieces implements  Moves
{
    public String name;
    public int numOfPieces;

    public int coordinates;

    public String team;

    public Pieces()
    {
        super();
    }

    Pieces(int coordinates, int numOfPieces, String team)
    {
        this.coordinates = coordinates;
        this.numOfPieces = numOfPieces;
        this.team = team;
    }

    Pieces(int coordinates, String team)
    {
        this.coordinates = coordinates;
        this.numOfPieces = numOfPieces;
        this.team = team;
    }

    @Override
    public String toString()
    {
        return numOfPieces + " " + name;
    }


    @Override
    public String moves() {
        return null;
    }
}
