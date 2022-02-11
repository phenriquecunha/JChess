package pedro.cunha.models;

public class Rook extends Piece{

    public Rook(EnumColor color, int posX, int posY, String img, Board board) {
        super(color, posX, posY, img, board);
    }

    @Override
    public boolean isLegalMove(int desX, int desY) {
        return false;
    }
}
