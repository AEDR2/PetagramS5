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
import mx.aedr2.petagram3.presentador.IRecyclerViewFragmentPresenterMascota;
import mx.aedr2.petagram3.presentador.IRecyclerViewFragmentPresenterMiMascota;
import mx.aedr2.petagram3.presentador.RecyclerViewFragmentPresenterMascota;
import mx.aedr2.petagram3.presentador.RecyclerViewFragmentPresenterMiMascota;

public class RecyclerViewFragmentMiMascota extends Fragment implements IRecyclerViewFragmentViewMiMascota {
    private RecyclerView rvMiMascota;
    //Arreglo de mascotas
    //Mascota catus;
    //Datos de mi mascota
    //TextView tvMiMascota;
    //CircularImageView civFotoPerfil;
    private IRecyclerViewFragmentPresenterMiMascota presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mi_mascota, container, false);
        rvMiMascota = (RecyclerView) v.findViewById(R.id.rvMiMascota);
        presenter = new RecyclerViewFragmentPresenterMiMascota(this, getContext());
        //tvMiMascota = (TextView) v.findViewById(R.id.tvMiMascota);
        //civFotoPerfil = (CircularImageView) v.findViewById(R.id.civFotoPerfil);

        //catus = presenter.obtenerMiMascota(0);

        //Se llenan los datos de perfil de mi mascota
        //civFotoPerfil.setImageResource(catus.getImagen());
        //tvMiMascota.setText(catus.getNombre());
        return v;
    }



    @Override
    public void generarGridLayout() {
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        rvMiMascota.setLayoutManager(glm);
    }

    @Override
    public MiMascotaAdaptador crearAdaptador(MiMascotaP miMascotaP) {
        MiMascotaAdaptador adaptador = new MiMascotaAdaptador(miMascotaP, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MiMascotaAdaptador adaptador) {
        rvMiMascota.setAdapter(adaptador);
    }
}