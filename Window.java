import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Window extends JFrame {

    protected Map<String, JButton> allButtons = new HashMap<>();

    public JLabel operationScreen = new JLabel();
    public JLabel resultScreen = new JLabel();

    private static final String[] clearButtons =  {"C", "CE"};

    private static final String[][] mathButtons = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {".", "0", "=", "/"}
    };

    private static Font customFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    private JPanel mainPanel = new JPanel();
    private JPanel panelClearButtons = new JPanel(new GridLayout(1, 2, 3, 3));
    private JPanel panelMathButtons = new JPanel(new GridLayout(mathButtons.length, mathButtons.length, 3, 3));

    public Window() {
        createWindow();
        createButtons();
        createLabels(operationScreen);
        createLabels(resultScreen);
        createMainPanel(operationScreen, resultScreen);
    }

    private void createWindow(){
        this.setSize(210, 380);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.add(mainPanel);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createMainPanel(JLabel operationScreen, JLabel resultScreen){
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(0x17202a ));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(0,0,3,0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(operationScreen, gbc);

        gbc.gridy = 1;
        mainPanel.add(resultScreen, gbc);

        gbc.gridy = 2;
        mainPanel.add(panelClearButtons, gbc);

        gbc.gridy = 3;
        mainPanel.add(panelMathButtons, gbc);
    }

    private JLabel createLabels(JLabel label){
        label.setText("0");
        label.setFont(customFont);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setForeground(new Color(0x17202a ));

        return label;
    }

    private void createButtons(){
        for (int i = 0; i < clearButtons.length; i++){
            JButton button = new JButton(clearButtons[i]);
            buttonProperties(button);
            panelClearButtons.add(button);
            allButtons.put(button.getText(), button);
        }

        for (int i = 0; i < mathButtons.length; i++){
            for (int j = 0; j < mathButtons[i].length; j++){
                JButton button = new JButton(mathButtons[i][j]);
                buttonProperties(button);
                panelMathButtons.add(button);
                allButtons.put(button.getText(), button);
            }
        }
        panelClearButtons.setBackground(new Color(0x17202a ));
        panelMathButtons.setBackground(new Color(0x17202a ));
    }

    private JButton buttonProperties(JButton button){
        button.setFont(customFont);
        button.setForeground(new Color(0xffffff));
        button.setBackground(new Color(0x17202a ));
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.WHITE),
            BorderFactory.createEmptyBorder(5, 15, 5, 15))
        );

        return button;
    }
}
