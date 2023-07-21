package render.panel;

import main.GameManager;

import javax.swing.*;
import java.awt.*;

import static render.RenderUtil.tileSize;

public class StagePanel extends JPanel {
    private GameManager gameManager;

    public StagePanel(GameManager gameManager){
        this.gameManager = gameManager;
        setDoubleBuffered(true);
        setBackground(Color.CYAN);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        gameManager.getCurrentRoom().getBackgroundManager().draw(g2);
        gameManager.getPlayer().draw(g2);
        gameManager.getCurrentRoom().draw(g2);
        g2.setColor(Color.RED);
//        for(int i = 1; i <= getWidth() / tileSize; i++) g2.drawLine(i * tileSize, 0, i * tileSize, getHeight());
//        for(int i = 1; i <= getHeight() / tileSize; i++) g2.drawLine(0, i * tileSize, getWidth(), i * tileSize);
        g2.dispose();
    }
}
