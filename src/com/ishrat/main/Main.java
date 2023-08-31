package com.ishrat.main;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.ishrat.ui.CalculatorFrame;

/**
 * This is a scientific calculator.
 *
 * @author : Ishrat Amin

 */
public class Main
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setTitle("Calculator");
                frame.setIconImage(new ImageIcon(getClass().getResource("/com/ishrat/image/cal.png")).getImage());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}