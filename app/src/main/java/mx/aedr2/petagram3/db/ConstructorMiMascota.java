package mx.aedr2.petagram3.db;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

/**
 * Created by alejandraperez on 27/10/17.
 */

public class ConstructorMiMascota {
    private Context context;
    private Mascota catus;


    public ConstructorMiMascota(Context context){
        this.context = context;
    }

    public MiMascotaP obtenerFotosMiMascota(){
        BaseDatos bd = new BaseDatos(context);
        //Primero se obtiene mi mascota
        catus = bd.obtenerMiMascota(1);
        insertarMiMascota(bd);
        return bd.obtenerFotosMiMascota(catus);
    }

    public void insertarMiMascota(BaseDatos db){

        //se añaden sus fotos a la base de datos
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_food);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_cage);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_drink);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_pirate);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_fat);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_walk);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_lady);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_lion);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_whale);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_fly);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_smoke);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_slippers);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_sing);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_ball);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA,catus.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.shadow_cat);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarFotosMiMascota(contentValues);
        db.close();
    }

    public Mascota obtenerMiMascota(int idMascota){
        BaseDatos bd = new BaseDatos(context);
        return bd.obtenerMiMascota(idMascota);
    }

    public void darLikeFotoMascota(int idFotoMascota) {
        BaseDatos bd = new BaseDatos(context);
        bd.insertaLikeFotoMascota(idFotoMascota);
    }

    public int obtenerLikesFotoMascotas(int idFotoMascota){
        BaseDatos bd = new BaseDatos(context);
        return bd.obtenerLikesFotoMascota(idFotoMascota);
    }
}
