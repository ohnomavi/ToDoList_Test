package main.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {
    public JFrame frame;
    public JTextField nomeField;
    public JTextField dataField;
    public DefaultListModel<Lembrete> listModel;
    public JList<Lembrete> list;

    public ToDoListApp() {
        frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridBagLayout());

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel dataLabel = new JLabel("Data (dd/MM/yyyy):");
        dataField = new JTextField();
        JButton criarButton = new JButton("Criar");
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        criarButton.setBackground(new Color(173, 216, 230)); // Azul claro

        criarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarLembrete();
            }
        });

        // Centralizar o botão "Criar"
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(nomeLabel, gbc);
        panel.add(nomeField, gbc);
        panel.add(dataLabel, gbc);
        panel.add(dataField, gbc);
        panel.add(criarButton, gbc);

        frame.add(panel, BorderLayout.NORTH);

        // Personalizar a aparência da lista
        list.setCellRenderer(new MyListRenderer());
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int selectedIndex = list.locationToIndex(e.getPoint());
                    if (selectedIndex >= 0) {
                        deletarLembrete(listModel.get(selectedIndex));
                    }
                }
            }
        });

        frame.add(new JScrollPane(list), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void adicionarLembrete() {
        String nome = nomeField.getText();
        String dataStr = dataField.getText();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date data = dateFormat.parse(dataStr);
            Date hoje = new Date();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "O campo 'Nome' deve estar preenchido.");
            } else if (data.before(hoje)) {
                JOptionPane.showMessageDialog(frame, "A data deve estar no futuro.");
            } else {
                Lembrete lembrete = new Lembrete(nome, data);
                listModel.addElement(lembrete);
                ordenarLembretes();
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(frame, "Data inválida. Use o formato 'dd/MM/yyyy'.");
        }

        nomeField.setText("");
        dataField.setText("");
    }

    public void deletarLembrete(Lembrete lembrete) {
        listModel.removeElement(lembrete);
    }

    public void ordenarLembretes() {
        List<Lembrete> lembretesList = new ArrayList<>();
        for (int i = 0; i < listModel.size(); i++) {
            lembretesList.add(listModel.getElementAt(i));
        }

        Collections.sort(lembretesList);

        listModel.clear();

        for (Lembrete lembrete : lembretesList) {
            listModel.addElement(lembrete);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ToDoListApp();
            }
        });
    }
}


class MyListRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(value.toString());
        JButton deleteButton = new JButton("X");

        label.setForeground(Color.WHITE);
        label.setBackground(new Color(0, 0, 139)); // Azul escuro
        label.setOpaque(true);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);

        deleteButton.setBackground(new Color(255, 182, 193)); // Rosa claro
        deleteButton.setBorderPainted(false);
        deleteButton.setFocusPainted(false);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Encontre o índice do item e exclua-o
                JList<Lembrete> list = (JList<Lembrete>) e.getSource();
                DefaultListModel<Lembrete> model = (DefaultListModel<Lembrete>) list.getModel();
                model.remove(index);
            }
        });

        panel.add(label, BorderLayout.CENTER);
        panel.add(deleteButton, BorderLayout.EAST);

        return panel;
    }
}
