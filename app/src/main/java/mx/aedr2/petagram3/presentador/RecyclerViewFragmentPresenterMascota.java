package mx.aedr2.petagram3.presentador;

import android.content.Context;

import java.util.ArrayList;

import mx.aedr2.petagram3.db.ConstructorMascotas;
import mx.aedr2.petagram3.fragmento.IRecyclerViewFragmentViewMascotas;
import mx.aedr2.petagram3.pojo.Mascota;

/**
 * Created by alejandraperez on 28/10/17.
 */

public class RecyclerViewFragmentPresenterMascota implements IRecyclerViewFragmentPresenterMascota {
    private IRecyclerViewFragmentViewMascotas iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;


    public RecyclerViewFragmentPresenterMascota(IRecyclerViewFragmentViewMascotas iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotaBaseDatos();
    }

    @Override
    public void obtenerMascotaBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearlayoutVertical();
    }
}
