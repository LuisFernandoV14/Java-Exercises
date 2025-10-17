package Fixar_Comparable_e_Generic;

import java.util.ArrayList;
import java.util.Collections;

public class CaixaOrdenada<T extends Comparable<? super T>> implements Comparable<CaixaOrdenada<T>>{

    ArrayList<T> lista = new ArrayList<>();

    public void adicionar(T item){
        lista.add(item);
    }

    public void remover(int index){
        lista.remove(index);
    }

    public void ordenar() {
        Collections.sort(lista);
    }

    public T maiorElemento() {
        return Collections.max(lista);
    }

    public ArrayList<T> maiorElementoEspecifico(T valor) {
        ArrayList<T> listaEspecifica = new ArrayList<>();

        for (T t : lista) {
            if (t.compareTo(valor) > 0) {
                listaEspecifica.add(t);
            }
        }

        return listaEspecifica;
    }

    public ArrayList<T> elementosUnicos() {
        ArrayList<T> listaUnicos = new ArrayList<>();
        listaUnicos.add(lista.getFirst());

        for (T t1 : lista) {
            boolean naoExiste = true;

            for (T t2 : listaUnicos) {
                if (t1.compareTo(t2) == 0) {
                    naoExiste = false;
                    break;
                }
            }

            if (naoExiste) {
                listaUnicos.add(t1);
            }
        }

        return listaUnicos;
    }

    public void mostrar() {
        for (T item : lista) {
            System.out.println(item);
        }
    }

    public Integer tamanho() {
        return lista.size();
    }

    @Override
    public int compareTo(CaixaOrdenada o) {
        return this.tamanho().compareTo(o.tamanho());

    }

}
