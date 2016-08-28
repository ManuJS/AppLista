package applista.manu.com.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import applista.manu.com.R;

/**
 * Created by emanu on 28/08/2016.
 */
public class ListaFragments extends Fragment {

    ListView listView;
    private String[] descricao = new String[]{"", "", ""};
    private String[] duracao;
    private String[] status;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        duracao = new String[descricao.length]; //aqui eu digo que duracao tem o mesmo tamanho de descricao
        status  = new String[descricao.length]; //o mesmo tamanho do vetor de cima


        MyListAdapter myListAdapter = new MyListAdapter();
        ListView listView = (ListView) rootView.findViewById(R.id.listatarefas);
        listView.setAdapter(myListAdapter);


        return rootView;
    }


    private class MyListAdapter extends BaseAdapter {
        @Override
        public int getCount() {

            if(descricao != null && descricao.length != 0){
                return descricao.length;
            }
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return descricao[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            final ViewHolder holder;
            if (view == null) {

                holder = new ViewHolder();

                LayoutInflater inflater = getActivity().getLayoutInflater();
                view = inflater.inflate(R.layout.item_lista_edit, null);
                holder.editText = (EditText) view.findViewById(R.id.edtDescricao);
                holder.editText = (EditText) view.findViewById(R.id.edtDuracao);
                holder.chkBox = (CheckBox) view.findViewById(R.id.checkboxStatus);
//                holder.chkBox.setChecked(false);


                view.setTag(holder);



            } else {

                holder = (ViewHolder) view.getTag();
            }


            holder.ref = position;

            holder.editText.setText(descricao[position]);
            holder.editText.setText(duracao[position]);
            holder.editText.addTextChangedListener(new TextWatcher() {

                @Override
                public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                              int arg3) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void afterTextChanged(Editable arg0) {
                    // TODO Auto-generated method stub
                    duracao[holder.ref] = arg0.toString();
                    status[holder.ref] = arg0.toString();
                }
            });

            return view;
        }

        private class ViewHolder {
            EditText editText;
            CheckBox chkBox;
            int ref;
        }

    }
}

