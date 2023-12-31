/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Customer;

/**
 *
 * @author owner
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private final Customer newCustomer;
    public ViewPanel(Customer newCustomer) {
        initComponents();
        this.newCustomer = newCustomer;
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        ageTextField2 = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        notMentionedRadio = new javax.swing.JRadioButton();
        typeDropdown = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        uploadImageButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(700, 600));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 102, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("CUSTOMER INFORMATION");

        nameLabel.setText("FIRST NAME:");

        ageLabel.setText("AGE:");

        genderLabel.setText("GENDER:");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });

        buttonGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("MALE USER");

        buttonGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("FEMALE USER");

        notMentionedRadio.setText("Prefer not to say");
        notMentionedRadio.setActionCommand("NOT SPECIFIED");
        notMentionedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notMentionedRadioActionPerformed(evt);
            }
        });

        typeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Guest " }));
        typeDropdown.setSelectedIndex(-1);
        typeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDropdownActionPerformed(evt);
            }
        });

        typeLabel.setText("TYPE:");

        lastNameLabel.setText("LAST NAME:");

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("EMAIL:");

        messageLabel.setText("MESSAGE: ");

        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        uploadImageButton.setText("UPLOAD IMAGE");
        uploadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(imageLabel)
                        .addContainerGap(219, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(ageTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maleRadio)
                                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uploadImageButton)
                                            .addComponent(messageLabel)))
                                    .addComponent(femaleRadio)
                                    .addComponent(notMentionedRadio))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel))
                        .addGap(44, 44, 44)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(ageTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel))
                                .addGap(42, 42, 42)
                                .addComponent(ageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genderLabel)
                                    .addComponent(maleRadio))))
                        .addComponent(imageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleRadio))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(uploadImageButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notMentionedRadio)
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typeLabel)
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void notMentionedRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notMentionedRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notMentionedRadioActionPerformed

    private void typeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDropdownActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void uploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif", "bmp"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(fileChooser.getSelectedFile());

                int width = 60;
                int height = 80;
                Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                if (scaledImage != null) {
                    ImageIcon icon = new ImageIcon(scaledImage);

                    imageLabel.setIcon(icon);
                } else {
                    throw new Exception("Failed to load the image.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Failed to load the image.", "Image Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_uploadImageButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField2;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton notMentionedRadio;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeDropdown;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton uploadImageButton;
    // End of variables declaration//GEN-END:variables

    private void setRadioButtonSelection(String selectedRadioButton) {
    if (selectedRadioButton != null) {
        switch (selectedRadioButton) {
            case "MALE USER":
                maleRadio.setSelected(true);
                break;
            case "FEMALE USER":
                femaleRadio.setSelected(true);
                break;
            case "NOT SPECIFIED":
                notMentionedRadio.setSelected(true);
                break;
            default:
                break;
        }
    }
}

private void setTypeButtonSelection(String selectedType) {
    typeDropdown.setSelectedItem(selectedType);
}

    private void populateData() {
    firstNameTextField.setText(this.newCustomer.getFirst());
    lastNameTextField.setText(this.newCustomer.getLast());
    ageTextField2.setText(this.newCustomer.getAge());
    emailTextField.setText(this.newCustomer.getEmail());
    messageTextField.setText(this.newCustomer.getMessage());
    setRadioButtonSelection(this.newCustomer.getGender());
    setTypeButtonSelection(this.newCustomer.getType());
    imageLabel.setIcon(this.newCustomer.getIcon());
}
}
