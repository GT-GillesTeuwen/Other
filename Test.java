public class Test {
    
    private static boolean assertEquals(int expected,int actual){
        if(expected==actual){
            System.out.println("Passed");
            return true;
        }
            System.out.println("Expected "+expected+" got "+actual);
        return false;
    }

    public static void run(){
        assertEquals(0, 0);
        assertEquals(1, 0);
        assertEquals(1, 1);
    }

    public static void main(String[] args) {
        run();
    }

}
