package mx.aedr2.petagram3.fragmento;

import java.util.ArrayList;

import mx.aedr2.petagram3.adaptador.MascotaAdaptador;
import mx.aedr2.petagram3.adaptador.MiMascotaAdaptador;
import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

/**
 * Created by alejandraperez on 28/10/17.
 */

public interface IRecyclerViewFragmentViewMiMascota {
    public void generarGridLayout();
    public MiMascotaAdaptador crearAdaptador(MiMascotaP miMascotaP);
    public void inicializarAdaptadorRV(MiMascotaAdaptador adaptador);
}
