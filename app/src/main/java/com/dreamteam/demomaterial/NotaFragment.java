package com.dreamteam.demomaterial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Roberto on 03/01/2016.
 */
public class NotaFragment extends Fragment {

    private Nota mNota;
    private EditText mTitoloNota;
    private EditText mDettaglioNota;
    private EditText mDataCreazioneNota;
    private Button mSalvaButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNota = new Nota();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.nota_fragment_layout, container, false);

        mTitoloNota = (EditText) v.findViewById(R.id.nota_titolo);
        mNota.setTitolo(mTitoloNota.getText().toString());

        mDettaglioNota = (EditText) v.findViewById(R.id.nota_dettaglio);
        mNota.setDettaglio(mDettaglioNota.getText().toString());

        mDataCreazioneNota = (EditText) v.findViewById(R.id.data_creazione);
        mDataCreazioneNota.setText(mNota.getDataCreazione().toString());

        mSalvaButton = (Button) v.findViewById(R.id.crea_nota_button);

        return v;
    }
}
