/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalkulator;

import java.awt.Color;
import java.awt.Graphics;

public class Bola {
    private int posX, posY, size;
    private Color color;
    private int vx, vy;

    public Bola(int posX, int posY, int size, Color color, int vx, int vy) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.color = color;
        this.vx = vx;
        this.vy = vy;
    }

    public void update(int windowWidth, int windowHeight) {
        if (posX >= windowWidth - size || posX <= 0) {
            vx *= -1;
        }

        if (posY >= windowHeight - size || posY <= 0) {
            vy *= -1;
        }

        posX += vx;
        posY += vy;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(posX, posY, size, size);
    }

    // Getters and Setters as needed
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }
}
