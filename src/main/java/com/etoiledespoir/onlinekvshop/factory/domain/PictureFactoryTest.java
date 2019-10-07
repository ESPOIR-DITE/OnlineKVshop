package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Picture;
import com.etoiledespoir.onlinekvshop.repository.picture.pictureImpl.PictureRep;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;
import java.io.IOException;

public class PictureFactoryTest{}/** extends JFrame implements ActionListener {

        Picture panelImage;

        JFrame frame = new JFrame("Main Interface");

    JLabel jLabel1 = new JLabel();

        private JLabel inputClient = new JLabel("Client data");
        private JTextField textField = new JTextField(10);

        private JPanel panelText = new JPanel();

        private JButton btn1 =new JButton("chosePicture");

        private JPanel displayPanel = new JPanel();
        private JTextArea textArea = new JTextArea(4,40);


        //Creates a new instance of ClientApp
        public PictureFactoryTest()
        {
            //super("Main Interface");
            frame.setLayout(new GridLayout(3,1,10,10));
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setSize(960,1200);

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
        BufferedImage tempPNG = null;
        File outputfile=null;
        BufferedImage bi=null;
        BufferedImage resized=null;
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

                ImageIcon my=null;
                //This is where a real application would open the file.;
                System.out.println("Opening: " + file.getName() + "." );


                //reading the file selected and save it as an image

                try {
                     bi = ImageIO.read(new File(file.getPath()));

                      //we got the file from Jchoser and we are inserting it in the fileInputStream to enable us to save in the database

                     FileInputStream fin=new FileInputStream(file);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                //ImageResizer.resize(inputImagePath, outputImagePath1, scaledWidth, scaledHeight);
                //ublic static Picture getPicture(int pictureId, String picDescription, String url, File imageIcon)
                //NOW READING FROM THE DATABASE

                PictureRep pictureRep=PictureRep.getPictureRep();
                panelImage=PictureFactory.getPicture(0001,"YEAH",file.getPath(),file);

               // displayPanel.add(drawing());
               // jLabel1.setIcon((Icon) panelImage.getImage() new javax.swing.ImageIcon("C:\\Users\\ESPOIR pc\\Desktop\\webAppDesing\\LOGO.png");

                outputfile = new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\pictures\\"+file.getName());

                    Picture readpic=pictureRep.read("1001");
                   // Image myImage=readpic.getImage().getScaledInstance(500,500,Image.SCALE_SMOOTH);
                System.out.println(readpic.getIcon());

                InputStream is;

                   // ImageIcon bufferedImage=  readpic.getIcon();
                   //  my=bufferedImage;
                   // jLabel1.ImageIcon(my.getImage());


               // readpic.getImage();

              // Image scaled=  readpic.getImage().getScaledInstance(500,500,readpic.getImage().SCALE_SMOOTH);
               // ImageIcon imageIcon=new ImageIcon();
                jLabel1=new JLabel(readpic.getIcon());



                // Picture readpic=pictureRep.read("1001");
               //* pictureRep.creat(panelImage);
               // jLabel1.setIcon(new javax.swing.ImageIcon(file.getPath()));

               //jLabel1.setIcon(new javax.swing.ImageIcon((outputfile.getPath())));
                displayPanel.add(jLabel1);
                frame.repaint();


            }
    }
}

public void drawing(Graphics d){
            d.drawImage(panelImage.getImage(),0,0, this);

}
}



*/
