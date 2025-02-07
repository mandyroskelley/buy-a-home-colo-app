package com.example.buyahomeapp;

import com.codename1.components.SpanLabel;
import com.codename1.messaging.Message;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.FlowLayout;

public class ContactUsView extends Form {

    public ContactUsView(Form mainForm) {
        super("Contact Us", new BorderLayout());

        // Header Text
        SpanLabel headerLabel = new SpanLabel("Questions? Comments? We'd love to hear from you!");

        // Use FlowLayout to center the formContainer vertically
        Container centeredForm = new Container(new FlowLayout(Component.CENTER, Component.CENTER));


        // Create form layout with centered alignment
        Container formContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        formContainer.getAllStyles().setBgColor(0xFFFFFF);
        formContainer.getAllStyles().setBgTransparency(200);
        formContainer.getAllStyles().setAlignment(Component.CENTER);
        formContainer.getAllStyles().setPadding(10, 10, 10, 10);
        formContainer.getAllStyles().setMargin(200, 300, 10, 10);

        TextField nameField = new TextField("", "Name", 20, TextField.ANY);
        TextField phoneField = new TextField("", "Phone Number", 20, TextField.PHONENUMBER);
        TextField emailField = new TextField("", "Email", 20, TextField.EMAILADDR);
        TextArea messageField = new TextArea("", 5, 20);
        messageField.setHint("Your Message");

        Button submitButton = new Button("Submit");

        submitButton.addActionListener(evt -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            String message = messageField.getText();

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || message.isEmpty()) {
                Dialog.show("Error", "Please fill in all fields.", "OK", null);
            } else {
                sendEmail(name, phone, email, message);
            }
        });

        formContainer.addAll(headerLabel, nameField, phoneField, emailField, messageField, submitButton);
        centeredForm.add(formContainer);

        Container centerContainer = new Container(new BorderLayout());
        centerContainer.add(BorderLayout.CENTER, centeredForm);

        this.add(BorderLayout.CENTER, centerContainer);
        this.add(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }

    private void sendEmail(String name, String phone, String email, String message) {
        String subject = "New Contact Request from " + name;
        String body = "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email + "\nMessage: " + message;

        Message msg = new Message(body);
        Display.getInstance().sendMessage(new String[]{"jerrykeily@hotmail.com"}, subject, msg);

        Dialog.show("Success", "Your message has been sent!", "OK", null);
    }
}