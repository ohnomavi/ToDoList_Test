package test;

import main.java.ToDoListApp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToDoListAppTest {
    public ToDoListApp toDoListApp;
   //public DefaultListModel<Lembrete> listModel;

    @Before
    public void setUp() {
        toDoListApp = new ToDoListApp();
    }

    @Test
    public void testAdicionarLembrete() {
        // Teste se a adição de lembretes funciona corretamente
        int tamanhoInicial = toDoListApp.listModel.size();
        toDoListApp.nomeField.setText("Lembrete Teste");
        toDoListApp.dataField.setText("01/01/2024");
        toDoListApp.adicionarLembrete();
        int tamanhoFinal = toDoListApp.listModel.size();
        assertTrue(tamanhoFinal > tamanhoInicial);
    }

    @Test
    public void testDeletarLembrete() {
        // Teste se a exclusão de lembretes funciona corretamente
        toDoListApp.nomeField.setText("Lembrete Teste");
        toDoListApp.dataField.setText("01/01/2024");
        toDoListApp.adicionarLembrete();
        int tamanhoInicial = toDoListApp.listModel.size();
        toDoListApp.deletarLembrete(toDoListApp.listModel.getElementAt(0));
        int tamanhoFinal = toDoListApp.listModel.size();
        assertEquals(tamanhoInicial - 1, tamanhoFinal);
    }

    @Test
    public void testOrdenarLembretes() {
        // Teste se a ordenação de lembretes funciona corretamente
        toDoListApp.nomeField.setText("Lembrete 1");
        toDoListApp.dataField.setText("01/01/2024");
        toDoListApp.adicionarLembrete();

        toDoListApp.nomeField.setText("Lembrete 2");
        toDoListApp.dataField.setText("01/02/2024");
        toDoListApp.adicionarLembrete();

        toDoListApp.nomeField.setText("Lembrete 3");
        toDoListApp.dataField.setText("01/03/2024");
        toDoListApp.adicionarLembrete();

        toDoListApp.ordenarLembretes();
        
        for (int i = 1; i < toDoListApp.listModel.size(); i++) {
            assertTrue(toDoListApp.listModel.getElementAt(i).getData().compareTo(toDoListApp.listModel.getElementAt(i - 1).getData()) >= 0);
        }
    }
}




