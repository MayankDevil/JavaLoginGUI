/*
*   JavaLoginGUI
*   Developed by Mayank
*   Copyright by https://github.com/MayankDevil/
*   ./src/App.java
*/

class App extends javax.swing.JFrame implements java.awt.event.ActionListener
{
    private javax.swing.JPanel center_panel;
    
    private javax.swing.JLabel username_label, password_label, verified_label;
    
    private javax.swing.JTextField username_field;
    
    private javax.swing.JPasswordField password_field;
    
    private javax.swing.JButton login_button;
    
    private static java.util.HashMap<String,String> login_data  = new java.util.HashMap<String,String>();
    
    final String ldanger = "#f8d7da", danger = "#721c24", lsuccess = "#d4edda", success = "#155724";
    
    
    /*
        ---------------
        | constructor |
        ---------------
    */
    
    App(java.util.HashMap<String,String> admin_data)
    {
        login_data = admin_data;    // secure admin data
    
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        // if (this.isResizable()) this.setResizable(false);
        
        this.setBounds(50,50,500,500);
        
        this.setVisible(true);
        
        this.setTitle("https://github.com/MayankDevil/");
        
            center_panel = new javax.swing.JPanel();
            
            center_panel.setLayout(null);
            
            center_panel.setBackground(java.awt.Color.white);
            
                inputLayout();
                
                buttonLayout();
                
                verificationLayout();
            
            center_panel.add(username_label);
            
            center_panel.add(username_field);
            
            center_panel.add(password_label);
            
            center_panel.add(password_field);
        
            center_panel.add(login_button);
            
            center_panel.add(verified_label);
            
        this.add(center_panel);   
    }
    
    /*
        ------------------------------------------------------
        | inputLayout function : set input fields and labels |
        ------------------------------------------------------
    */
    
    void inputLayout()
    {
        username_label = new javax.swing.JLabel("Enter Username :");
                
        username_label.setBounds(100,20,300,30);               
        
        username_field = new javax.swing.JTextField();
        
        username_field.setBounds(100,60,300,30);
        
        password_label = new javax.swing.JLabel("Enter Password :");
        
        password_label.setBounds(100,110,300,30);
        
        password_field = new javax.swing.JPasswordField();
        
        password_field.setBounds(100,150,300,30);
    }
    
    /*
        ---------------------------------------------------------
        | buttonLayout function : set button and Event Listener |
        ---------------------------------------------------------
    */
    
    void buttonLayout()
    {
        login_button = new javax.swing.JButton("Login");
                
        login_button.setBounds(100,220,100,30);
        
        login_button.setFocusable(false);
        
        login_button.setForeground(java.awt.Color.decode("#ffffff"));
        
        login_button.setBackground(java.awt.Color.decode("#0069d9"));
        
        login_button.addActionListener(this);
    }
    
    /*
        -----------------------------------------------------------------------
        | myFont function : set Font get argument size and return font object |
        -----------------------------------------------------------------------
    */
    
    java.awt.Font myFont(int size)
    {
        return new java.awt.Font("Arial",20,size);
    }   
    
    /*
        -----------------------------------------------------------------
        | verificationLayout function : set verified label and property |
        -----------------------------------------------------------------
    */
    
    void verificationLayout()
    {
        verified_label = new javax.swing.JLabel();
                
        verified_label.setBounds(100,270,300,30);
        
        verified_label.setText("");
        
        verified_label.setBackground(java.awt.Color.decode("#ffffff"));
        
        verified_label.setOpaque(true);
    }
    
    /*
        =====================================
        | @override : actionListener method |
        =====================================
    */
    
    public void actionPerformed(java.awt.event.ActionEvent event)
    {
    
        if (event.getSource() == login_button)
        {
            String user = username_field.getText();
            
            String password = String.valueOf(password_field.getPassword());
            
            if (user.isEmpty() || password.isEmpty())
            {
                verified_label.setText("_Empty Field_");
                
                verified_label.setForeground(java.awt.Color.decode(danger));
                
                verified_label.setBackground(java.awt.Color.decode(ldanger));
            }
            else if (!(login_data.containsKey(user)))
            {
                verified_label.setText("Unvalid _Username_");
                
                verified_label.setForeground(java.awt.Color.decode(danger));
                
                verified_label.setBackground(java.awt.Color.decode(ldanger));
            }
            else if (login_data.get(user).equals(password))
            {
                verified_label.setText("SuccessFully Login");
                
                verified_label.setForeground(java.awt.Color.decode(success));
                
                verified_label.setBackground(java.awt.Color.decode(lsuccess));
                
                // this.dispose();
            }
            else
            {
                verified_label.setText("Unvalid _Password_");
                
                verified_label.setForeground(java.awt.Color.decode(danger));
                
                verified_label.setBackground(java.awt.Color.decode(ldanger));
            }      
        }
        System.out.println("_[ logined ]");
    }
    
    /*
        ================
        [ main execute ]
        ================
    */
    
    public static void main(String args[])
    {        
        Admin admin = new Admin(true);
        
        new App(admin.security());
    }
}
/* the end */
