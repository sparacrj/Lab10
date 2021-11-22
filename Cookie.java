class Cookie {
  private int cookieAmount;
  private int temp;
  private int bakingTime;
  private boolean cookieDone;

Cookie() {
  cookieAmount = 0;
  temp = 0;
  bakingTime = 0;
  cookieDone = false;
}

Cookie(int aCookieAmount, int aTemp, int aBakingTime, boolean aCookieDone) {
  cookieAmount = aCookieAmount;
  temp = aTemp;
  bakingTime = aBakingTime;
  cookieDone = aCookieDone;
}

boolean isReady() {
  return cookieDone;
}

void setAmount(int actualAmount) {
  cookieAmount = actualAmount;
}

void bake(int actualTemp, int actualBakingTime) {
  temp = actualTemp;
  bakingTime = actualBakingTime;
  cookieDone = true;
  System.out.println("The cookies were baked at " + temp + " degrees F for " + bakingTime + " minutes.");
}

}