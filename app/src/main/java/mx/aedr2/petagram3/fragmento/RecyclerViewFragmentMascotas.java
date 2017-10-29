package mx.aedr2.petagram3.fragmento;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;

import mx.aedr2.petagram3.MejoresMascotas;
import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.adaptador.MascotaAdaptador;
import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.presentador.IRecyclerViewFragmentPresenterMascota;
import mx.aedr2.petagram3.presentador.RecyclerViewFragmentPresenterMascota;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragmentMascotas extends Fragment implements IRecyclerViewFragmentViewMascotas {
    private RecyclerView rvMascotas;
    //Arreglo de mascotas
    ArrayList<Mascota> mascotas;
    ArrayList<Mascota> mejoresMascotas;
    private IRecyclerViewFragmentPresenterMascota presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenterMascota(this, getContext());
        return v;
    }

    @Override
    public void generarLinearlayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //GridLayoutManager glm = new GridLayoutManager(this, 2);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter(adaptador);
    }
}
