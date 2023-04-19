package javaio;

public class DecoratorTest {
    
    public static void main(String[] args) {
        Circle circle = new Circle();
//        RedShapeDecorator rCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator rRegtangle = new RedShapeDecorator(new Regtangle());
//        rCircle.draw();
        circle.draw();
        RedShapeDecorator cir = new RedShapeDecorator(circle);
        cir.draw();
        rRegtangle.draw();
    }
}
