package br.com.springboot.curso_springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.curso_springboot.model.Usuario;
import br.com.springboot.curso_springboot.repository.UsuarioRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
	@Autowired
    private UsuarioRepository usuarioRepository;
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/olamundo/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Ola mundo: " + name + "!";
    }
    
    @RequestMapping(value="salvar")
    @ResponseBody /*descrição da resposta*/
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) //recebe os dados para salvar 
    {
    	Usuario user = usuarioRepository.save(usuario);
    			//save(usuario);
    	return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
    }
    
    @GetMapping(value="listaTodos")
    	@ResponseBody /*Retorna os dados para o corpo da resposta*/
    	public ResponseEntity <List<Usuario>> listaTodos(){
    	List<Usuario> usuarios = usuarioRepository.findAll();
    	return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }
    
    @DeleteMapping(value="delete")
    	@ResponseBody
    	public ResponseEntity<String>delete(@RequestParam Long idUser)//recebe os dados para deletar
    	{
    		usuarioRepository.deleteById(idUser);
    		return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);			
    				
    	}
    
    @GetMapping(value="buscarbyid")
    	@ResponseBody
    	public ResponseEntity<Usuario> buscarbyid(@RequestParam(name="idUser") Long idUser)//Receve os dados para consulta
    	{
    	Usuario user=usuarioRepository.findById(idUser).get();
    	return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    	}
    
    @PutMapping(value="atualizar")
    @ResponseBody 
    public ResponseEntity<Usuario> atualizar (@RequestBody Usuario usuario)
    {
    Usuario user= usuarioRepository.saveAndFlush(usuario);
    return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }
    
    @GetMapping(value="buscarPorNome")
    @ResponseBody
    public ResponseEntity<List<Usuario>> buscarPorNome(@RequestParam(name="nome")String nome){
    	List<Usuario> users= usuarioRepository.buscarPorNome(nome.trim().toUpperCase());
    	return new ResponseEntity<List<Usuario>>(users, HttpStatus.OK);
    }
    
    
}
