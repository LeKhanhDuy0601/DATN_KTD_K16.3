package MobileShop.Common;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import MobileShop.Entity.City;

public class CityExcelHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = { "id", "code", "name", "type" };
	static String SHEET = "cities";

	public static boolean hasExcelFormat(MultipartFile file) {
		if (!TYPE.equals(file.getContentType())) {
			return false;
		}
		return true;
	}

	public static List<City> excelCities(InputStream is) {
		try {
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheet(SHEET);
			Iterator<Row> rows = sheet.iterator();
			List<City> cities = new ArrayList<City>();
			int rowNumber = 0;
			while (rows.hasNext()) {
				Row currentRow = rows.next();
				// skip header
				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}
				Iterator<Cell> cellsInRow = currentRow.iterator();
				City city = new City();
				int cellIdx = 0;
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();
					switch (cellIdx) {
					case 0:
						city.setId((int) currentCell.getNumericCellValue());
						break;
					case 1:
						city.setCode(currentCell.getStringCellValue());
						break;
					case 2:
						city.setName(currentCell.getStringCellValue());
						break;
					case 3:
						city.setType(currentCell.getStringCellValue());
						break;
					default:
						break;
					}
					cellIdx++;
				}
				cities.add(city);
			}
			workbook.close();
			return cities;
		} catch (IOException e) {
			throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}
}
