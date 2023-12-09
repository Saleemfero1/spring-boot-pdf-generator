package com.gainwell.healthcare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "extraction_details", schema = "healthcare")
public class ExtractionDetails {
    @Id
    @Column(name = "client_key")
    private Long clientKey;
    @Column(name = "doc_id")
    private int docId;
    @Column(name = "case_key")
    private int caseKey;
    @Column(name = "doc_type_key")
    private int docTypeKey;
    @Column(name = "taxonomy_node_key")
    private int taxonomyNodeVey;
    @Column(name = "taxonomy_node_value")
    private String getTaxonomyNodeValue;
    @Column(name = "data_date")
    private String dataDate;
    @Column(name = "bounding_box")
    private String boundingBox;

    public Long getClientKey() {
        return clientKey;
    }

    public void setClientKey(Long clientKey) {
        this.clientKey = clientKey;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getCaseKey() {
        return caseKey;
    }

    public void setCaseKey(int caseKey) {
        this.caseKey = caseKey;
    }

    public int getDocTypeKey() {
        return docTypeKey;
    }

    public void setDocTypeKey(int docTypeKey) {
        this.docTypeKey = docTypeKey;
    }

    public int getTaxonomyNodeVey() {
        return taxonomyNodeVey;
    }

    public void setTaxonomyNodeVey(int taxonomyNodeVey) {
        this.taxonomyNodeVey = taxonomyNodeVey;
    }

    public String getGetTaxonomyNodeValue() {
        return getTaxonomyNodeValue;
    }

    public void setGetTaxonomyNodeValue(String getTaxonomyNodeValue) {
        this.getTaxonomyNodeValue = getTaxonomyNodeValue;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public String getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this.boundingBox = boundingBox;
    }


}
