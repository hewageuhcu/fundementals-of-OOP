//rectangular solid
public class sur_volume{
    public static void main(String args[]){
        //rectangular solid
        double l=10;
        double h=2;
        double w=4;
        double s_rs=2*l*w+2*l*h+2*w*h;
        double v_rs=l*w*h;
        System.out.println(s_rs);
        System.out.println(v_rs);
        //cylinder
        double r=7;
        double s_cy=2*Math.PI*r*h;
        double v_cy=Math.PI*r*r*h;
        System.out.println(s_cy);
        System.out.println(v_cy);
        //cones
        double s=23;
        double s_co=Math.PI*r*r+Math.PI*r*s;
        double v_co=(Math.PI*r*r*h)/3;
        System.out.println(s_co);
        System.out.println(v_co);
        //sphere
        double s_sp=4*Math.PI*r*r;
        double v_sp=(4*Math.PI*r*r*r)/4;
        System.out.println(s_sp);
        System.out.println(v_sp);
    }
}

