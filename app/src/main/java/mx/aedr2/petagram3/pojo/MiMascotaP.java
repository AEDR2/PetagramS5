package mx.aedr2.petagram3.pojo;

import java.util.ArrayList;

/**
 * Created by alejandraperez on 16/09/17.
 */

public class MiMascotaP {
    private Mascota miMascota;
    private ArrayList<ArrayList<Integer>> fotos;
    private int fotoPerfil;

    public MiMascotaP(Mascota miMascota, int fotoPerfil) {
        this.miMascota = miMascota;
        this.fotoPerfil = fotoPerfil;
        fotos = new ArrayList<ArrayList<Integer>>();
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
