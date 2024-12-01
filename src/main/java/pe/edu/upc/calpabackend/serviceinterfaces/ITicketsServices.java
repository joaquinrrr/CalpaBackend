package pe.edu.upc.calpabackend.serviceinterfaces;

import pe.edu.upc.calpabackend.entities.Suppliers;
import pe.edu.upc.calpabackend.entities.Tickets;

import java.util.List;

public interface ITicketsServices {
    Tickets insert(Tickets tickets);
    public List<Tickets> list();
    public void delete(int id);
    public void update(Tickets tickets);
    public Tickets listarId(int id);

}
