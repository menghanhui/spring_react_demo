package react.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MainController {
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index() {
//		return "index";
//	}

	@RequestMapping(path="/sum", method=RequestMethod.POST)
	public int[] sum(@RequestBody ArrayObject arrayInput) throws Exception {
		return arrayInput.result();
	}

}
