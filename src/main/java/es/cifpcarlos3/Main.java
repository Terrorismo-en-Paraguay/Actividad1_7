package es.cifpcarlos3;

import es.cifpcarlos3.vo.Coches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ruta = Paths.get("canciones.txt").toFile();
        Coches coches;
        List<Coches> coche = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ruta, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] partes = line.split(",");
                coches = new Coches(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]));
                coche.add(coches);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}