package principal;

import vista.FormularioPrincipal;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new FormularioPrincipal()
                    .setVisible(true);
        });
    }
}