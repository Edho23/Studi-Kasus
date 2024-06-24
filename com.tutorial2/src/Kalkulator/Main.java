/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalkulator;

/**
 *
 * @author Sheva
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame mainFrame;
    private DrawPanel drawPanel;
    private Bola ball;
    private Thread gameThread;
    private boolean running = false;

    private int windowWidth = 640;
    private int windowHeight = 480;
    private String windowLabel = "Bola Memantul";

    public void run() {
        /* Initialize the ball */
        ball = new Bola(
                windowWidth / 2, 
                windowHeight / 2, 
                30, // Size of the ball
                new Color(0, 0, 0), 
                2, 
                2  
        );

        /* Initialize program */
        mainFrame = new JFrame();
        drawPanel = new DrawPanel(ball);
        drawPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        drawPanel.setPreferredSize(new Dimension(windowWidth, windowHeight));

        JPanel buttonPanel = createButtonPanel();

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(drawPanel, BorderLayout.CENTER);
        mainFrame.add(buttonPanel, BorderLayout.SOUTH);

        mainFrame.setTitle(windowLabel);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();

        JButton startButton = new JButton("Mulai");
        JButton stopButton = new JButton("Berhenti");
        JButton resumeButton = new JButton("Lanjut");
        JButton exitButton = new JButton("Keluar");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resumeButton);
        buttonPanel.add(exitButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAnimation();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAnimation();
            }
        });

        resumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resumeAnimation();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return buttonPanel;
    }

    private void startAnimation() {
        if (gameThread == null || !running) {
            running = true;
            gameThread = new Thread(() -> {
                while (running) {
                    ball.update(drawPanel.getWidth(), drawPanel.getHeight());

                    /* Repaint on the EDT */
                    SwingUtilities.invokeLater(() -> drawPanel.repaint());

                    /* Give Swing 10 milliseconds to see the update! */
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            gameThread.start();
        }
    }

    private void stopAnimation() {
        running = false;
    }

    private void resumeAnimation() {
        if (!running) {
            running = true;
            gameThread = new Thread(() -> {
                while (running) {
                    ball.update(drawPanel.getWidth(), drawPanel.getHeight());

                    /* Repaint on the EDT */
                    SwingUtilities.invokeLater(() -> drawPanel.repaint());

                    /* Give Swing 10 milliseconds to see the update! */
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            gameThread.start();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main program = new Main();
                program.run();
            }
        });
    }
}