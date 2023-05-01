package Interfaces;

import Model.Toy;

import java.io.FileWriter;
import java.io.IOException;

public interface GetToyInFile {
    default void write(Toy toy) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/src/Prizes/Prize.txt");
        FileWriter writer = new FileWriter(pathFile);
        if(toy==null) return;
        writer.write(toy.getName());
        writer.flush();
    }
}
