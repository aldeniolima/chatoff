package chatoff.pdm.tads.ifpe.edu.br.chatoff;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ConversaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ConversaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConversaFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public ConversaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Conversa.
     */
    // TODO: Rename and change types and number of parameters
    public static ConversaFragment newInstance(String param1, String param2) {
        ConversaFragment fragment = new ConversaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_conversa, container, false);


        Button botaoConversa = rootView.findViewById(R.id.botaoConversa);

        botaoConversa.setOnClickListener(this);

        return rootView;

    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onClick(View view){
        Fragment fragmento = null;

                fragmento = new MensagemFragment();
                trocarFragmento(fragmento);

    }

    public void trocarFragmento(Fragment fragmento){

        FragmentTransaction transacao = getFragmentManager().beginTransaction();

        transacao.replace(R.id.list_conversa, fragmento);

        transacao.addToBackStack(null);

        transacao.commit();

    }


      @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof PerfilFragment.OnFragmentInteractionListener) {
//            mListener = (PerfilFragment.OnFragmentInteractionListener) context;
//        } else {
//           mListener = null;
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
