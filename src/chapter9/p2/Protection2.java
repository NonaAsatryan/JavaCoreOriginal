package chapter9.p2;

public class Protection2 extends chapter9.p1.Protection {

    Protection2 () {

        System.out.println("derived other package constructor");

        //class or package only
        //System.out.println("n = " + n);

        //class only
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
