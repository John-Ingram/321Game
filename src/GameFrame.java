import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

// TODO: Javadoc comments

public class GameFrame extends JFrame{

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private startMenu start;
    private mainMenu main;
    private exitMenu exit;
    private statusMenu status;
    private JButton startGame;
    private JButton startMain;
    private JButton startStatus;
    private JButton startExit;
    

    public GameFrame() {
        createCardLayout();
        createNavigation();
        setLayout();
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

    public void createNavigation(){

        // TODO: Figure out how to hide the "START" button once you are in the game
        // TODO: Figure out how to hide the "STATUS" button until you are in the game

        startGame = new JButton("START");
        startGame.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "start");
                }
            }
        );

        startMain = new JButton("MAIN");
        startMain.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "main");
                }
            }
        );

        startExit = new JButton("EXIT");
        startExit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "exit");
                }
            }  
        );

        startStatus = new JButton("STATUS");
        startStatus.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "status");
                }
            }  
        );
    
    }

    public void setLayout(){
        JPanel navigation = new JPanel();
        navigation.add(startGame);
        navigation.add(startMain);
        navigation.add(startStatus);

        JPanel exit = new JPanel();
        exit.add(startExit);

        Container pane = getContentPane();
        pane.add(mainPanel, BorderLayout.CENTER);
        pane.add(navigation, BorderLayout.NORTH);
        pane.add(exit, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setPreferredSize(new Dimension(600, 600));
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


