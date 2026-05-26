import javax.swing.*;
import java.awt.*;

public class NewspaperCover {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Newspaper Cover");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

       
        JLabel title = new JLabel("THE DAILY NEWS", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        frame.add(title, BorderLayout.NORTH);

        
        JPanel headlines = new JPanel();
        headlines.setLayout(new GridLayout(5, 1));

        headlines.add(new JButton("News"));
        headlines.add(new JButton("Sports"));
        headlines.add(new JButton("Politics"));
        headlines.add(new JButton("Weather"));
        headlines.add(new JButton("Entertainment"));

        frame.add(headlines, BorderLayout.WEST);

    
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());

        JTextArea article = new JTextArea(
            "Main headline article"
        );

        article.setRows(15);
        article.setColumns(30);

        center.add(article);

        frame.add(center, BorderLayout.CENTER);

        
        JPanel ads = new JPanel();
        ads.setLayout(new BoxLayout(ads, BoxLayout.Y_AXIS));

        ads.add(new JLabel("Advertisement"));
        ads.add(new JButton("Buy Now"));

        frame.add(ads, BorderLayout.EAST);

    
        JLabel footer = new JLabel("Published Tomorrow");
        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}