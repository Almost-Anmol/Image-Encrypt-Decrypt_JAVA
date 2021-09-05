import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageOperation {

    public static void operation(int key) {
        JFileChooser selectFile = new JFileChooser();
        selectFile.showOpenDialog(null);
        File file = selectFile.getSelectedFile();
        // file input stream reader
        try {

            FileInputStream fin = new FileInputStream(file);

            byte[] data = new byte[fin.available()];
            fin.read(data);
            int i = 0;
            for (byte b : data) {
                System.out.println(b);
                data[i] = (byte) (b ^ key);
                i++;
            }
            // file output stream writer
            FileOutputStream fout = new FileOutputStream(file);
            fout.write(data);
            fout.close();
            fin.close();
            JOptionPane.showMessageDialog(null, "Operation Successful !");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Image Operation");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Bali", Font.BOLD, 25);

        // creating text field
        JTextField text = new JTextField(10);
        text.setFont(font);

        // creating button
        JButton button = new JButton();
        button.setText("Select Image");
        button.setFont(font);

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(text);
        frame.setVisible(true);

        button.addActionListener(e -> {
            String input = text.getText();
            int key = Integer.parseInt(input);
            operation(key);
        });

        // System.out.println("this is test");
    }
}