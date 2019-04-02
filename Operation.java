import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operation {

    Double[] numbers;
    Double lastResult;
    int contador = 0;

    public Operation(Window button){

        //region Numeric keyboard
        button.allButtons.get("0").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "0");
                numbers[contador] = 0;
                contador++;
            }
        });
        button.allButtons.get("1").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "1");
            }
        });
        button.allButtons.get("2").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "2");
            }
        });
        button.allButtons.get("3").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "3");
            }
        });
        button.allButtons.get("4").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "4");
            }
        });
        button.allButtons.get("5").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "5");
            }
        });
        button.allButtons.get("6").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "6");
            }
        });
        button.allButtons.get("7").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "7");
            }
        });
        button.allButtons.get("8").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "8");
            }
        });
        button.allButtons.get("9").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initOperationScreen(button);
                button.operationScreen.setText(button.operationScreen.getText() + "9");
            }
        });
        //endregion

        //region Operation signs
        button.allButtons.get("+").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.operationScreen.setText(button.operationScreen.getText() + " + ");
            }
        });
        button.allButtons.get("-").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.operationScreen.setText(button.operationScreen.getText() + " - ");
            }
        });
        button.allButtons.get("/").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.operationScreen.setText(button.operationScreen.getText() + " / ");
            }
        });
        button.allButtons.get("*").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.operationScreen.setText(button.operationScreen.getText() + " * ");
            }
        });
        //endregion

        button.allButtons.get("=").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void initOperationScreen(Window button){
        if (button.operationScreen.getText().equals("0")){
            button.operationScreen.setText("");
        }
    }
}
