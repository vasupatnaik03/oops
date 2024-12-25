public class inherit{
    public static void main(String args[]){
       admin ad = new admin();
       ad.read();
       ad.write(); 
       ad.modify();

       developer dv = new developer();
       dv.read();
    }
}