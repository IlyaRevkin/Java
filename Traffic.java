public class Traffic {
    
    public static void main(String[] args) {
        
        Vehicle Car1 = new Vehicle("GAZ");
        Vehicle Car2 = new Vehicle("Volvo");
        Vehicle Car3 = new Vehicle("Skoda");
        Vehicle Car4 = new Vehicle();
        Vehicle Car5 = new Vehicle();
        
        System.out.println(Car1.getId()); 
        System.out.println(Car2.getId()); 
        System.out.println(Car3.getId());  
        System.out.println(Car4.getId());
        System.out.println(Car5.getId());

    }
}