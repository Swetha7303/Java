import java.awt.*;
import javax.swing.*;
class Swing
{
    Swing()
    {
        JFrame F=new JFrame("Login Page");
        F.setTitle("Login Page");
        F.setVisible(true);
        F.setSize(600,600);
        F.setLayout(null);
        JLabel l1=new JLabel("Name");
        l1.setBounds(40,60,80,50);
        TextField t1=new TextField("Enter Your Name");
        t1.setBounds(200,80,130,25);
        JLabel l2=new JLabel("EMail I'd");
        l2.setBounds(40,110,80,50);
        TextField t2=new TextField("Enter Your Email I'd");
        t2.setBounds(200,120,130,25);
        JLabel l3=new JLabel("Password");
        l3.setBounds(40,160,80,50);
        TextField t3=new TextField("Enter Your Password");
        t3.setBounds(200,170,130,25);
        JLabel l4=new JLabel("Confirm  Password");
        l4.setBounds(40,210,120,50);
        TextField t4=new TextField("Enter Your Password");
        t4.setBounds(200,220,130,25);
        JLabel l5=new JLabel("Country");
        l5.setBounds(40,250,130,50);
        Choice c=new Choice();
        c.add("India");
        c.add("America");
        c.add("Goreiya");
        c.add("Rasiya");
        c.add("Indoseniya");
        c.add("Japan");
        c.add("London");
        c.setBounds(200,265,100,25);
        JButton b=new JButton("Submit");
        b.setBounds(120,310,100,30);
        F.add(l1);
        F.add(t1);
        F.add(l2);
        F.add(t2);
        F.add(l3);
        F.add(t3);
        F.add(l4);
        F.add(t4);
        F.add(l5);
        F.add(c);
        F.add(b);
    }
    public static void main(String[] args) {
        Swing obj=new Swing();
    }
}
