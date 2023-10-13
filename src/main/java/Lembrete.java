package main.java;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Lembrete implements Comparable<Lembrete> {
    public String nome;
    public Date data;

    public Lembrete(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return nome + " - " + dateFormat.format(data);
    }

    @Override
    public int compareTo(Lembrete o) {
        return this.getData().compareTo(o.getData());
    }
}
