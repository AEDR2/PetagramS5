package mx.aedr2.petagram3.db;

/**
 * Created by alejandraperez on 27/10/17.
 */

public final class ConstantesBaseDatos {
    public static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    //variables de la tabla mascota
    public static final String TABLE_MASCOTAS = "mascotas";
    public static final String TABLE_MASCOTAS_ID = "id";
    public static final String TABLE_MASCOTAS_NOMBRE = "nombre";
    public static final String TABLE_MASCOTAS_IMAGEN = "imagen";
    public static final String TABLE_MASCOTAS_RANKING = "ranking";
    //variables de la tabla mimascota
    public static final String TABLE_MIMASCOTA = "mimascota";
    public static final String TABLE_MIMASCOTA_ID = "id";
    public static final String TABLE_MIMASCOTA_ID_MASCOTA = "id_mascota";
    public static final String TABLE_MIMASCOTA_IMAGEN = "imagen";
    public static final String TABLE_MIMASCOTA_RANKING = "ranking";
}