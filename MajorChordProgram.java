import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MajorChordProgram implements ActionListener  {
    private FrameMethod frame;
    private LabelMethod Achord;
    private LabelMethod Gchord;
    private LabelMethod Cchord;
    private LabelMethod Dchord;
    private LabelMethod Fchord;
    private LabelMethod Echord;
    private ButtonMethod b1;
    private ButtonMethod b2;
    private ButtonMethod b3;
    private ButtonMethod b4;
    private ButtonMethod b5;
    private ButtonMethod b6;
    private ImageIcon sound = new ImageIcon("C:\\Users\\taylo\\Downloads\\Sound.jpg");
    private ImageIcon greenNote = new ImageIcon("C:\\Users\\taylo\\Downloads\\Green Note.jpg");


    public static void main(String[] args) {
        new MajorChordProgram();
    }


    public MajorChordProgram() {

        Border border = BorderFactory.createLineBorder(new Color(0,115,0), 14);
        frame = new FrameMethod();
        

        Achord = new LabelMethod("C:\\Users\\taylo\\Downloads\\A_chord.jpg", 185, 250);
        Achord.setText("A Chord");
        Achord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Achord.setVerticalTextPosition(JLabel.BOTTOM);
        Achord.setHorizontalAlignment(JLabel.LEFT);
        Achord.setVerticalAlignment(JLabel.TOP);
        Achord.setBounds(0, 0, 360, 400);
        b1 = new ButtonMethod();
        b1.addActionListener(this);
        b1.setText("Hello");
        b1.setBounds(250,85,100,100);
        b1.setIcon(sound);
        


        Gchord = new LabelMethod("C:\\Users\\taylo\\Downloads\\G_Chord.jpg", 185, 250);
        Gchord.setText("G Chord");
        Gchord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Gchord.setVerticalTextPosition(JLabel.TOP);
        Gchord.setHorizontalAlignment(JLabel.LEFT);
        Gchord.setVerticalAlignment(JLabel.BOTTOM);
        Gchord.setBounds(0, 220, 360, 400);
        b2 = new ButtonMethod();
        b2.addActionListener(this);
        b2.setText("Hello");
        b2.setBounds(250,450,100,100);
        b2.setIcon(sound);
        


        Cchord = new LabelMethod("C:\\Users\\taylo\\Downloads\\C chord.jpg", 185, 250);
        Cchord.setText("C Chord");
        Cchord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Cchord.setVerticalTextPosition(JLabel.BOTTOM);
        Cchord.setHorizontalAlignment(JLabel.CENTER);
        Cchord.setVerticalAlignment(JLabel.TOP);
        Cchord.setBounds(320, 0, 360, 400);
        b3 = new ButtonMethod();
        b3.addActionListener(this);
        b3.setText("Hello");
        b3.setBounds(635,85,100,100);
        b3.setIcon(sound);


        Dchord = new LabelMethod("C:\\Users\\taylo\\Downloads\\D Chord.jpg", 185, 250);
        Dchord.setText("D Chord");
        Dchord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Dchord.setVerticalTextPosition(JLabel.TOP);
        Dchord.setHorizontalAlignment(JLabel.CENTER);
        Dchord.setVerticalAlignment(JLabel.BOTTOM);
        Dchord.setBounds(320, 220, 360, 400);
        b4 = new ButtonMethod();
        b4.addActionListener(this);
        b4.setText("Hello");
        b4.setBounds(635,450,100,100);
        b4.setIcon(sound);


        Fchord = new LabelMethod("C:\\Users\\taylo\\Downloads\\F Chord.jpg", 185, 250);
        Fchord.setText("F Chord");
        Fchord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Fchord.setVerticalTextPosition(JLabel.BOTTOM);
        Fchord.setHorizontalAlignment(JLabel.CENTER);
        Fchord.setVerticalAlignment(JLabel.TOP);
        Fchord.setBounds(700, 0, 360, 400);
        b5 = new ButtonMethod();
        b5.addActionListener(this);
        b5.setText("Hello");
        b5.setBounds(1020,85,100,100);
        b5.setIcon(sound);


        Echord = new LabelMethod("C:\\Users\\taylo\\Downloads\\E Chord.jpg", 185, 250);
        Echord.setText("E Chord");
        Echord.setFont(new Font("Comic Sans Ms",Font.BOLD,25));
        Echord.setVerticalTextPosition(JLabel.TOP);
        Echord.setHorizontalAlignment(JLabel.CENTER);
        Echord.setVerticalAlignment(JLabel.BOTTOM);
        Echord.setBounds(700, 220, 360, 400);
        b6 = new ButtonMethod();
        b6.addActionListener(this);
        b6.setText("Hello");
        b6.setBounds(1020,450,100,100);
        b6.setIcon(sound);


 
        frame.getRootPane().setBorder(border);
        frame.setTitle("Major Chord Player");
        frame.add(Achord);
        frame.add(Gchord);
        frame.add(Cchord);
        frame.add(Dchord);
        frame.add(Fchord);
        frame.add(Echord);
        

        

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);

        frame.setIconImage(greenNote.getImage());
        

        

        
        


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            playAudio("C:\\Users\\taylo\\Music\\A Chord.wav");

        }
        else if(e.getSource() == b2) {
            playAudio("C:\\Users\\taylo\\Music\\G chord (1).wav");

        }
        else if(e.getSource() == b3) {
            playAudio("C:\\Users\\taylo\\Music\\C chord (1).wav");
            
        }
        else if(e.getSource() == b4) {
            playAudio("C:\\Users\\taylo\\Music\\D Chord.wav");
            
        }
        else if(e.getSource() == b5) {
            playAudio("C:\\Users\\taylo\\Music\\F Chord.wav");

            
        }
        else if(e.getSource() == b6) {
            playAudio("C:\\Users\\taylo\\Music\\E Chord.wav");
            
        }
    }
        
    



    private void playAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
    
    



