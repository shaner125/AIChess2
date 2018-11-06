class Move {
  Square start;
  Square landing;
  int points;


  public Move(Square x, Square y, int value) {
    points = value;
    start = x;
    landing = y;
  }

  public Move() {

  }

  public Square getStart() {
    return start;
  }

  public Square getLanding() {
    return landing;
  }
  public int getValue(){
    return points;
  }
}