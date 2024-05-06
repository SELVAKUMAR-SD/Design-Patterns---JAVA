package factorys;

import buttons.Button;

public class Mac implements UIFactory {
    @Override
    public Button createButton() {
        return new buttons.Mac();
    }
}
