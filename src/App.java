
class App extends javax.swing.JFrame implements java.awt.event.ActionListener
{
    private javax.swing.JPanel center_panel;
    
    private javax.swing.JLabel username_label, password_label, verified_label;
    
    private javax.swing.JTextField username_field;
    
    private javax.swing.JPasswordField password_field;
    
    private javax.swing.JButton login_button;
    
    private static java.util.HashMap<String,String> login_data  = new java.util.HashMap<String,String>();
    
    final String ldanger = "#FF9898", danger = "#FF4545", lsuccess = "#C4FF8C", success = "#4E9A06";
    
    
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
                
                
                verified_label = new javax.swing.JLabel();
                
                verified_label.setBounds(50,270,200,30);
                
            
            center_panel.add(username_label);
            
            center_panel.add(username_field);
            
            center_panel.add(password_label);
            
            center_panel.add(password_field);
        
            center_panel.add(login_button);
            
            center_panel.add(verified_label);
            
        this.add(center_panel);   
    }
    
    void setAlertStyle()
    {
        verified_label.setForeground(java.awt.Color.decode(danger));
                
        verified_label.setBackground(java.awt.Color.decode(ldanger));
        
        verified_label.setOpaque(true);
    }
    
    void inputLayout()
    {
        username_label = new javax.swing.JLabel("Enter Username :");
                
        username_label.setBounds(50,20,200,30);               
        
        username_field = new javax.swing.JTextField();
        
        username_field.setBounds(50,60,200,30);
        
        password_label = new javax.swing.JLabel("Enter Password :");
        
        password_label.setBounds(50,110,200,30);
        
        password_field = new javax.swing.JPasswordField();
        
        password_field.setBounds(50,150,200,30);
    }
    
    void buttonLayout()
    {
        login_button = new javax.swing.JButton("Login");
                
        login_button.setBounds(50,220,100,30);
        
        login_button.setFocusable(false);
        
        login_button.setBackground(java.awt.Color.white);
        
        login_button.addActionListener(this);
    }
    
    
    /* @override : actionListener method */
    
    public void actionPerformed(java.awt.event.ActionEvent event)
    {
    
        if (event.getSource() == login_button)
        {
            String user = username_field.getText();
            
            String password = String.valueOf(password_field.getPassword());
            
            System.out.println(" username is "+user);
            
            verified_label.setText("");
            
            if (user == "")
            {
                verified_label.setText("Empty _Username_");
                
                setAlertStyle();
            }
            else
            {
                if (password == "")
                {
                    verified_label.setText("Empty _Password_");
                    
                    setAlertStyle();
                }
                else
                {
                    if (login_data.containsKey(user))
                    {
                        if (login_data.get(user).equals(password))
                        {
                            verified_label.setText("SuccessFully Login");
                            
                            // this.dispose();
                        }
                        else
                        {
                            verified_label.setText("Unvalid _Password_");
                        }
                    }
                    else
                    {
                        verified_label.setText("Unvalid _Username_");
                    }
                }
            }            
        }
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
