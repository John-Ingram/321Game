import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameFrame extends JFrame{

    CardLayout cardLayout;
    JPanel mainPanel;
    startMenu start;
    mainMenu main;
    exitMenu exit;
    statusMenu status;
    

    public GameFrame() {
        createCardLayout();
        addNavigation();
    }

    public void createCardLayout(){
        // initializing the cardlayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // creating the cards
        start = new startMenu();
        main = new mainMenu();
        exit = new exitMenu();
        status = new statusMenu();

        // adding the cards
        mainPanel.add(start, "start");
        mainPanel.add(main, "main");
        mainPanel.add(exit, "exit");
        mainPanel.add(status, "status");
    }

    public void addNavigation(){
        JButton startGame = new JButton("START");
        startGame.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "start");
                }
            }
        );

        JButton startMain = new JButton("MAIN");
        startMain.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "main");
                }
            }
        );

        JButton startExit = new JButton("EXIT");
        startExit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "exit");
                }
            }  
        );

        JButton startStatus = new JButton("STATUS");
        startStatus.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "status");
                }
            }  
        );

        add(mainPanel);
        add(startGame, BorderLayout.NORTH);
        add(startMain, BorderLayout.SOUTH);
        add(startExit, BorderLayout.WEST);
        add(startStatus, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                GameFrame gameFrame = new GameFrame();
            }
        });
    }
}


