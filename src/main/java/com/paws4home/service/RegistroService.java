
package com.paws4home.service;

import com.paws4home.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroService {

    public Model activar(Model model, String usuario, String clave);

    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    
    public void activar(Usuario usuario);
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;

}
