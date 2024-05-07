package chess.calculations;

import chess.ChessBoard;
import chess.ChessGame;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.Collection;

public interface PieceMovesCalulator {
    Collection<ChessMove> calculateMoves(ChessBoard board, ChessPosition position, ChessGame.TeamColor peiceColor);
}
