package mx.aedr2.petagram3.fragmento;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;

import mx.aedr2.petagram3.MainActivity;
import mx.aedr2.petagram3.MejoresMascotas;
import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.adaptador.MascotaAdaptador;
import mx.aedr2.petagram3.pojo.Contacto;
import mx.aedr2.petagram3.pojo.Mascota;

/**
 * A simple {@link Fragment} subclass.
 */
public class Mascotas extends Fragment {
    private RecyclerView rvMascotas;
    //Arreglo de mascotas
    ArrayList<Mascota> mascotas;
    ArrayList<Mascota> mejoresMascotas;

    public Mascotas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        rvMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.cat_food, "Catus", 290));
        mascotas.add(new Mascota(R.drawable.cat_acrobat, "Esnut", 17));
        mascotas.add(new Mascota(R.drawable.cat_ball, "Rito", 20));
        mascotas.add(new Mascota(R.drawable.cat_banjo, "Matesito", 21));
        mascotas.add(new Mascota(R.drawable.cat_bat, "Natacha", 22));
        mascotas.add(new Mascota(R.drawable.cat_bd, "Bold", 32));
        mascotas.add(new Mascota(R.drawable.cat_birdhouse, "Volkova", 1));
        mascotas.add(new Mascota(R.drawable.cat_box, "Morado", 9));
        mascotas.add(new Mascota(R.drawable.cat_cart, "Boris", 8));
        mascotas.add(new Mascota(R.drawable.cat_clean, "Kirby", 7));
        mascotas.add(new Mascota(R.drawable.cat_cupid, "Pepinut", 10));
        mascotas.add(new Mascota(R.drawable.cat_drunk, "Tomper", 10));
        mascotas.add(new Mascota(R.drawable.cat_eyes, "Gato", 15));
        mascotas.add(new Mascota(R.drawable.cat_fight, "Pumpkin", 11));
        mascotas.add(new Mascota(R.drawable.cat_fish, "Gordolobo", 21));
        mascotas.add(new Mascota(R.drawable.cat_fisht, "Parche", 62));
        mascotas.add(new Mascota(R.drawable.cat_fridge, "Sammy Davis Junior", 20));
        mascotas.add(new Mascota(R.drawable.cat_ghost, "Lola", 11));
        mascotas.add(new Mascota(R.drawable.cat_gift, "Alfalfa", 9));
        mascotas.add(new Mascota(R.drawable.cat_hiss, "Tofo", 10));
        mascotas.add(new Mascota(R.drawable.cat_lady, "Copernico", 10));
        mascotas.add(new Mascota(R.drawable.cat_laptop, "Mimo", 15));
        mascotas.add(new Mascota(R.drawable.cat_laptop_2, "Principe George", 15));
        mascotas.add(new Mascota(R.drawable.cat_makeup, "Mustafá", 13));
        mascotas.add(new Mascota(R.drawable.cat_mask, "Simeón", 11));
        mascotas.add(new Mascota(R.drawable.cat_moustache, "Tigroso", 11));
        mascotas.add(new Mascota(R.drawable.cat_mummy, "Kitty", 5));
        mascotas.add(new Mascota(R.drawable.cat_paper, "Patas", 51));
        mascotas.add(new Mascota(R.drawable.cat_phone, "Ringo", 21));
        mascotas.add(new Mascota(R.drawable.cat_plain, "Bigotes", 24));
        mascotas.add(new Mascota(R.drawable.cat_poo, "Orejas", 19));
        mascotas.add(new Mascota(R.drawable.cat_pumpkin, "Vatoloco", 19));
        mascotas.add(new Mascota(R.drawable.cat_purr, "Redondo", 18));
        mascotas.add(new Mascota(R.drawable.cat_radio, "Coco", 10));
        mascotas.add(new Mascota(R.drawable.cat_rascal, "Chocolate", 40));
        mascotas.add(new Mascota(R.drawable.cat_skull, "Pelos", 32));
        mascotas.add(new Mascota(R.drawable.cat_sleep, "Bigoton", 78));
        mascotas.add(new Mascota(R.drawable.cat_sulky, "Tigra", 23));
        mascotas.add(new Mascota(R.drawable.cat_tied, "Cacto", 15));
        mascotas.add(new Mascota(R.drawable.cat_toilet, "Copo", 13));
        mascotas.add(new Mascota(R.drawable.cat_torture, "Dante", 67));
        mascotas.add(new Mascota(R.drawable.cat_vampire, "Mambo", 28));
        mascotas.add(new Mascota(R.drawable.cat_vote, "Neron", 26));
        mascotas.add(new Mascota(R.drawable.cat_upsidedown, "Billyboy", 14));
        mascotas.add(new Mascota(R.drawable.cat_wizard, "Cletus", 13));
        Collections.sort(mascotas);
    }

    //Metodo que obtiene los gatos con ranking mas alto
    public void obtenerMejoresGatos(){
        mejoresMascotas = new ArrayList<>();
        //Se ordena el array de mascotas por ranking
        for (Mascota gato: mascotas) gato.setOrdenar(false);
        Collections.sort(mascotas);
    }

    //metodo para ir al ranking de mascotas
    public void irRankinGatos(){
        //Se obtienen los gatos primeros
        obtenerMejoresGatos();
        //Se van a enviar mediante un Intent
        Intent i = new Intent(getActivity(), MejoresMascotas.class);

        for(int j = 0; j < 5; j++) {
            i.putExtra("imagen" + j, mascotas.get(j).getImagen());
            i.putExtra("nombre" + j, mascotas.get(j).getNombre());
            i.putExtra("ranking" + j, mascotas.get(j).getRanking());
        }
        startActivity(i);
    }


}
