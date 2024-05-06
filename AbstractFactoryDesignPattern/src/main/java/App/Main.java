package App;

import buttons.Button;
import factorys.Mac;
import factorys.UIFactory;
import factorys.Windows;

public class Main {
    public static void main(String[] args) {
        Button button;
        UIFactory uiFactory;
        String factoryName = "";
        if (factoryName == "mac") {
            uiFactory = new Mac();
        } else {
            uiFactory = new Windows();
        }

        button = uiFactory.createButton();
        button.create();
    }
}
