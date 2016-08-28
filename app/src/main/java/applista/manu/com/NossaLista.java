package applista.manu.com;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by emanu on 28/08/2016.
 */
public class NossaLista extends ListActivity {

    private String[] listaTarefas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listaTarefas=new String[]{"Estudar Android, fazendo, 3 horas", "Fazer dever de casa, a fazer, 3 horas"};

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.listviewtarefas, listaTarefas));

    }

}
