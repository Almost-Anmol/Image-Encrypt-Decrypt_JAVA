import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ImageOperation {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setTitle("Image Operation");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Bali", Font.BOLD, 25);
        //creating button
        JButton button = new JButton();
        button.setText("Select Image");
button.setFont(font);

// creating text field
JTextField text = new JTextField(10);
text.setFont(font);

frame.setLayout(new FlowLayout());
frame.add(button);
frame.add(text);

frame.setVisible(true);


        
     System.out.println("this is test");   
    }
}