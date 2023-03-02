package net.codejava.subject;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectRepository subjectRepository;
	
	
	public Subject getSubjectById(long id) {
		// TODO Auto-generated method stub
		return subjectRepository.findById(id).get();
	}

	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		Pageable page = PageRequest.of(0, 5);
		return subjectRepository.findAll(page).getContent();
	}
	
}
