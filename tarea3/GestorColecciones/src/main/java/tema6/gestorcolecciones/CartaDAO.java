/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.gestorcolecciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static tema6.gestorcolecciones.AccesoBD.getConn;

/**
 *
 * @author usuario
 */
public class CartaDAO {
    
 
    public List<Carta> listar(){
        
        List<Carta> coleccion = new ArrayList<>();
        String sql = "SELECT nombre, numero, expansion, codigo FROM cartas";
        
        try(Statement stmt = getConn().createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
        
            while(rs.next()){
            
               Carta carta = crearCarta(rs);
               coleccion.add(carta);
            }
            
            
        } catch (SQLException ex) {
            System.out.println("ExceptionSQL no se pudo listar");
        } catch (Exception ex){
        
            System.out.println("Excepcion yo que sé");
        }
        
        return coleccion;
    }
    public void agregar(Carta carta){
    
        String sql = "insert into cartas (nombre, numero, expansion, codigo)"
                + "values(?,?,?,?)";
        
        try(PreparedStatement ps = getConn().prepareStatement(sql)){
        
            ps.setString(1, carta.getNombre());
            ps.setString(2, carta.getNumero());
            ps.setString(3, carta.getExpansion());
            ps.setString(4, carta.getCodigo());
            
            int salida = ps.executeUpdate();
            
            if (salida != 1) {
                
                throw new Exception("No se ha podido añadir la carta");
            }
            
        } catch (SQLException ex) {
            System.out.println("Excepción SQL al agregar carta");
        } catch (Exception ex) {
            
        }
    }
    public void modificar(Carta carta){
    
        String sql = "UPDATE cartas SET nombre = ?, numero = ?, expansion = ? WHERE codigo = ?";
        
        try(PreparedStatement ps = getConn().prepareCall(sql)){
        
            ps.setString(1, carta.getNombre());
            ps.setString(2, carta.getNumero());
            ps.setString(3, carta.getExpansion());
            ps.setString(4, carta.getCodigo());
            
            int salida = ps.executeUpdate();
            
            if (salida != 1) {
                
                throw new Exception("No se ha podido modificar la carta");
            }
            
        } catch (SQLException ex) {
            
            System.out.println("Excepción SQL no se ha modificado la carta");
           
        } catch (Exception ex) {
          
        }
    }
    
    public void borrar(String codigo){
    
        String sql = "DELETE FROM cartas WHERE codigo = ?";
        
        try(PreparedStatement ps = getConn().prepareStatement(sql)){
        
            ps.setString(1, codigo);
            
           int salida = ps.executeUpdate();
           
            if (salida != 1) {
                
                throw new Exception("NO se ha podido eliminar la carta");
            }
            
        } catch (SQLException ex) {
            System.out.println("Excepción SQL no se pudo borrar el registro");
        } catch (Exception ex) {
            System.getLogger(CartaDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    private Carta crearCarta(ResultSet rs) throws SQLException{
    
        return new Carta(rs.getString("nombre"), rs.getString("numero"),rs.getString("expansion"));
    }
    
    
}
