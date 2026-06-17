package vista;

import dao.NumeroDAO;
import modelo.NumeroCuadrado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class FormularioPrincipal extends JFrame {

    private JTable tabla;
    private JButton btnConsultar;

    public FormularioPrincipal() {

        setTitle(
                "Numeros Elevados al Cuadrado"
        );

        setSize(700,500);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        setLayout(new BorderLayout());

        btnConsultar =
                new JButton(
                        "Consultar Oracle"
                );

        add(btnConsultar,
                BorderLayout.NORTH);

        tabla = new JTable();

        JScrollPane scroll =
                new JScrollPane(tabla);

        add(scroll,
                BorderLayout.CENTER);

        btnConsultar.addActionListener(
                e -> cargarDatos()
        );
    }

    private void cargarDatos() {

        String[] columnas = {

                "Numero",
                "Cuadrado"
        };

        DefaultTableModel modelo =
                new DefaultTableModel(
                        columnas,
                        0
                );

        NumeroDAO dao =
                new NumeroDAO();

        List<NumeroCuadrado> lista =
                dao.obtenerNumeros();

        for (NumeroCuadrado n : lista) {

            modelo.addRow(new Object[]{

                    n.getNumero(),
                    n.getCuadrado()
            });
        }

        tabla.setModel(modelo);
    }   
}