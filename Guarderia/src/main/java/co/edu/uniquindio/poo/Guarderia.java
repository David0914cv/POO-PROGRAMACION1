package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public boolean verificarNinio(Ninio ninio){
        boolean existe = true;
        for(Ninio ninios : listNinios){
            if(ninios.getID().equals(ninio.getID())){
                existe = false;
            }
        }
        return existe;
    }

    public void eliminarNinio(String ID){
        Boolean ninioEliminar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.remove(i);
                ninioEliminar = true;
                break;
            }
        }
    }

    public void actualizarNinio(String ID, Ninio ninio){
        Boolean ninioActualizar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                ninioActualizar = true;
                break;
            }
        }
    }

    public void almacenarNinios(Ninio ninio) {
        if(verificarNinio(ninio)){
            listNinios.add(ninio);
            System.out.println("Niño almacenado com exito");
        }else{
            System.out.println("Niño ya esta almacenado");
        }
    }

    public Ninio determinarMayorVocales(){
        int numeroMayor=0;
        Ninio ninioMayorVocales = null;
        
        for (int i = 0; i < listNinios.size(); i++) {
            int numeroVocales=0;
            for (int j = 0; j < listNinios.get(i).getNombres().length(); j++) {
                if(listNinios.get(i).getNombres().charAt(j) == 'a' || listNinios.get(i).getNombres().charAt(j) == 'e' 
                        || listNinios.get(i).getNombres().charAt(j) == 'i' || listNinios.get(i).getNombres().charAt(j) == 'o'
                || listNinios.get(i).getNombres().charAt(j) == 'u'){
                    numeroVocales++;
                }
            }
            if (numeroVocales > numeroMayor){
                numeroMayor=numeroVocales;
                ninioMayorVocales=listNinios.get(i);
            }
        }
        return ninioMayorVocales;
    }

    public Ninio determinarMayorConsonantes(){
        int numeroMayor=0;
        Ninio ninioMayorConsonantes = null;

        for (int i = 0; i < listNinios.size(); i++) {
            int numeroConsonantes=0;
            for (int j = 0; j < listNinios.get(i).getNombres().length(); j++) {
                if(listNinios.get(i).getNombres().charAt(j) != 'a' || listNinios.get(i).getNombres().charAt(j) != 'e'
                        || listNinios.get(i).getNombres().charAt(j) != 'i' || listNinios.get(i).getNombres().charAt(j) != 'o'
                        || listNinios.get(i).getNombres().charAt(j) != 'u'){
                    numeroConsonantes++;
                }
            }
            if (numeroConsonantes > numeroMayor){
                numeroMayor=numeroConsonantes;
                ninioMayorConsonantes=listNinios.get(i);
            }
        }
        return ninioMayorConsonantes;
    }

    public Ninio reconocerPalindromo(){
        boolean bandera=true;
        Ninio ninioPalindromo=null;
        for (int i = 0; i < listNinios.size(); i++) {
            int j=0;
            int k=listNinios.get(i).getNombres().length()-1;
            while (j < listNinios.get(i).getNombres().length()){
                if (listNinios.get(i).getNombres().charAt(j) != listNinios.get(i).getNombres().charAt(k)) {
                    bandera=false;
                    break;
                }
                j++;
                k--;
            }
            if (bandera){
                ninioPalindromo=listNinios.get(i);
            }
        }
        return ninioPalindromo;
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        this.listNinios = listNinios;
    }

}
