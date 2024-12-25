public class admin extends developer{ 
    
    // public void read(){
    //      System.out.println("can only view and read");
    //  }

    // public void write(){
    //     System.out.println("can write");
    // }

    {
        super.read();
    }
    public void read()
    {
        
        System.out.println("This code from the sub class");
    }

    public void modify(){
        
        System.out.println("manage the code ");
    }
}
