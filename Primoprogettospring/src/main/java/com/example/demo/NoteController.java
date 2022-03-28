package com.example.demo;



import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
	private NoteRepository noteRepository = null;

	
	NoteController(NoteRepository repository){
		noteRepository= repository;
	}
	
	
	
	@GetMapping("/notes")
	Iterable<Nota> getNotes(){
		return noteRepository.findAll();
		
	}
	
	@GetMapping("/notes/{noteId}")
	Nota getNota(@PathVariable long noteId){
		return noteRepository.findById(noteId).orElseThrow();
	}
	
	
	@PostMapping("/notes")
	Nota createNota(@RequestBody Nota newNota) {
		return noteRepository.save(newNota);
		
	}
	
	@PutMapping("/notes/{noteId}")
	Nota updateNota(@PathVariable Long noteId, @RequestBody Nota noteDto) {
		Nota noteToUpdate= noteRepository.findById(noteId).orElseThrow();
		noteToUpdate.setTitle(noteDto.getTitle());
		noteToUpdate.setContent(noteDto.getContent());
		
		return noteRepository.save(noteToUpdate);
	}
	
	@DeleteMapping("/notes/{noteId}")
	void deleteNota(@PathVariable long noteId){
		Nota nota= noteRepository.findById(noteId).orElseThrow();
		noteRepository.delete(nota);
	}
	
}
