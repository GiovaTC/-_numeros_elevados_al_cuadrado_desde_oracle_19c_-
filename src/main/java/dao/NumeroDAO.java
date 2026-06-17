package dao;

import conexion.ConexionOracle;
import modelo.NumeroCuadrado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NumeroDAO {

    public List<NumeroCuadrado> obtenerNumeros() {

        List<NumeroCuadrado> lista = new ArrayList<>();

        String sql = "SELECT NUMERO,CUADRADO " +
                    "FROM NUMEROS_CUADRADO_S" +
                    "ORDER BY NUMERO";

        try (
                Connection con =
                        ConexionOracle.conectar();

                PreparedStatement ps =
                        con.prepareStatement(sql);

                ResultSet rs =
                        ps.executeQuery()
        )    {
            while (rs.next()) {

                NumeroCuadrado n =
                        new NumeroCuadrado();

                n.setNumero(
                        rs.getInt("NUMERO")
                );

                n.setCuadrado(
                        rs.getLong("CUADRADO")
                );

                lista.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}   
