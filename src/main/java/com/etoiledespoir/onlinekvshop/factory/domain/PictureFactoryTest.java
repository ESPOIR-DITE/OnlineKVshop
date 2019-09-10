package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Picture;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.RenderedImage;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PictureFactoryTest extends JFrame implements ActionListener {

        Picture panelImage;

        JFrame frame = new JFrame("Main Interface");

    javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        private JLabel inputClient = new JLabel("Client data");
        private JTextField textField = new JTextField(10);

        private JPanel panelText = new JPanel();

        private JButton btn1 =new JButton("chosePicture");

        private JPanel displayPanel = new JPanel();
        private JTextArea textArea = new JTextArea(4,40);


        /** Creates a new instance of ClientApp */
        public PictureFactoryTest()
        {
            //super("Main Interface");
            frame.setLayout(new GridLayout(3,1,10,10));
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setSize(600,500);

            panelText.setLayout(new GridLayout(3,1,10,10));
            displayPanel.setLayout(new FlowLayout());






            btn1.addActionListener(this);
            panelText.add(inputClient);
            panelText.add(textField);
            panelText.add(btn1);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            displayPanel.add(scrollPane);

            frame.add(panelText);
            frame.add(displayPanel);



            //textField.addActionListener((ActionListener) this);

            // Attempt to establish connection to server

        }


        public static void main(String[] args)
        {
            PictureFactoryTest client = new PictureFactoryTest() ;


        }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file = null;
        JFileChooser fc = new JFileChooser("/home");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF Images", "jpg", "gif", "png");


        if(e.getSource()==btn1){
            fc.setFileFilter(filter);
                System.out.println("im in");
                textField.setText("voila");

                int returnVal = fc.showOpenDialog(frame);
            file = fc.getSelectedFile();
            System.out.println(file.getPath());
            if (returnVal == JFileChooser.APPROVE_OPTION) {


                //This is where a real application would open the file.;
                System.out.println("Opening: " + file.getName() + "." );
                panelImage=PictureFactory.getPicture(0001,file.getName(),file.getPath(),file);
               // displayPanel.add(drawing());

               // jLabel1.setIcon((Icon) panelImage.getImage() /**new javax.swing.ImageIcon("C:\\Users\\ESPOIR pc\\Desktop\\webAppDesing\\LOGO.png"**/);

                jLabel1.setIcon(new javax.swing.ImageIcon(file.getPath()));
                panelText.add(jLabel1);
                frame.repaint();


            }
    }
}

public void drawing(Graphics d){
            d.drawImage(panelImage.getImage(),0,0, this);

}
}




