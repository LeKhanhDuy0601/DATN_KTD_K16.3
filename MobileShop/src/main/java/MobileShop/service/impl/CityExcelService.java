package MobileShop.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import MobileShop.Common.CityExcelHelper;
import MobileShop.Dao.CityDAO;
import MobileShop.Entity.City;

@Service
public class CityExcelService {
	@Autowired
	CityDAO cityDAO;

	public void save(MultipartFile file) {
		try {
			List<City> tutorials = CityExcelHelper.excelCities(file.getInputStream());
			cityDAO.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store excel data: " + e.getMessage());
		}
	}

}
