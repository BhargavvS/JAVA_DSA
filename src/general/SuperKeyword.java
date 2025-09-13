package general;

import org.w3c.dom.ls.LSOutput;

class box{
    double width , height, depth;

    box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    box(double width,double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    box(int len){
        this.width = len;
        this.height = len;
        this.depth = len;
    }

    public double volume(){
        return width*height*depth;
    }
}

class box2 extends box{
    double weight;

    box2(double width,double height, double depth,double weight){
        super(width,height,depth);
        this.weight = weight;
    }

    public double volume(){
        return super.width * weight * super.height * super.depth;
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        box2 b = new box2(10,20,30,40);

        System.out.println(b.volume());
    }


}
