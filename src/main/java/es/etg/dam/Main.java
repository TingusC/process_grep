package es.etg.dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    private static final String MSG_ERROR = "Error en la ejecucion del proceso";
    private static final String[] COMANDOS = {"grep", "-i", "psp"};
    private static final String[] FRASES = {"Me gusta PSP y java", 
                                            "PSP se programa en java", 
                                            "es un modulo de DAM", 
                                            "y se programa de forma concurrente en PSP", 
                                            "PSP es programacion"};

    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec(COMANDOS);
        writeOnPrcess(process);
        String salida = inputProcess(process);

        int exitVal = process.exitValue();
        if(exitVal == 0)
        {
            System.out.println(salida);
        }
        else
        {
            System.err.println(MSG_ERROR);
        }
    }

    public static void writeOnPrcess(Process process) throws  IOException{
        OutputStream out = process.getOutputStream();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
        for(String frase : FRASES)
        {
            writer.println(frase);
        }
        writer.close();
    }

    public static String inputProcess(Process process) throws IOException{
        String ret = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String linea;
        while((linea = reader.readLine()) != null)
        {
            ret += linea + "\n";
        }
        reader.close();
        return ret;
    }
}