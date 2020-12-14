public class QuadraticEquation {
    public Double a, b, c;
    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public Double deltaa = this.b*this.b - (4*this.a*this.c);

    public Double getA(){
        return this.a;
    }
    public Double getB(){
        return this.b;
    }
    public Double getC(){
        return this.c;
    }

    public Double getDelta(){
        return this.b*this.b - (4*this.a*this.c);
    }

    public Double getRoot1(){
       return (-this.b + Math.pow(this.b*this.b - (4*this.a*this.c),0.5))/(2*this.a);
    }
    public Double getRoot2(){
        return (-this.b - Math.pow(this.b*this.b - (4*this.a*this.c),0.5))/(2*this.a);
    }
}
