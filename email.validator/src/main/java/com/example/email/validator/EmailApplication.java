package com.example.email.validator;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.v7.ui.TextField;



public class EmailApplication extends UI {
	
	protected void init(VaadinRequest request){
		 VerticalLayout content = new VerticalLayout();
		 setContent(content);
		 
		 content.addComponent(new Label("Please enter your email: "));
		 
		 TextField filter = new TextField();
		 
	}

	private void setContent(VerticalLayout content) {
		// TODO Auto-generated method stub
		
	}

}
