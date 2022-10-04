package imagens;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Imagens {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        ImageIcon x = new ImageIcon("java0.jpg");
        Cadastro y = new Cadastro(x);
        cadastro.add(y);
        
        
        cadastro.add(new Cadastro(new ImageIcon("java1.jpg")));
        
        cadastro.add(new Cadastro(new ImageIcon("java2.jpg")));

        try {
            FileOutputStream writeData = new FileOutputStream("bd.txt");
            
            try (ObjectOutputStream writeStream = new ObjectOutputStream(writeData)) {
                writeStream.writeObject(cadastro);
                writeStream.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
