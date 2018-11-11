public class Main {
  public static void main(String[] args) {
   
    Carpet c  = new Carpet();
    System.out.println(c.totalPrice);
    

  }
}

=============


public class Carpet {
 
 //do not change -- Start
  public double width,length,unitPrice,totalPrice;
  public boolean isPersian;
 //do not change -- End
 
 //Add constructors below
 
 
 public Carpet(){
   
   this.width = 300;
   this.length = 300;
   this.totalPrice = 200;
   this.unitPrice = 0;
   this.isPersian = false;
   
 }
  
  public Carpet(double width, double length, double unitPrice, boolean isPersian){
    
    this.width = width;
    this.length = length;
    this.unitPrice = unitPrice;
    this.isPersian = isPersian;
    
    this.totalPrice = (width+length)*unitPrice;
    
    if(isPersian){
      this.totalPrice += 200;
    }
    
  }
  
  
  
}