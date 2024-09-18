public class App {
    public static void main(String[] args) throws Exception {

        int age = 10; 
        
        if (age > 0 && age < 18)
        { 
            System.out.println("You are underage."); 
            if (age >= 15) 
            {
                System.out.println("You can drive a moped."); 
            }
            else if (age==10)
            {
                System.out.println("Anniversary Party!"); 
            }
        } 
        else if (age >= 65) 
        { 
            System.out.println("You are retired."); 
        } 
        
        else 
        { 
            System.out.println("You are an adult."); 

        } 
        
        System.out.println("Press space to exit.");

       

        
        
    }
}
