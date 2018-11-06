import java.util.*;

public class AIAgent{
  Random rand;

  public AIAgent(){
    rand = new Random();
  }

/*
  The method randomMove takes as input a stack of potential moves that the AI agent
  can make. The agent uses a rondom number generator to randomly select a move from
  the inputted Stack and returns this to the calling agent.

  pawn == 1
  knight / bishop == 3
  rook == 5
  queen == 9
  King == game
*/

  public Move randomMove(Stack possibilities){

    int moveID = rand.nextInt(possibilities.size());
    System.out.println("Agent randomly selected move : "+moveID);
    for(int i=1;i < (possibilities.size()-(moveID));i++){
      possibilities.pop();
    }
    Move selectedMove = (Move)possibilities.pop();
    return selectedMove;
  }

  public Move nextBestMove(Stack possibilities){
    Move selectedMove;
    Stack orderedMoves ;
    orderedMoves = orderMoves(possibilities);
    selectedMove = (Move)orderedMoves.pop();
    if(selectedMove.getValue() == 0){
      selectedMove = randomMove(possibilities);
    }
    return selectedMove;
  }

  public Move twoLevelsDeep(Stack possibilities){
    Move selectedMove = new Move();
    return selectedMove;
  }

  private Stack orderMoves(Stack availableMoves){

    if (availableMoves.isEmpty()){
      return availableMoves;
    }
    Move pivot = (Move)availableMoves.pop();

    Stack<Move> left = new Stack();
    Stack<Move> right = new Stack();

    while(!availableMoves.isEmpty()){
      Move a = (Move)availableMoves.pop();
      if(a.getValue() < pivot.getValue()){
        left.push(a);
      }
      else{
        right.push(a);
      }
    }
    orderMoves(left);
    orderMoves(right);

    Stack<Move> tmp = new Stack();
    while(!right.isEmpty()){
      tmp.push(right.pop());
    }
    tmp.push(pivot);
    while(!left.isEmpty()){
      tmp.push(left.pop());
    }
    while(!tmp.isEmpty()){
      availableMoves.push(tmp.pop());
    }
    return availableMoves;
  }
}
