/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalkulator;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    private Bola ball;

    public DrawPanel(Bola ball) {
        this.ball = ball;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        ball.draw(graphics);
    }
}
