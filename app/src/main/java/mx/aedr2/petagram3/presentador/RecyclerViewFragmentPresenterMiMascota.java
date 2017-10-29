package mx.aedr2.petagram3.presentador;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.db.ConstructorMascotas;
import mx.aedr2.petagram3.db.ConstructorMiMascota;
import mx.aedr2.petagram3.fragmento.IRecyclerViewFragmentViewMascotas;
import mx.aedr2.petagram3.fragmento.IRecyclerViewFragmentViewMiMascota;
import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

/**
 * Created by alejandraperez on 28/10/17.
 */

public class RecyclerViewFragmentPresenterMiMascota implements IRecyclerViewFragmentPresenterMiMascota {
    private IRecyclerViewFragmentViewMiMascota iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMiMascota constructorMiMascota;
    private MiMascotaP miMascotaP;
    private Mascota mascota;


    public RecyclerViewFragmentPresenterMiMascota(IRecyclerViewFragmentViewMiMascota iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMiMascotaBaseDatos();
    }

    @Override
    public Mascota obtenerMiMascota(int idMascota) {
        return constructorMiMascota.obtenerMiMascota(idMascota);
    }

    @Override
    public void obtenerMiMascotaBaseDatos() {
        constructorMiMascota = new ConstructorMiMascota(context);
        miMascotaP = constructorMiMascota.obtenerFotosMiMascota();
        mostrarMiMascotaRV();
    }

    @Override
    public void mostrarMiMascotaRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(miMascotaP));
        iRecyclerViewFragmentView.generarGridLayout();
    }
}
