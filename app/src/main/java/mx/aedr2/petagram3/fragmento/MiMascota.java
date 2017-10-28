package mx.aedr2.petagram3.fragmento;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.adaptador.MiMascotaAdaptador;
import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

public class MiMascota extends Fragment {
    private RecyclerView rvMiMascota;
    //Arreglo de mascotas
    MiMascotaP catus;
    //Datos de mi mascota
    TextView tvMiMascota;
    CircularImageView civFotoPerfil;

    public MiMascota() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mi_mascota, container, false);
        tvMiMascota = (TextView) v.findViewById(R.id.tvMiMascota);
        civFotoPerfil = (CircularImageView) v.findViewById(R.id.civFotoPerfil);

        rvMiMascota = (RecyclerView) v.findViewById(R.id.rvMiMascota);
        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        rvMiMascota.setLayoutManager(glm);

        inicializarMascota();
        inicializarAdaptador();
        //Se llenan los datos de perfil de mi mascota
        civFotoPerfil.setImageResource(catus.getFotoPerfil());
        tvMiMascota.setText(catus.getMiMascota().getNombre());
        return v;
    }

    private void inicializarAdaptador() {
        MiMascotaAdaptador adaptador = new MiMascotaAdaptador(catus.getFotos(), getActivity());
        rvMiMascota.setAdapter(adaptador);
    }

    private void inicializarMascota() {
        catus = new MiMascotaP(new Mascota(R.drawable.cat_hungry, "Catus", 10), R.drawable.cat_food);
        //Se va a añadir las fotos de catus
        catus.anadirFoto(R.drawable.cat_food, 20);
        catus.anadirFoto(R.drawable.cat_cage, 10);
        catus.anadirFoto(R.drawable.cat_drink, 20);
        catus.anadirFoto(R.drawable.cat_pirate, 20);
        catus.anadirFoto(R.drawable.cat_fat, 20);
        catus.anadirFoto(R.drawable.cat_walk, 20);
        catus.anadirFoto(R.drawable.shadow_lady, 20);
        catus.anadirFoto(R.drawable.shadow_lion, 20);
        catus.anadirFoto(R.drawable.shadow_whale, 20);
        catus.anadirFoto(R.drawable.shadow_fly, 20);
        catus.anadirFoto(R.drawable.cat_smoke, 20);
        catus.anadirFoto(R.drawable.cat_slippers, 20);
        catus.anadirFoto(R.drawable.cat_sing, 20);
        catus.anadirFoto(R.drawable.shadow_ball, 20);
        catus.anadirFoto(R.drawable.shadow_cat, 20);
    }
}