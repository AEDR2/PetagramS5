package mx.aedr2.petagram3.presentador;

import mx.aedr2.petagram3.pojo.Mascota;

/**
 * Created by alejandraperez on 28/10/17.
 */

public interface IRecyclerViewFragmentPresenterMiMascota {
    public void obtenerMiMascotaBaseDatos();
    public void mostrarMiMascotaRV();
    public Mascota obtenerMiMascota(int idMascota);
}
