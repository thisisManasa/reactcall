package call.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import call.entities.FormData;

@CrossOrigin("*")
@RestController
public class DemoController {
	@GetMapping("/testGet")
	public String testGet() {
		System.out.println("Get request received");
		return "Get request received";
	}
	
	@PostMapping("/testPost")
	public String testPost(@RequestBody String data) {
		System.out.println("Post request received : "+data);
		return "Post request received : "+data;
	}
	
	@PostMapping("/testForm")
	public String testForm(@RequestBody String formData) {
		System.out.println("Form request received : "+formData);
		return "Post request received : "+formData;
	}
	
	@PostMapping("/formData")
	public String formData(@RequestBody FormData data) {
		System.out.println("data -"+ data );
		return "data - " + data;
	}
}
