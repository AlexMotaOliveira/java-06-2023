package com.impacta.treinamento.cap15.generic;

import com.impacta.treinamento.cap7.Aluno;
import com.sun.jdi.event.StepEvent;

import java.util.*;

public class TesteGenerico {


    public static void main(String[] args) {

        ClasseGenerica classeGenerica = new ClasseGenerica();

        classeGenerica.setKey(10);
        classeGenerica.setKey("Ola");
        classeGenerica.setKey(new Aluno());

        classeGenerica.setValue("10");
        classeGenerica.setValue(20);
        classeGenerica.setValue(new Aluno());

        List<String> list;

        ClasseGenerica<Long, String> classeGenericaString = new ClasseGenerica<>();
        classeGenericaString.setKey(10L);
        classeGenericaString.setKey(60L);

        classeGenericaString.setValue("");
        classeGenericaString.setValue("valor é String");

        List<ClasseGenerica<Long, ClasseGenerica<String, String>>> list1 = new Vector<>();

        List<List<List<ClasseGenerica<String, String>>>> lists = new ArrayList<>();

        List<String> strings = new ArrayList<>();
        Map<Long, String> map = new HashMap<>();
        Map<Long, String> tree = new TreeMap<>();

        // TODO: 20/06/2023  voltamos 21:20

    }
}
