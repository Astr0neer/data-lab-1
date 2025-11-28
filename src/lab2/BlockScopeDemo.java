package lab2;
public class BlockScopeDemo {
    public static void main(String[] args) {
        int outerX = 5;
        if(outerX ==5){
            int innerY = 15;
            System.out.println("Inside if block: outerX= " + outerX  +" " + "InnerY= " + innerY);
        }

        System.out.println(outerX);

    }


}
