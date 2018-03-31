package ser516.project3.client.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ConnectioonPopUp class to show the pop up dialog in which user can enter the server
 * information to connect to the server like IP Address and Port Number.
 * @author vishakhasingal
 * @version 1.0
 */

public class ConnectionPopUpView extends JDialog {

    public ConnectionPopUpView() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(280, 200));
        setResizable(false);


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());
        mainPanel.setOpaque(false);
        mainPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(Color.WHITE);


        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel ipAddressLabel = new JLabel("IP Address: ");
        ipAddressLabel.setHorizontalAlignment(JLabel.RIGHT);
        ipAddressLabel.setVerticalTextPosition(JLabel.CENTER);
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0, 0, 10, 10);
        mainPanel.add(ipAddressLabel, bagConstraints);

        JLabel portNumberLabel = new JLabel("Port Number:");
        portNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
        portNumberLabel.setVerticalTextPosition(JLabel.CENTER);
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 1;
        bagConstraints.insets = new Insets(0, 0, 0, 10);
        mainPanel.add(portNumberLabel, bagConstraints);

        JTextField ipAddressTextField = new JTextField();
        ipAddressTextField.setPreferredSize(new Dimension(120,20));
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0,0,10,0);
        mainPanel.add(ipAddressTextField, bagConstraints);

        JTextField portNumberTextField = new JTextField();
        portNumberTextField.setPreferredSize(new Dimension(80,20));
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 1;
        bagConstraints.insets = new Insets(0,0,0,0);
        mainPanel.add(portNumberTextField, bagConstraints);

        JButton connectButton = new JButton("Connect");
        connectButton.setBackground(Color.RED);
        connectButton.setPreferredSize(new Dimension(120, 35));
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 2;
        bagConstraints.gridwidth = 2;
        bagConstraints.insets = new Insets(20,20,0,20);
        mainPanel.add(connectButton,bagConstraints);
        connectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                invokeConnectButtonListener(e);
            }
        });

        add(mainPanel);
        setVisible(true);

    }

    void invokeConnectButtonListener(ActionEvent e) {

    }

}