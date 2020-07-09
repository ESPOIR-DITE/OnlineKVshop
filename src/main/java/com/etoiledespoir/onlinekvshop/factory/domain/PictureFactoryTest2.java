package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Picture;
import com.etoiledespoir.onlinekvshop.domain.item.pic.Mypic;
import com.etoiledespoir.onlinekvshop.domain.item.pic.picHelper.MypicHelper;
import com.etoiledespoir.onlinekvshop.factory.domain.item.pic.MypicFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.pic.pictureHelpReader.MyPicHelperFactory;
import com.etoiledespoir.onlinekvshop.factory.service.MypicServiceFactory;
import com.etoiledespoir.onlinekvshop.service.item.mypic.impl.PictureService;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PictureFactoryTest2 extends JFrame implements ActionListener {


        BufferedImage bufferedImage;
        Image image;
        Picture panelImage;
        JFrame frame = new JFrame("Main Interface");
        JLabel jLabel1 = new JLabel();

    Mypic  mypic;

        private JLabel inputClient = new JLabel("Client data");
        private JTextField textField = new JTextField(10);

        private JPanel panelText = new JPanel();
        private JPanel album = new JPanel();

        private JButton btn1 =new JButton("send a pic");
        private JButton btn2 =new JButton("Read");
        private JButton btn3 =new JButton("Delete");
        private JButton btn4 =new JButton("Read all");


        private JPanel displayPanel = new JPanel();
        private JPanel displayPanel1 = new JPanel();
        private JTextArea textArea = new JTextArea(40,40);


        //PictureRep2 PicRep=PictureRep2.getPictureRep();
        PictureService picRep= MypicServiceFactory.getMypic();
        // Creates a new instance of ClientApp
        public PictureFactoryTest2()
        {
            //super("Main Interface");
            frame.setLayout(new BorderLayout());
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setSize(960,1200);

            panelText.setLayout(new GridLayout(3,1));
            displayPanel.setLayout(new FlowLayout());
            album.setLayout(new FlowLayout());


            btn1.addActionListener(this);
            btn2.addActionListener(this);
            btn3.addActionListener(this);
            btn4.addActionListener(this);
            panelText.add(inputClient);
            panelText.add(textField);
            panelText.add(btn2);
            panelText.add(btn1);
            panelText.add(btn3);
            panelText.add(btn4);


            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            displayPanel.add(scrollPane);

            frame.add(panelText,BorderLayout.NORTH);
            frame.add(displayPanel,BorderLayout.WEST);
           // frame.add(displayPanel);



            //textField.addActionListener((ActionListener) this);

            // Attempt to establish connection to server

        }


        public static void main(String[] args)
        {
            PictureFactoryTest2 client = new PictureFactoryTest2() ;


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
                     File file1=new File(file.getPath());
                     // sending the file to the Factory
                // Pictures2 pictures2= Picture2Factory.getPicture("","miriam","voila",file1);
                    mypic = MypicFactory.getMypic("ewrewrre","werter");
                    MypicHelper mypicHelper= MyPicHelperFactory.getMypicHelper("12323",file1,"voila");
                    // System.out.println(mypic.toString());

                   Mypic result= picRep.creat(mypic);
                   String valeu=picRep.creatImage(mypicHelper.getImage(),"1000");



                    ImageIcon icon = new ImageIcon(buildFile(file1));
                    jLabel1=new JLabel();
                    jLabel1.setIcon(icon);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                displayPanel.removeAll();
                album.removeAll();
                //displayPanel.add(jLabel1);
                displayPanel.repaint();
                album.add(jLabel1);
                frame.add(album,BorderLayout.CENTER);
                frame.repaint();


            }
    }
        if(e.getSource()==btn2){
            System.out.println("in reading");
            String id=textField.getText();
            System.out.println(id+"  to read");
            if(id!=null){
               // ImageIcon icon = new ImageIcon(picRep.readFile(id));
                System.out.println("reading the image Base64 "+picRep.readFile(id));
                jLabel1=new JLabel();
                //jLabel1.setIcon(icon);
                displayPanel.removeAll();
                //displayPanel.add(jLabel1);
                album.removeAll();
                displayPanel.repaint();
                album.add(jLabel1);
                frame.add(album,BorderLayout.CENTER);
                frame.repaint();
            }
        }
        if(e.getSource()==btn3){
            String id=textField.getText();
            System.out.println(id+"  to delete");
            if(id!=null){
                //ImageIcon icon = new ImageIcon(picRep.delete(id).getImage());
                jLabel1=new JLabel();
                //.setIcon(icon);
                displayPanel.removeAll();
                //displayPanel.add(jLabel1);
                album.removeAll();
                displayPanel.repaint();
                album.add(jLabel1);
                frame.add(album,BorderLayout.CENTER);
                frame.repaint();
            }

        }
       /** if(e.getSource()==btn4){
           // String id=textField.getText();
            System.out.println("  to read All");

                List<Mypic>myList=new List<>();
                myList=picRep.readAll();

                jLabel1=new JLabel();

                    displayPanel.removeAll();

                for(Pictures2 s:myList){
                    ImageIcon icon = new ImageIcon(s.getImage());
                    jLabel1.setIcon(icon);

                //displayPanel.add(jLabel1);
                album.removeAll();
                displayPanel.repaint();
                album.add(jLabel1);
                album.repaint();
                frame.add(album,BorderLayout.CENTER);
                frame.repaint();
            }

        }*/
}

public void drawing(Graphics d){
            d.drawImage(panelImage.getImage(),0,0, this);

}


    public Image buildFile(File file){
        // System.out.println(file.getName()+"in buildFile");
        if(file!=null){
            try {
                bufferedImage= ImageIO.read(file);

                // System.out.println(bufferedImage+"  bufferedImage");

                image=resize(bufferedImage,500,500);

                // System.out.println(myimage+"  resized");

                // System.out.println(image.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }}


        return image;
    }

    private static BufferedImage resize(BufferedImage img, int height, int width) {
        // System.out.println(img+"   in resize");
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}




