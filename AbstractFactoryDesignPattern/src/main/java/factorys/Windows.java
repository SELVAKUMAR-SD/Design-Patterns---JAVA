package factorys;

import buttons.Button;

public class Windows implements UIFactory {
    @Override
    public Button createButton() {
        return new buttons.Windows();
    }
}
