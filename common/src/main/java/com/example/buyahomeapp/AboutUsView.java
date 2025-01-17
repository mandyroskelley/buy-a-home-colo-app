package com.example.buyahomeapp;

import com.codename1.components.ImageViewer;
import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

import java.io.IOException;

import static com.codename1.ui.CN.convertToPixels;
import static com.codename1.ui.util.Resources.getGlobalResources;

public class AboutUsView extends Form {

    public AboutUsView (Form mainForm) {
        super("About Us", new BorderLayout());




        // Create the About Text Area
        TextArea aboutText = new TextArea(
                "Welcome to Buy a Home Colorado!\n\n" +
                        "Meet our amazing team who is ready to help you find your perfect home in Colorado.\n\n" +
                        "Jerry Keily - Broker / Owner\n" +
                        "Mandy Roskelley - Broker Associate"
        );
        aboutText.setEditable(false);
        aboutText.setRows(5);
        aboutText.setColumns(30);

        // Style the About Text Area
        Style textStyle = aboutText.getAllStyles();
        textStyle.setBgColor(0xFFFFFF); // White background
        textStyle.setBgTransparency(200); // Semi-transparent background
        textStyle.setFgColor(0x000000); // Black text color
        textStyle.setAlignment(Component.CENTER); // Center the text
        textStyle.setPadding(5, 5, 5, 5); // Padding around the text

        // Add the Agent Images container and About Text to the form
        //this.addComponent(BorderLayout.NORTH, agent1Viewer); // Add agent images at the top
        this.addComponent(BorderLayout.CENTER, aboutText); // Add the about text in the center


        // Add the bottom navigation bar to this page
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));

        // Optionally, style the form
        this.getStyle().setBgColor(0xFFFFFF); // Background color for the form
        this.getStyle().setBgTransparency(255); // Make the background fully opaque
    }

}
