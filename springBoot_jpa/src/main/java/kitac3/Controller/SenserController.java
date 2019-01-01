package kitac3.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kitac3.Entity.Senserdata;
import kitac3.Repo.SenserRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/senser") // This means URL's start with /demo (after Application path)
public class SenserController {
	@Autowired 
	private SenserRepository senserRepo;


	@GetMapping(path="/all")
	public @ResponseBody Iterable<Senserdata> getAllData() {
		// This returns a JSON or XML with the users
		return senserRepo.findAll();
	}
	@GetMapping(path="/findByDate")
	public @ResponseBody Iterable<Senserdata> getDataByDate() {
		// This returns a JSON or XML with the users
<<<<<<< HEAD
		return senserRepo.findByDate(new Date(118,9,1));
=======
		return senserRepo.findByDate(new Date(118,4,1));
>>>>>>> branch 'master' of https://github.com/kitac3/MyHome
	}
}
