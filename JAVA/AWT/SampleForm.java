import java.awt.*;
public class SampleForm extends Frame {
   SampleForm(){
       Frame f=new Frame();
       Label l1=new Label("Your Name : ");
       Label l2=new Label("Your Age : ");
       Label l3=new Label("Choose Your Country : ");
        Button button = new Button("submit");
        TextField t=new TextField("Enter Name");
       TextField t1=new TextField("Enter Age");
        TextArea textarea=new TextArea("Give Your Feedback Here");
        Checkbox check=new Checkbox("Indian");
        Choice choose=new Choice();
        choose.add("Your County");
        choose.add("India");
        choose.add("UK");
        choose.add("USA");
        f.setBounds(100,100,500,500);
        f.add(l1);
        f.add(t);
       f.add(l2);
       f.add(t1);
       f.add(l3);
       f.add(choose);
       f.add(textarea);
       f.add(button);
       f.setSize(500,500);
       f.setLayout(new FlowLayout());
       f.setVisible(true);
    }
}
class Main{
    public static void main(String swe[]){
        new SampleForm();
    }
}
