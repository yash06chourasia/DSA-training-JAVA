public class mathModule {
    public static void main(String[] args) {
        System.out.println(Math.ceil(99.07)); 
        //ceil round up and floor round down
        System.out.println(Math.floor(99.07)); 
        //round  round to nearest
        System.out.println(Math.round(99.7)); 
        System.out.println(Math.pow(2,3)); 
        System.out.println(Math.min(99,7));
        System.out.println(Math.max(99,7));  
        System.out.println(Math.PI); 
        System.out.println(Math.abs(-99.07)); 
        System.out.println(Math.sqrt(100)); 

        System.out.println(Math.random());
        //0.0<random()<1.0
        //To increase range from 0 to 100
        double random=Math.random()*100;
        System.out.println(random);
       
        
        for (int i = 0; i < 10; i++) {
            //If integer is needed then
            int ran=(int)Math.round(Math.random()*100);
            System.out.println(ran);
        }
        System.out.println(Math.sin(Math.PI/2));
         System.out.println(Math.sin(Math.toRadians(90)));
    }
}
