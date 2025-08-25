public class ExecutionTime {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int index = 1; index <=100 ; index++) {
            System.out.printf("%d ",index);
        }
        System.out.println();
        
        for (int index = 1; index <=100 ; index++) {
            System.out.printf("%d ",index);
        }
        System.out.println();
        long endTime=System.currentTimeMillis();
        System.out.printf("Execution time %d",(endTime-startTime));
    }
}
