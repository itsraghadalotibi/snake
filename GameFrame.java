
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame{
  JButton playAgainButton;
   GamePanel gamePanel;

   GameFrame(){
    gamePanel = new GamePanel();
        
        // Set layout manager to GridLayout
        setLayout(new BorderLayout());
        
        // Add GamePanel
        add(gamePanel, BorderLayout.CENTER);
    

    playAgainButton = new JButton("Play Again");
    playAgainButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            if (gamePanel != null) {
                gamePanel.resetGame();
            } else {
                System.err.println("GamePanel is null. Cannot reset the game.");
            }

        }
        
    }); 
    
    add(playAgainButton, BorderLayout.SOUTH);
    setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

   }  
   
}
