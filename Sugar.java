class Sugar extends Cookie{
  String cookieShape;
  Boolean cookieDecorated;

  Sugar(){
    cookieShape = "";
    cookieDecorated = false;
  }

  Sugar(String aCookieShape){
    cookieShape = aCookieShape;
    cookieDecorated = false;
  }

  String getShape(){
    return cookieShape;
  }

  void setShape(String actualShape){
    cookieShape = actualShape;
  }

  void cut(String actualCookieShape, int actualNumber){
    cookieShape = actualCookieShape;
    setAmount(actualNumber);
    System.out.println(actualNumber + " cookies were cut into " + cookieShape);
  }

  void decorate(){
    boolean ready = isReady();
    if (ready == true) {
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }

  }


}