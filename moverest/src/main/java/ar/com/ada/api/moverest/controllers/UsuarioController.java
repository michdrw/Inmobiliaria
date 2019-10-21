package ar.com.ada.api.moverest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.moverest.models.requests.PasswordRequest;
import ar.com.ada.api.moverest.models.responses.PasswordResponse;
import ar.com.ada.api.moverest.services.UsuarioService;

/**
 * UsuarioController
 */
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PutMapping("usuarios/{id}/password")
    public PasswordResponse putPassword(@RequestBody PasswordRequest req) throws Exception {

        PasswordResponse p = new PasswordResponse();

        usuarioService.modificaPassword(req.usuarioId, req.password);

        p.isOk = true;
        p.message = "Password restablecida.";

        return p;
    }
}