import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

// TODO: Javadoc comments
// TODO: Finalize what the dimensions of the game should be.

@SuppressWarnings("serial")
public class GameFrame extends JFrame{

    // varaibles
    public static CardLayout cardLayout;
    public static JPanel mainPanel;
    private startMenu start;
    private mainMenu main;
    private exitMenu exit;
    private statusMenu status;
    private static JButton startMain;
    private static JButton startStatus;
    private JButton startExit;
    

    /*
    * Creates the game frame
    */
    public GameFrame() {
        createCardLayout();
        createNavigation();
        setLayout();
    }

    /*
    * Creates teh card layout
    */
    public void createCardLayout(){
        // initializing the cardlayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

	    Pet pet = new Pet("PetNamePlaceholder");
	
        // creating the cards
        start = new startMenu();
        main = new mainMenu(pet);
        exit = new exitMenu();
        status = new statusMenu(pet);

        // adding the cards
        mainPanel.add(start, "start");
        mainPanel.add(main, "main");
        mainPanel.add(exit, "exit");
        mainPanel.add(status, "status");
    }

    /*
    * Creates the navigation
    */
    public void createNavigation(){

        // TODO: Figure out how to hide the "START" button once you are in the game
        // TODO: Figure out how to hide the "STATUS" button until you are in the game

        // button to allow user to get back to main screen
        startMain = new JButton("MAIN");
        startMain.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "main");
                }
            }
        );

        startMain.setFont(new Font("Dialog", Font.BOLD, 10));
        startMain.setBorderPainted(false);
        startMain.setBackground(new Color(0xA3D8C8));

        // button to allow user to exit
        startExit = new JButton("EXIT");
        startExit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(mainPanel, "exit");
                }
            }  
        );

        startExit.setFont(new Font("Dialog", Font.BOLD, 10));
        startExit.setBorderPainted(false);
        startExit.setBackground(new Color(0xFC8080));

        // button to allow user to check pets status
        startStatus = new JButton("STATUS");
        startStatus.setVisible(false);
        startStatus.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
		            status.updateStatus();
                    cardLayout.show(mainPanel, "status");
                }
            }  
        );

        startStatus.setFont(new Font("Dialog", Font.BOLD, 10));
        startStatus.setBorderPainted(false);
        startStatus.setBackground(new Color(0xA3D8C8));
    }

    /*
    * Creates the layout of the game
    */
    public void setLayout(){
        JPanel navigation = new JPanel();
        navigation.add(startMain);
        navigation.add(startStatus);
        navigation.setBackground(new Color(0xFEFEFE));

        JPanel exit = new JPanel();
        exit.add(startExit);
        exit.setBackground(new Color(0xFEFEFE));

        Container pane = getContentPane();
        pane.add(mainPanel, BorderLayout.CENTER);
        pane.add(navigation, BorderLayout.NORTH);
        pane.add(exit, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setPreferredSize(new Dimension(300, 300));
        setVisible(true);
        startStatus.setVisible(false);
        startMain.setVisible(false);
    }

    /*
    * Shows the main menu
    */
    public static void showMain(){
        cardLayout.show(mainPanel, "main");
        startStatus.setVisible(true);
        startMain.setVisible(true);
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


