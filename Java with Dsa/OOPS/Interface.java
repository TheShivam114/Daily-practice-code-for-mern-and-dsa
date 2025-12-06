public class Interface {
    public static void main(String[] args){
       Queen q=new Queen();
       q.move();
    }
}
interface ChessPlayer {
void move();
    
}
class Queen implements ChessPlayer{
   public void move(){
        System.out.println("move all side ");
    }
}
class rook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}
