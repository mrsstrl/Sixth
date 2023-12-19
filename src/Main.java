public class Main {

    public static void main(String[] args) {
        doTree(8,15);
        doTree(1,1);
        doTree(0,0);
    }

    private static void doTree(int h, int w){
        if ((h < 1) || (w < 1)){
            System.out.println("Wrong Input");
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                System.err.print(" ");
            }
            for (int j = 0; j < w-i; j++) {
                System.err.print(j % 10);
            }
            System.err.println();
        }
    }
}