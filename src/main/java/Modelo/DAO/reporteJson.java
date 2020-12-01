package Modelo.DAO;

import Modelo.MateriasPrimas;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;

public class reporteJson {

    private static final String directorio = "C:\\\\Users\\\\Flor\\\\IdeaProjects\\\\GUIA14\\\\src\\\\resources\\\\";

    public static void generarJson(int idPed, MateriasPrimas matPrim, int cantReq, String depositos) {

        try {

            File aJson = new File(directorio + "reporte.json");
            FileOutputStream fsOutJson = new FileOutputStream(aJson);
            JsonGenerator genJson = Json.createGenerator(fsOutJson);

            genJson.writeStartObject(); //objeto inicial
            genJson.writeStartArray("Formulario de pedido");

            genJson.writeStartObject(); //objeto inicial
            genJson.write("ID PEDIDO", idPed);
            genJson.write("NOMBRE MATERIA PRIMA", matPrim.getNombreMateriaPrima());
            genJson.write("CODIGO MATERIA PRIMA", matPrim.getCodigoMateriaPrima());
            genJson.write("CANTIDAD REQUERIDA", cantReq);
            genJson.write("DEPOSITOS", depositos);
            genJson.writeEnd();

            genJson.writeEnd();
            genJson.writeEnd();
            genJson.close();

        } catch (InputMismatchException | IOException e) {
            e.printStackTrace();
        }
    }
}
