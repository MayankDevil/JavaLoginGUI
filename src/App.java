/*
    JavaLoginGUI
    Developed by MayankDevil
*/

class App extends java.awt.Frame implements java.awt.event.ActionListener
{
	static java.awt.Panel center_Panel, north_Panel, south_Panel, west_Panel, east_Panel;

	static java.awt.TextField username_field, password_field;

	static java.awt.Button login_button;

	static java.awt.Label heading_label, title_label, subtitle_label, copyright_label;

    static java.awt.BorderLayout layout;

	/*
	    ===============
	    | constructor |
	    ===============
	*/

    App()
    {
        this.setBounds(50,50,500,500);
        
        layout = new java.awt.BorderLayout(0,0);

		/* north Panel */

        north_Panel = new java.awt.Panel();
        
        north_Panel.setBackground(java.awt.Color.gray);
        
        north_Panel.setPreferredSize(new java.awt.Dimension(100,100));

        north_Panel.setLayout(null);

        	/* heading */

        	/* center Panel */

        	heading_label = new java.awt.Label();

        	heading_label.setText(" Programmer : https://github.com/MayankDevil/ ");

        	heading_label.setFont(Frame.myFont(16));

        	heading_label.setBounds(100,0,1000,100);

        // north_Panal.addLayoutComponent(layout.center, heading_label);

        north_Panel.add(heading_label, java.awt.BorderLayout.CENTER);
        
        /* south Panel */

        south_Panel = new java.awt.Panel();
        
        south_Panel.setBackground(java.awt.Color.gray);
        
        south_Panel.setPreferredSize(new java.awt.Dimension(100,200));

        south_Panel.setLayout(null);

        	/* heading */

        	/* center Panel */

        	copyright_label = new java.awt.Label();

        	copyright_label.setText("Designed | Developed by Mayank");

        	copyright_label.setFont(Frame.myFont(20));

        	copyright_label.setBounds(100,50,1000,100);

        // north_Panal.addLayoutComponent(layout.center, heading_label);

        south_Panel.add(copyright_label, java.awt.BorderLayout.SOUTH);

        /* center Panel */

        center_Panel = new java.awt.Panel();

        center_Panel.setLayout(null);

        	/* title label */

        	title_label = new java.awt.Label();

        	title_label.setText(" Login Form ");

        	title_label.setFont(Frame.myFont(20));
        	title_label.setBounds(100,50,300,50);

        	/* subtitle label */

        	subtitle_label = new java.awt.Label();

        	subtitle_label.setText(" on login button click exit ");

        	subtitle_label.setFont(Frame.myFont(16));
        	subtitle_label.setBounds(100,110,300,50);

        	/* username field */

			username_field = new java.awt.TextField();

			username_field.setBounds(100,200,300,50);

			/* password field */

			password_field = new java.awt.TextField();

			password_field.setBounds(100,270,300,50);

			/* login button */

			login_button = new java.awt.Button();

			login_button.setLabel("Login");

			login_button.setBounds(100,350,100,50);

			login_button.addActionListener(this);


		center_Panel.add(title_label);

		center_Panel.add(subtitle_label);

		center_Panel.add(username_field);

		center_Panel.add(password_field);

		center_Panel.add(login_button);


		/* add panels in frame */

		this.add(north_Panel, java.awt.BorderLayout.NORTH);

        this.add(center_Panel, java.awt.BorderLayout.CENTER);
    }

    /*
        ------------------------------------------------------------------------
        } myFont function static : return Font & argument size
        ------------------------------------------------------------------------
    */

    static java.awt.Font myFont(int size)
    {
		return new java.awt.Font("Arial", size, size);
    }
    
    /*
        [ @override ]----------------------------------------------------------
    */

    public void actionPerformed(java.awt.event.ActionEvent event)
    {
    	System.out.println(" todo logined code ");

        if (event.getSource() == login_button)
        {
            System.out.println("username is "+username_field.getText()+" and password is "+password_field.getText());
        }

		// System.exit(0);
    }
    
    /*
        ----------------
        [ main funtion ]
        ----------------
    */
    
    public static void main(String[] args)
    {
        System.out.println("execute");

        new App().setVisible(true);
    }
}
// the end
