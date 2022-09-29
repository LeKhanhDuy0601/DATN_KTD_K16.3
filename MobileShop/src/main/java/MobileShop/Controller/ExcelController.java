package MobileShop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import MobileShop.Common.CityExcelHelper;
import MobileShop.Message.ResponseMessage;
import MobileShop.service.impl.CityExcelService;

@CrossOrigin("http://localhost:8080")
@Controller
@RequestMapping("/api/excel")
public class ExcelController {
	@Autowired
	CityExcelService cityExcelService;

	@PostMapping("/upload/cities")
	public ResponseEntity<ResponseMessage> uploadFileCity(@RequestParam("file") MultipartFile file) {
		String message = "";
		System.err.println("ok");
		if (CityExcelHelper.hasExcelFormat(file)) {
			try {
				cityExcelService.save(file);
				message = "Uploaded the file successfully: " + file.getOriginalFilename();
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				message = "Could not upload the file: " + file.getOriginalFilename() + "!";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
			}
		}
		message = "Please upload an excel file!";
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	}

}