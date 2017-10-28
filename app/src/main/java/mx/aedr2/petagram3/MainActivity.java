package mx.aedr2.petagram3;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import mx.aedr2.petagram3.adaptador.PageAdapter;
import mx.aedr2.petagram3.fragmento.Mascotas;
import mx.aedr2.petagram3.fragmento.MiMascota;
import mx.aedr2.petagram3.pojo.Contacto;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se genera la barra de la aplicacon
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }



    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Mascotas());
        fragments.add(new MiMascota());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.casa);
        tabLayout.getTabAt(1).setIcon(R.drawable.cat);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch(item.getItemId()){
            case R.id.mContacto:
                intent = new Intent(MainActivity.this, Contacto.class);
                startActivity(intent);
                break;
            case R.id.mAbout:
                intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;
            case R.id.mFavoritas:
                //irRankinGatos();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}