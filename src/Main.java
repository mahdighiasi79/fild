class Calculate{
    private static int i;
     {i = 2;}
    int cube(int x){
        return x*x*x;
    }
    public int getI(){
        return this.i;
    }
}

    public class Main{ public static void main(String args[]){
        Calculate c = new Calculate();
        int result=c.cube(5);
        System.out.println(result);
        System.out.println(c.getI());
    }}

