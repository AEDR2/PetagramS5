package mx.aedr2.petagram3.pojo;

import java.util.ArrayList;

/**
 * Created by alejandraperez on 16/09/17.
 */

public class MiMascotaP {
    private Mascota miMascota;
    private ArrayList<ArrayList<Integer>> fotos;
    private int fotoPerfil;
    private int id_mascota = 0;
    private int id = 0;

    public MiMascotaP(Mascota miMascota) {
        this.miMascota = miMascota;
        this.fotoPerfil = miMascota.getImagen();
        this.id_mascota = miMascota.getId();
        fotos = new ArrayList<ArrayList<Integer>>();
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MiMascotaP() {
    }


    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Mascota getMiMascota() {
        return miMascota;
    }

    public void setMiMascota(Mascota miMascota) {
        this.miMascota = miMascota;
    }

    public ArrayList getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList fotos) {
        this.fotos = fotos;
    }

    public void anadirFoto(int foto, int ranking){
        ArrayList<Integer> aux = new ArrayList<Integer>();
        aux.add(foto);//
        aux.add(ranking);
        fotos.add(aux);
    }
}
