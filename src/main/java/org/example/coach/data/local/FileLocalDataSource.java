package org.example.coach.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.company.domain.Company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

public class FileLocalDataSource {

    private static final String NAME_FILE = "Purchase.txt";
    private static final Gson gson = new Gson();
    private static final Type type = new TypeToken<Company>() {}.getType();

    public static void save(Company company) {
        try (FileWriter myWriter = new FileWriter(NAME_FILE)) {
            myWriter.write(gson.toJson(company));
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            throw new RuntimeException("Ha ocurrido un error al guardar la información.", e);
        }
    }

    public static Company obtain() {
        try (Scanner myReader = new Scanner(new File(NAME_FILE))) {
            if (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return gson.fromJson(data, type);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Ha ocurrido un error al obtener el listado.", e);
        }
        return null;
    }

    public void clear() {
        try (FileWriter myWriter = new FileWriter(NAME_FILE)) {
            myWriter.write(" Fichero3");
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            throw new RuntimeException("Ha ocurrido un error al guardar la información.", e);
        }
    }
}
