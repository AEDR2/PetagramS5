package mx.aedr2.petagram3.adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;
import mx.aedr2.petagram3.db.ConstructorMascotas;
import mx.aedr2.petagram3.db.ConstructorMiMascota;
import mx.aedr2.petagram3.pojo.MiMascotaP;

/**
 * Created by alejandraperez on 16/09/17.
 */

public class MiMascotaAdaptador extends RecyclerView.Adapter<MiMascotaAdaptador.MiMascotaViewHolder>{
    private MiMascotaP miMascotaP;
    private ArrayList<ArrayList<Integer>> fotosMascota;
    private Activity actividad;

    public MiMascotaAdaptador(MiMascotaP miMascotaP, Activity actividad) {
        this.miMascotaP = miMascotaP;
        this.fotosMascota = miMascotaP.getFotos();
        this.actividad = actividad;
    }

    @Override
    public MiMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mimascota,parent, false);
        return new MiMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MiMascotaAdaptador.MiMascotaViewHolder holder, int position) {
        final ArrayList<Integer> foto = fotosMascota.get(position);
        holder.imgMiFoto.setImageResource(foto.get(0));
        holder.tvMiRanking.setText(String.valueOf(foto.get(1)));
        holder.ivMiHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(actividad, "Diste like a una foto de " + miMascotaP.getMiMascota().getNombre(), Toast.LENGTH_SHORT).show();
                ConstructorMiMascota constructorMiMascotas = new ConstructorMiMascota(actividad);
                constructorMiMascotas.darLikeFotoMascota(miMascotaP.getId());
                holder.tvMiRanking.setText(String.valueOf(constructorMiMascotas.obtenerLikesFotoMascotas(miMascotaP.getId())));
            }
        });
    }

    @Override
    public int getItemCount() {
        return fotosMascota.size();
    }

    public static class MiMascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgMiFoto;
        private TextView tvMiRanking;
        private ImageButton ivMiHueso;
        public MiMascotaViewHolder(View itemView){
            super(itemView);
            imgMiFoto = (ImageView) itemView.findViewById(R.id.imgMiFoto);
            ivMiHueso = (ImageButton) itemView.findViewById(R.id.ivMiHueso);
            tvMiRanking = (TextView) itemView.findViewById(R.id.tvMiRanking);
        }
    }
}