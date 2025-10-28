package es.cifpcarlos3.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
@JsonRootName("Coches nuevos")
public class Coches {
    @JsonProperty(value = "Marca: ")
    private String marca;
    private String modelo;
    private String color;
    private int anio;

}
