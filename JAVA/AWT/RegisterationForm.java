import java.awt.*;
class RegisterationForm
{
    RegisterationForm()
    {
        Frame F=new Frame("Login Page");
        F.setTitle("Login Page");
        F.setVisible(true);
        F.setSize(600,600);
        F.setLayout(null);
        Label l1=new Label("Name");
        l1.setBounds(40,60,80,50);
        TextField t1=new TextField("Enter Your Name");
        t1.setBounds(180,80,130,25);
        Label l2=new Label("EMail I'd");
        l2.setBounds(40,110,80,50);
        TextField t2=new TextField("Enter Your Email I'd");
        t2.setBounds(180,120,130,25);
        Label l3=new Label("Password");
        l3.setBounds(40,160,80,50);
        TextField t3=new TextField("Enter Your Password");
        t3.setBounds(180,170,130,25);
        Label l4=new Label("Confirm Password");
        l4.setBounds(40,210,120,50);
        TextField t4=new TextField("Enter Your Password");
        t4.setBounds(180,220,130,25);
        Label l5=new Label("Country");
        l5.setBounds(40,250,80,50);
        Choice c=new Choice();
        c.add("India");
        c.add("America");
        c.add("Goreiya");
        c.add("Rasiya");
        c.add("Indoseniya");
        c.add("Japan");
        c.add("London");
        c.setBounds(180,265,100,25);
        Button b=new Button("Submit");
        b.setBounds(130,310,60,30);
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
        RegisterationForm obj=new RegisterationForm();
    }
}