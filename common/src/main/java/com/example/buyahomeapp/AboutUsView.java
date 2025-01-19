package com.example.buyahomeapp;

import com.codename1.components.ImageViewer;
import com.codename1.components.SpanLabel;
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

    public AboutUsView(Form mainForm) {
        // Use BorderLayout for the root form
        super(new BorderLayout());
        setTitle("About Us");


        // Container for main content with white, opaque background
        Container content = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        content.getAllStyles().setBgColor(0xFFFFFF); // White background
        content.getAllStyles().setBgTransparency(200); // Opaque background
       // content.getAllStyles().setMargin(10, 10, 10, 10); // Add margins
        content.getAllStyles().setPadding(15, 15, 15, 15); // Add padding
        content.getAllStyles().setAlignment(Component.CENTER);
        content.setScrollableY(true);

        // Add Jerry's picture and bio
        content.add(createBioSection("/jerry.png", "Jerry Keily", "Broker / Owner", "Jerry is a seasoned real estate agent with 20+ years of experience in the industry. He loves helping clients find their dream homes."));

        // Add Mandy's picture and bio
        content.add(createBioSection("/mandy.png", "Mandy Roskelley", "Broker Associate", "With 10+ years of experience as a licensed real estate agent, Mandy specializes in helping clients navigate the real estate market with confidence."));

        // Add main content to the center of the form
        this.add(BorderLayout.CENTER, content);

        // Add the BottomNavBar to the SOUTH
        this.add(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }

    private Container createBioSection(String imagePath, String name, String title, String bio) {
        // Create a container for the bio section
        Container bioContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        bioContainer.getAllStyles().setAlignment(Component.CENTER);

        // Load the image
        Image personImage = null;
        try {
            personImage = Image.createImage(imagePath);
            personImage = personImage.scaledWidth(Display.getInstance().getDisplayWidth() / 3); // Scale image
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add image
        Label imageLabel = personImage != null ? new Label(personImage) : new Label("Image not found");
        imageLabel.getAllStyles().setAlignment(Component.CENTER);
        // Add name
        Label nameLabel = new Label(name);
        nameLabel.getAllStyles().setAlignment(Component.CENTER);
        nameLabel.getAllStyles().setFgColor(0x000000); // Black text
        nameLabel.getAllStyles().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM));

        // Add title
        Label titleLabel = new Label(title);
        titleLabel.getAllStyles().setAlignment(Component.CENTER);
        titleLabel.getAllStyles().setFgColor(0x000000); // Black text
        titleLabel.getAllStyles().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_SMALL));
        // Add bio text
        SpanLabel bioLabel = new SpanLabel(bio);
        bioLabel.getAllStyles().setAlignment(Component.CENTER);
        bioLabel.getAllStyles().setFgColor(0x444444); // Dark gray text

        // Add components to the bio container
        bioContainer.addAll(imageLabel, nameLabel, titleLabel, bioLabel);

        return bioContainer;
    }
}