package mx.aedr2.petagram3.db;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.pojo.Mascota;

/**
 * Created by alejandraperez on 27/10/17.
 */

public class ConstructorMascotas {
    private Context context;
    public ConstructorMascotas(Context context){this.context = context;}

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos bd = new BaseDatos(context);
        insertarMascotas(bd);
        return bd.obtenerTodasMascotas();
    }

    public void insertarMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Catus");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN, R.drawable.cat_food);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 290);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Esnut");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN, R.drawable.cat_acrobat);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 17);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Rito");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_ball);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Matesito");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_banjo);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 21);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Natacha");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_bat);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 22);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Bold");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_bd);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 32);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Volkova");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_birdhouse);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 1);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Morado");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_box);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 9);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Boris");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_cart);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 8);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Kirby");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_clean);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 7);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Pepinut");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_cupid);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Tomper");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_drunk);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Gato");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_eyes);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 15);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Pumpkin");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_fight);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 11);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Gordolobo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_fish);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 21);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Parche");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_fisht);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 62);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Sammy Davis Junior");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_fridge);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 20);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Lola");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_ghost);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 11);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Alfalfa");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_gift);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 9);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Tofo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_hiss);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Copernico");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_lady);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Mimo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_laptop);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 15);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Principe George");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_laptop_2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 15);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Mustafá");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_makeup);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 13);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Simeón");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_mask);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 11);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Tigroso");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_moustache);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 11);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Kitty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_mummy);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 5);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Patas");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_paper);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 51);
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Ringo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_phone);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 21);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Bigotes");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_plain);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 24);
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Orejas");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_poo);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 19);
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Vatoloco");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_pumpkin);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 19);
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Redondo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_purr);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 18);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Coco");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_radio);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 10);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Chocolate");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_rascal);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 40);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Pelos");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_skull);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 32);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Bigoton");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_sleep);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING,78 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Tigra");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_sulky);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 23);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Cacto");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_tied);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING,15 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Copo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_toilet);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 13);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Dante");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_torture);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING,67 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Mambo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_vampire);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 28);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Neron");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_vote);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 26);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Pomodoro");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_upsidedown);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 14);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Cletus");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN,R.drawable.cat_wizard);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_RANKING, 13);
        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(int idMascota) {
        BaseDatos bd = new BaseDatos(context);
        bd.insertaLikeMascota(idMascota);
    }

    public int obtenerLikesMascotas(int idMascota){
        BaseDatos bd = new BaseDatos(context);
        return bd.obtenerLikesMascota(idMascota);
    }
}
