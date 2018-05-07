package chatoff.pdm.tads.ifpe.edu.br.chatoff;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import chatoff.pdm.tads.ifpe.edu.br.chatoff.PerfilFragment.OnFragmentInteractionListener;


public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost mTabHost = findViewById(R.id.tabHost);
        mTabHost.setup();

        TabHost.TabSpec mSpec = mTabHost.newTabSpec("Conversas");
        mSpec.setContent(R.id.conversas);
        mSpec.setIndicator("Conversas");
        mTabHost.addTab(mSpec);

        mSpec = mTabHost.newTabSpec("Contatos");
        mSpec.setContent(R.id.contatos);
        mSpec.setIndicator("Contatos");
        mTabHost.addTab(mSpec);

        mSpec = mTabHost.newTabSpec("Perfil");
        mSpec.setContent(R.id.perfil);
        mSpec.setIndicator("Perfil");
        mTabHost.addTab(mSpec);
    }

   @Override
        public void onFragmentInteraction(Uri uri) {

        }

}
