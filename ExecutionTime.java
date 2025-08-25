public class ExecutionTime {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int index = 1; index <=1000 ; index++) {
            System.out.printf("%d ",index);
        }
        System.out.println();
        
        for (int index = 1; index <=1000 ; index++) {
            System.out.printf("%d ",index);
        }
        System.out.println();
        long endTime=System.currentTimeMillis();
        System.out.println("Execution time "+(endTime-startTime));
    }
}
