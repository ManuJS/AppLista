package applista.manu.com.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import applista.manu.com.R;

/**
 * Created by emanu on 28/08/2016.
 */
public class ListaFragments extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> dados = Arrays.asList("Programando eternamente", "Estudando eternamente", "Bebendo cafe ");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dados );
        listView = (ListView) rootView.findViewById(R.id.listatarefas);

        listView.setAdapter(adapter);

        return rootView;
    }
}
