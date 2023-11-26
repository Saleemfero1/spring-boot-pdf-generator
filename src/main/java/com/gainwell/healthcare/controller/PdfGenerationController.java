package com.gainwell.healthcare.controller;

import com.gainwell.healthcare.model.ClientDefinition;
import com.gainwell.healthcare.service.ClientService;
import com.gainwell.healthcare.service.PdfGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("generate-pdf")
public class PdfGenerationController {
    @Autowired
    private PdfGenerationService pdfGenerationService;

    @Autowired
    private  ClientService clientService;

    @GetMapping
    public String generatePdf() {
        // Call your existing API to get data (replace this with your actual API call)
        List<ClientDefinition> clientDefinition = clientService.getAllClientDefinition();

        // Call the PDF generation service
        try {
            pdfGenerationService.generatePdf(clientDefinition, "output.pdf");
            return "PDF generated successfully.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to generate PDF.";
        }
    }

}
