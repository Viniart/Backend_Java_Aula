package br.com.senai.entregas.service;

import br.com.senai.entregas.model.Usuario;
import br.com.senai.entregas.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario cadastrar(Usuario u) {
        return usuarioRepository.save(u);
    }

    public Usuario atualizar(Integer id, Usuario uNovo) {
        Usuario uExistente = buscarPorId(id);

        if (uExistente == null) {
            return null;
        }

        uExistente.setEmail(uNovo.getEmail());

        uExistente.setSenha(uNovo.getSenha());
        uExistente.setNomeCompleto(uNovo.getNomeCompleto());
        return usuarioRepository.save(uExistente);
    }

    public Usuario deletar(Integer id) {
        Usuario usuario = buscarPorId(id);

        if (usuario == null) {
            return null;
        }

        usuarioRepository.delete(usuario);
        return usuario;
    }
}
