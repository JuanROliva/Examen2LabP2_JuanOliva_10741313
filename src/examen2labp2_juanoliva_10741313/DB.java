package examen2labp2_juanoliva_10741313;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DB {
    
    private File archivo = new File("./BaseDatos.bina");
    private ArrayList<Cientifico> listaCientificos = new ArrayList<>();

    public DB() {}

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Cientifico> getListaCientificos() {
        return listaCientificos;
    }

    public void setListaCientificos(ArrayList<Cientifico> al) {
        this.listaCientificos = al;
    }
    
    public void cargarArchivo(){
        try {
            if (!archivo.exists()) {
                return;
            }
            listaCientificos = new ArrayList<>();
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaCientificos = (ArrayList<Cientifico>)ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error en lectura");
        }
    }
    
    public void guardarArchivo(ArrayList<Cientifico> a){
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error en escritura");
        }
    }
}
