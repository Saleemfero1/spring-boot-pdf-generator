package com.gainwell.healthcare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "client_definition", schema = "healthcare")
public class ClientDefinition {
    @Id
    @Column(name = "client_key")
    private Long clientKey;
    @Column(name = "client_label")
    private String clientLabel;

    public Long getClientKey() {
        return clientKey;
    }

    public String getClientLabel() {
        return clientLabel;
    }
}
