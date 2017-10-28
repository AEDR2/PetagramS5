package mx.aedr2.petagram3.adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.aedr2.petagram3.R;

/**
 * Created by alejandraperez on 16/09/17.
 */

public class MiMascotaAdaptador extends RecyclerView.Adapter<MiMascotaAdaptador.MiMascotaViewHolder>{

    ArrayList<ArrayList<Integer>> fotosMascota;
    Activity actividad;

    public MiMascotaAdaptador(ArrayList<ArrayList<Integer>> fotosMascota, Activity actividad) {
        this.fotosMascota = fotosMascota;
        this.actividad = actividad;
    }

    @Override
    public MiMascotaAdaptador.MiMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mimascota,parent, false);
        return new MiMascotaAdaptador.MiMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MiMascotaAdaptador.MiMascotaViewHolder holder, int position) {
        final ArrayList<Integer> foto = fotosMascota.get(position);
        holder.imgMiFoto.setImageResource(foto.get(0));
        holder.tvMiRanking.setText(String.valueOf(foto.get(1)));
    }

    @Override
    public int getItemCount() {
        return fotosMascota.size();
    }

    public static class MiMascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgMiFoto;
        private TextView tvMiRanking;
        private ImageView imgMiHueso;
        public MiMascotaViewHolder(View itemView){
            super(itemView);
            imgMiFoto = (ImageView) itemView.findViewById(R.id.imgMiFoto);
            imgMiHueso = (ImageView) itemView.findViewById(R.id.ivMiHueso);
            tvMiRanking = (TextView) itemView.findViewById(R.id.tvMiRanking);
        }
    }
}