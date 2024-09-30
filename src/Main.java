//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.println("Hello");

        Point p1 = new Point(1.0,1.0);
        Point p2 = new Point(2.0,2.0);

        Line l1 = new Line(p1,p2);
        l1.calculateLine();

    }
}