/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.model.certification.enuns;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 * @author G0041775
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CertificationBlockName {

    CADASTRO("Cadastro"),
    CONECTIVIDADE("Conectividade"),
    SERVICOS("Serviços"),
    PERFORMANCE("Performance");

    private final String beautyName;

    private CertificationBlockName(String beautyName) {
        this.beautyName = beautyName;
    }

    public String getBeautyName() {
        return beautyName;
    }

//    public String getName() {
//        return this.name();
//    }

    @JsonCreator
    public static CertificationBlockName fromNode(JsonNode node) {
        if (!node.has("name")) {
            return null;
        }

        String name = node.get("name").asText();

        return CertificationBlockName.valueOf(name);
    }

    // 3
    @JsonProperty
    public String getName() {
        return name();
    }

}
