package mx.aedr2.petagram3.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentNavigableMap;

import mx.aedr2.petagram3.pojo.Mascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

/**
 * Created by alejandraperez on 27/10/17.
 */

public class BaseDatos extends SQLiteOpenHelper{

    private Context context;

    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }


    //Creacion de la base de datos
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String queryMascotas = "CREATE TABLE " + ConstantesBaseDatos.TABLE_MASCOTAS + "(" +
                            ConstantesBaseDatos.TABLE_MASCOTAS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE + " TEXT, " +
                            ConstantesBaseDatos.TABLE_MASCOTAS_IMAGEN + " INTEGER," +
                            ConstantesBaseDatos.TABLE_MASCOTAS_RANKING + " INTEGER" +
                ")";

        String queryMiMascota = "CREATE TABLE " + ConstantesBaseDatos.TABLE_MIMASCOTA + "(" +
                ConstantesBaseDatos.TABLE_MIMASCOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA + " INTEGER, " +
                ConstantesBaseDatos.TABLE_MIMASCOTA_IMAGEN + " INTEGER, " +
                ConstantesBaseDatos.TABLE_MIMASCOTA_RANKING + " INTEGER, " +
                "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA + ") " +
                "REFERENCES " + ConstantesBaseDatos.TABLE_MASCOTAS + "(" + ConstantesBaseDatos.TABLE_MASCOTAS_ID + ")" +
                ")";
        sqLiteDatabase.execSQL(queryMascotas);
        sqLiteDatabase.execSQL(queryMiMascota);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_MASCOTAS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_MIMASCOTA);
        onCreate(sqLiteDatabase);
    }

    public ArrayList<Mascota> obtenerTodasMascotas(){
        ArrayList<Mascota>  mascotas = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MASCOTAS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        while(registros.moveToNext()){
            Mascota mascota = new Mascota();
            mascota.setId(registros.getInt(0));
            mascota.setNombre(registros.getString(1));
            mascota.setImagen(registros.getInt(2));
            mascota.setRanking(registros.getInt(3));
            mascotas.add(mascota);
        }
        db.close();
        return mascotas;
    }


    public void insertaLikeMascota(int idMascota){

        String query = "UPDATE " + ConstantesBaseDatos.TABLE_MASCOTAS + " SET " + ConstantesBaseDatos.TABLE_MASCOTAS_RANKING + " = " + ConstantesBaseDatos.TABLE_MASCOTAS_RANKING +
                 "+ 1  WHERE " + ConstantesBaseDatos.TABLE_MASCOTAS_ID + " = " + idMascota;
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(query);
        db.close();
    }

    public void insertarMascota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_MASCOTAS, null, contentValues);
        db.close();
    }


    public Mascota obtenerMiMascota(int idMascota){
        Mascota mascota = new Mascota();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MASCOTAS + " WHERE " + ConstantesBaseDatos.TABLE_MASCOTAS_ID + " = " + idMascota;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        if(registros.moveToNext()){
            mascota.setId(registros.getInt(0));
            mascota.setNombre(registros.getString(1));
            mascota.setImagen(registros.getInt(2));
            mascota.setRanking(registros.getInt(3));
        }
        db.close();
        return mascota;
    }


    public MiMascotaP obtenerFotosMiMascota(Mascota mascota){
        MiMascotaP  miMascota = new MiMascotaP();
        //Primero sa va a obtener la mascota buscada
        miMascota.setMiMascota(mascota);
        //se van a obtener las imagenes de mi mascota
        ArrayList<ArrayList<Integer>> imagenesMascota = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MIMASCOTA + " WHERE " + ConstantesBaseDatos.TABLE_MIMASCOTA_ID_MASCOTA + " = " + mascota.getId();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        int aux = 0;
        while(registros.moveToNext()){
            if(aux == 0){
                miMascota.setId(registros.getInt(0));
                miMascota.setId_mascota(registros.getInt(1));
            }
            ArrayList<Integer> auxiliar = new ArrayList<>();
            auxiliar.add(registros.getInt(2));
            auxiliar.add(registros.getInt(3));
            imagenesMascota.add(auxiliar);
        }
        miMascota.setFotos(imagenesMascota);
        db.close();
        return miMascota;
    }

    public void insertarFotosMiMascota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_MIMASCOTA, null, contentValues);
        db.close();
    }


    public ArrayList<Mascota> devuelveMejoresMascotas(){
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MASCOTAS + " ORDER BY " + ConstantesBaseDatos.TABLE_MASCOTAS_RANKING + " DESC LIMIT 5";
        ArrayList<Mascota> mascotas = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        while(registros.moveToNext()){
            Mascota mascota = new Mascota();
            mascota.setId(registros.getInt(0));
            mascota.setNombre(registros.getString(1));
            mascota.setImagen(registros.getInt(2));
            mascota.setRanking(registros.getInt(3));
            mascotas.add(mascota);
        }
        db.close();
        return mascotas;
    }

    public int obtenerLikesMascota(int idMascota){
        String query = "SELECT " + ConstantesBaseDatos.TABLE_MASCOTAS_RANKING + " FROM " + ConstantesBaseDatos.TABLE_MASCOTAS + " WHERE "+ ConstantesBaseDatos.TABLE_MASCOTAS_ID + " = " + idMascota;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        int likes = 0;
        if(registros.moveToNext()){
            likes = registros.getInt(0);
        }
        return likes;
    }

    public void insertaLikeFotoMascota(int idFotoMascota){
        String query = "UPDATE " + ConstantesBaseDatos.TABLE_MIMASCOTA + " SET " + ConstantesBaseDatos.TABLE_MIMASCOTA_RANKING + " = " + ConstantesBaseDatos.TABLE_MIMASCOTA_RANKING +
                "+ 1  WHERE " + ConstantesBaseDatos.TABLE_MIMASCOTA_ID + " = " + idFotoMascota;
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(query);
        db.close();
    }

    public int obtenerLikesFotoMascota(int idFotoMascota){
        String query = "SELECT " + ConstantesBaseDatos.TABLE_MIMASCOTA_RANKING + " FROM " + ConstantesBaseDatos.TABLE_MIMASCOTA + " WHERE "+ ConstantesBaseDatos.TABLE_MIMASCOTA_ID + " = " + idFotoMascota;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        int likes = 0;
        if(registros.moveToNext()){
            likes = registros.getInt(0);
        }
        return likes;
    }
}