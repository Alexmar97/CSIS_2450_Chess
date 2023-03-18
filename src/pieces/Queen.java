package pieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import board.Board;
import board.Move;
import util.PieceColor;

/*
 * class to represent the queen to create a new queen piece
 */
public class Queen extends Piece{

	//constructor that assumes first move is true
	public Queen(int piecePos, PieceColor pieceColor) {
		super(piecePos, pieceColor, true);
	}


	final int[] MOVE_CANDIDATE_DIRECTION = {-9, -8, -7, -1, 1, 7, 8, 9};

	/*
	 * Method that calculates the moves possible by this piece
	 * needs the board being used to be passed in
	 * returns a collection of move objects
	 */
	@Override
	public Collection<Move> calculateMoves(Board board)
	{

		//NEEDS REPAIRS WITH THE FIRST COL AND EITH COL METHODS

		//List that will contain all possible moves
		List<Move> moves = new ArrayList<>();

		//loops through all possible move integers
		for(int currentMoveCandidate : MOVE_CANDIDATE_DIRECTION)
		{
			int coordinateToCheck = this.piecePos + currentMoveCandidate;

			//loop as long as the coordinate is valid and the number of allowed moves for the piece is not exceeded
			while(board.isValidCoord(coordinateToCheck))
			{
				//checks to see if piece is on the edge and breaks out if so
				if(firstColumnEdgeCheck(this.piecePos,currentMoveCandidate) || eigthColumnEdgeCheck(this.piecePos, currentMoveCandidate))
					break;

				//stops the vector of travel on the edge
				if(eigthColumnEdgeCheck(coordinateToCheck - currentMoveCandidate, currentMoveCandidate) ||
						firstColumnEdgeCheck(coordinateToCheck - currentMoveCandidate, currentMoveCandidate)) {
					break;
				}


				//if the coordinate that we're checking is empty, then we add this to the list of possible moves
				if (!board.getTile(coordinateToCheck).isTileOccupied())
				{
					moves.add(new Move(board, coordinateToCheck));
				}


				//if tile is occupied  and the other piece is the other teams add the attack move
				else if(board.getTile(coordinateToCheck).isTileOccupied())
				{
					Piece otherPiece = board.getTile(coordinateToCheck).getPiece();

					if(this.pieceColor != otherPiece.getPieceColor())
					{
						//moves.add(attackMove);
					}
					break;
				}

				System.out.println(coordinateToCheck);

				//adds to the next move to check
				//{+1 +1 +1 +1 ....}
				//{+8 +8 +8 +8...}
				coordinateToCheck += currentMoveCandidate;
			}


		}
		return moves;

	}

	/*
	 * going to be used to move the piece
	 */
	@Override
	public Piece movePiece(Move move) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Q";
	}

	public boolean firstColumnEdgeCheck(int piecePos, int candidateOffset)
	{
		return Board.FIRST_COLUMN[piecePos] && (candidateOffset == -9 || candidateOffset == -8 || candidateOffset == -7
												|| candidateOffset == -1 || candidateOffset == 1 || candidateOffset == 7
												|| candidateOffset == 8 || candidateOffset == 9);
	}



	/*
	 * checks to see if is in eighth column and move offsets that we can not move to
	 */
	public boolean eigthColumnEdgeCheck(int piecePos, int candidateOffset)
	{
		return Board.EIGTH_COLUMN[piecePos] && (candidateOffset == -9 || candidateOffset == -8 || candidateOffset == -7
												|| candidateOffset == -1 || candidateOffset == 1 || candidateOffset == 7
												|| candidateOffset == 8 || candidateOffset == 9);
	}
}
