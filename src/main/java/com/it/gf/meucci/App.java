package com.it.gf.meucci;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {
        Alunno a1 = new Alunno();
        Alunno a2 = new Alunno();
        Alunno a3 = new Alunno();
        Alunno a4 = new Alunno();
        
        Classe c1 = new Classe();

        c1.aggiungiAlunno(a1);
        c1.aggiungiAlunno(a2);
        c1.aggiungiAlunno(a3);
        c1.aggiungiAlunno(a4);
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("classe.json"), c1);
    }
}
