package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import Entity.Senserdata;
import Repo.SenserRepository;

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
		return senserRepo.findByDate("MEASURE_DATETIME>'20181101'");
	}
}
