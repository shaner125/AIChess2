class Square{
  public int xCoor;
  public int yCoor;
  public String pieceName;
  public int points;

  public Square(int x, int y, String name){
    xCoor = x;
    yCoor = y;
    pieceName = name;
    switch(name){
      case "WhiteQueen": points = 9;
      break;
      case "BlackQueen": points = 9;
        break;
      case "WhiteBishop": points = 3;
      break;
      case "BlackBishop": points = 3;
        break;
      case "WhiteRook": points = 5;
      break;
      case "BlackRook": points = 5;
        break;
      case "BlackKnight": points = 3;
      break;
      case "WhiteKnight": points = 3;
        break;
      case "WhitePawn": points = 1;
      break;
      case "BlackPawn": points = 1;
        break;
      default: points = 0;
    }

  }

  public Square(int x, int y){
    xCoor = x;
    yCoor = y;
    pieceName = "";
    points = 0;
  }

  public int getXC(){
    return xCoor;
  }

  public int getYC(){
    return yCoor;
  }

  public String getName(){
      return pieceName;
  }

  public int getPoints(){return points;}

}
