package edu.example.multi.controller;

import edu.example.multi.service.SampleCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
@RequiredArgsConstructor
public class SampleBatchController {

	final SampleCoreService sampleCoreService;

	@GetMapping("/echo")
	public String echo(@RequestParam("message") String message) {
		return sampleCoreService.echo("batch server >> " + message);
	}

}
