package mx.aedr2.petagram3.db;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.pojo.Mascota;

/**
 * Created by alejandraperez on 27/10/17.
 */

public class ConstructorMejoresMascotas {
    private Context context;
    public ConstructorMejoresMascotas(Context context){this.context = context;}

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos bd = new BaseDatos(context);
        return bd.devuelveMejoresMascotas();
    }
}
