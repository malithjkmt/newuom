/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Malith
 */

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener{
    boolean selected = false;
    ImageIcon X,O;
    
		/*
		0:O
		1:X
		*/
    public XOButton(){
        X = new ImageIcon(this.getClass().getResource("/pic/X.png"));
        O = new ImageIcon(this.getClass().getResource("/pic/O.png"));
        this.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if (!(selected)){
            selected = true;
            switch(TicTacToe.value){
                case 0:
                    setIcon(O);
                    TicTacToe.value = 1;
                    break;
                case 1:
                    setIcon(X);
                    TicTacToe.value = 0;
            }
        }
    }
}