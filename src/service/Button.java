package service;
import java.awt.*;


public class Button {

    private enum StatusButton{
        CLICKED, NOTCLICKED;
    }

    private Color cor ;
    private StatusButton statusButton;


    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void pressButton(){
        if (statusButton == StatusButton.CLICKED){
            return;
        }
        playButtonSound();
    }

    private void playButtonSound() {

    }
}
