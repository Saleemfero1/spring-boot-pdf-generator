package com.gainwell.healthcare.service;

import com.gainwell.healthcare.model.ClientDefinition;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PdfGenerationService {

    public void generatePdf(List<ClientDefinition> apiData, String outputPath) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 14);
                contentStream.beginText();
                contentStream.newLineAtOffset(20, 700);
                // Add constant content
                contentStream.showText("--------------Client Definitions----------------");
                contentStream.newLineAtOffset(0, -20); // Adjust the Y-coordinate to move to the next line
                contentStream.showText("ClientID            ClientLabel");
                contentStream.newLineAtOffset(0, -20); // Adjust the Y-coordinate to move to the next line
                contentStream.showText("--------------------------------------------------");
                for (ClientDefinition clientDefinition : apiData) {
                    contentStream.newLineAtOffset(0, -20);
                    contentStream.showText(clientDefinition.getClientKey() + "                " + clientDefinition.getClientLabel());
                }
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Thank You!");

                contentStream.endText();
            }

            document.save(outputPath);
        }
    }
}
