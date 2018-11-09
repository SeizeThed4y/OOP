class Main {
  public static void main(String[] args) {
   
  LameCalculator lc = new LameCalculator();
  System.out.println("1+1 = "+lc.plus(1,1)); 
  System.out.println("2-3 = "+lc.minus(2,3));
  System.out.println("2x3 = "+lc.multiply(2,3));
  System.out.println("10:2 = "+lc.divide(10,2));
  
   
   

  }
}

//============================


	class LameCalculator {
 
  public int plus(int aA , int bB){
    
    
    
    return aA+bB;
    
  }
  
  public int minus(int aA, int bB ){
    
    
    return aA - bB;
    
  }
  
  public int multiply(int aA, int bB ){
    return aA * bB;
  }
  
  public int divide(int aA, int bB){
    return aA / bB;
  }

}