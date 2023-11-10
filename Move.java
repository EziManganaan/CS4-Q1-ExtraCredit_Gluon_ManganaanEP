public class Move{
  private String name;
  private Move winsAgainst;

  public Move(String name){
    this.name = name;
    this.winsAgainst = null;
  }
	
  public String getName(){
    return this.name;
  }
	
  public Move getwinsAgainst(){
    return this.winsAgainst;
  }
	
  public void setwinsAgainst(Move winsAgainst){
    this.winsAgainst = winsAgainst;
  }

  public static int assessMoves(Move m1, Move m2){
    if(m1.getwinsAgainst() == m2){
      return 0;
    }
    else if(m2.getwinsAgainst() == m1){
      return 1;
    }
    else {
      return 2;
    }
  }
}