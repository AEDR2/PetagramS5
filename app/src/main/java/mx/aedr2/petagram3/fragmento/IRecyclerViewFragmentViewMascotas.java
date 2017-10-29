package mx.aedr2.petagram3.fragmento;

import java.util.ArrayList;

import mx.aedr2.petagram3.adaptador.MascotaAdaptador;
import mx.aedr2.petagram3.pojo.Mascota;

/**
 * Created by alejandraperez on 28/10/17.
 */

public interface IRecyclerViewFragmentViewMascotas {
    public void generarLinearlayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
