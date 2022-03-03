package br.edu.pucgoias.cmp11138;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<Integer>();
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);

        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }


        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1);

        Iterator<Integer> iMeuSet = meuSet.iterator();
        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }



    }

}
