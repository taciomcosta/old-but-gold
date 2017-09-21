package tests;

import chessboard.Utils;
import org.junit.Test;
import pieces.Rook;
import pieces.piece.Piece;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;

public class RookTest extends tests.Test
{
        private Rook rook;

        @Test
        public void testCanCaptureAndCanMove()
        {
                setUp1();
                board.printModel();
                assertTrue(captureTestShouldReturnTrue1());
                setUp2();
                board.printModel();
                assertTrue(captureTestShouldReturnTrue2());
                setUp3();
                board.printModel();
                assertTrue(moveTestShouldReturnTrue3());
        }

        public void setUp1()
        {
                resetElements();
                removePieces1();
                setPositions1();
        }

        public void removePieces1()
        {
                ArrayList<Piece.Icon> whitePiecesIcon = whiteTestSet1();
                ArrayList<Piece.Icon> blackPiecesIcon = blackTestSet1();
                removePiecesDifferent(whitePlayer, whitePiecesIcon);
                removePiecesDifferent(blackPlayer, blackPiecesIcon);
                removePiece(whitePlayer.pieces[9]);
        }

        public void setPositions1()
        {
                movePiece(rook, 4,3);
                movePiece(blackPlayer.pieces[10], 1, 3);
                movePiece(blackPlayer.pieces[11], 4, 1);
        }

        public ArrayList<Piece.Icon> whiteTestSet1()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.R);
                return icons;
        }

        public ArrayList<Piece.Icon> blackTestSet1()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.B);
                return icons;
        }

        public boolean captureTestShouldReturnTrue1()
        {
                boolean[][] testMap = {
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, true,  true,  false, true,  true,  true,  true},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                };
                boolean[][] currentMap = getCaptureMap(rook);
                for (int i = 0; i < Utils.BOARD_LENGTH; ++i)
                        for (int j = 0; j < Utils.BOARD_LENGTH; ++j)
                                if (testMap[i][j] != currentMap[i][j])
                                        return false;
                return true;
        }

        public void setUp2()
        {
                resetElements();
                removePieces2();
                setPositions2();
        }

        public void removePieces2()
        {
                ArrayList<Piece.Icon> whitePiecesIcon = whiteTestSet2();
                ArrayList<Piece.Icon> blackPiecesIcon = blackTestSet2();
                removePiecesDifferent(whitePlayer, whitePiecesIcon);
                removePiecesDifferent(blackPlayer, blackPiecesIcon);
                removePiece(whitePlayer.pieces[9]);
        }

        public void setPositions2()
        {
                movePiece(whitePlayer.pieces[8], 4, 3);
                movePiece(whitePlayer.pieces[15], 6, 3);
                movePiece(blackPlayer.pieces[10], 3, 3);
                movePiece(blackPlayer.pieces[11], 4, 2);
        }

        public ArrayList<Piece.Icon> whiteTestSet2()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.R);
                icons.add(Piece.Icon.K);
                return icons;
        }

        public ArrayList<Piece.Icon> blackTestSet2()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.B);
                return icons;
        }

        public boolean captureTestShouldReturnTrue2()
        {
                boolean[][] testMap = {
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, true,  false, true,  true,  true,  true},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                };
                boolean[][] currentMap = getCaptureMap(rook);
                for (int i = 0; i < Utils.BOARD_LENGTH; ++i)
                        for (int j = 0; j < Utils.BOARD_LENGTH; ++j)
                                if (testMap[i][j] != currentMap[i][j])
                                        return false;
                return true;
        }

        public void setUp3()
        {
                resetElements();
                removePieces3();
                setPositions3();
        }

        public void removePieces3()
        {
                ArrayList<Piece.Icon> whitePiecesIcon = whiteTestSet3();
                ArrayList<Piece.Icon> blackPiecesIcon = blackTestSet3();
                removePiecesDifferent(whitePlayer, whitePiecesIcon);
                removePiecesDifferent(blackPlayer, blackPiecesIcon);
                removePiece(whitePlayer.pieces[9]);
        }

        public void setPositions3()
        {
                movePiece(rook, 4, 3);
                movePiece(whitePlayer.pieces[15], 6, 3);
                movePiece(blackPlayer.pieces[15], 1, 3);
        }

        public ArrayList<Piece.Icon> whiteTestSet3()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.R);
                icons.add(Piece.Icon.K);
                return icons;
        }

        public ArrayList<Piece.Icon> blackTestSet3()
        {
                ArrayList<Piece.Icon> icons = new ArrayList<>();
                icons.add(Piece.Icon.K);
                return icons;
        }

        public boolean moveTestShouldReturnTrue3()
        {
                boolean[][] testMap = {
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, true,  false, false, false, false},
                        {true,  true,  true,  false, true,  true,  true,  true},
                        {false, false, false, true,  false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                };
                boolean[][] currentMap = getMoveMap(rook);
                for (int i = 0; i < Utils.BOARD_LENGTH; ++i)
                        for (int j = 0; j < Utils.BOARD_LENGTH; ++j)
                                if (testMap[i][j] != currentMap[i][j])
                                        return false;
                return true;
        }

        @Override
        public void resetElements()
        {
                super.resetElements();
                rook = (Rook) whitePlayer.pieces[8];
        }
}
