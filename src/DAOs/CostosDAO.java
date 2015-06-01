/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOs;

import POJOs.Costos;
import java.util.*;

/**
 *
 * @author MAVA
 */
public abstract class CostosDAO {
    
    abstract Collection<Costos> ObtenerPorPeriodo(int id);
    
}
