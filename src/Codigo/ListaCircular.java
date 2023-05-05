package Codigo;

import javax.swing.ImageIcon;

public class ListaCircular {
    
    private NodoImagen imagenActual;
    
    public void insertarImagen(ImageIcon nuevaImagen){
        if (imagenActual == null){ //insertamos si no existe nada en la lista
            imagenActual = new NodoImagen();
            imagenActual.setImagen(nuevaImagen);
            imagenActual.setImager_reset(nuevaImagen);
            imagenActual.setSiguiente(imagenActual);
            imagenActual.setAnterior(imagenActual);
            System.out.println("Imagen nueva insertada");
        }else {
            //insertamos luego de la imagen que estamos viendo
            NodoImagen nuevoNodo = new NodoImagen();
            nuevoNodo.setImagen(nuevaImagen);
            nuevoNodo.setImager_reset(nuevaImagen);
            
            nuevoNodo.setSiguiente(imagenActual.getSiguiente());
            nuevoNodo.setAnterior(imagenActual.getSiguiente().getAnterior());
            
            imagenActual.setSiguiente(nuevoNodo);
            nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
            
            imagenActual = imagenActual.getSiguiente();
        }
    }
    
    public ImageIcon getImagenSiguiente(){
        if (imagenActual != null){
            imagenActual = imagenActual.getSiguiente();
            return imagenActual.getImagen();
        }
        return null;
    }
    
    public ImageIcon getImagenAnterior(){
        if (imagenActual != null){
            imagenActual = imagenActual.getAnterior();
            return imagenActual.getImagen();
        }
        return null;
    }
    
    //Este metodo es para que la imagen se quede con el filtro aplicado
    public void actualizarImagen(ImageIcon actualizarImagen){
        if(imagenActual != null){
            imagenActual.setImagen(actualizarImagen);
        }
    }
    
    public ImageIcon resetImagen(){
        if(imagenActual != null){
            imagenActual.setImagen(imagenActual.getImager_reset());
            return imagenActual.getImagen();
        }
        return null;
    }
}
