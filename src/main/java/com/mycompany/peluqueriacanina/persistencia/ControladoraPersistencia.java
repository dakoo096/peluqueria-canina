package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    //------------MASCOTA
    MascotaJpaController mascoJPA = new MascotaJpaController();

    //------------DUEÑO
    DuenioJpaController duenioJPA = new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota masco) {

        //crear en la base de datos el dueño
        duenioJPA.create(duenio);

        //crear en la base de datos la mascota
        mascoJPA.create(masco);

    }

    public List<Mascota> traerMascotas() {
        //retornamos lo de lista de mascotas a la controladora.
        return mascoJPA.findMascotaEntities();

    }

    public void borrarMascota(int num_cliente) {
        //si fuera un caso de 1 a n no deberiamos borrar al dueño ya que un dueño puede tener muchas mascotas,este programa trabaja relacion de 1 a 1
        try {
            mascoJPA.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Mascota traerMascota(int num_cliente) {
        return mascoJPA.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            //modificamos la mascota
            mascoJPA.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJPA.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            //editamos dueño
            duenioJPA.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

}
