package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ReadCsvPrintPriceValues {
	public static void main(String[] args) throws IOException {
		File file = Files.walk(Paths.get(Paths.get(".").toAbsolutePath() + "\\resource\\csv_files"))
				.filter(Files::isRegularFile).map(Path::toFile).limit(1).collect(Collectors.toList()).get(0);
		try (BufferedReader br = new BufferedReader(new FileReader(file));
				CSVParser parser = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(br);) {
			for (CSVRecord record : parser) {
				System.out.println(record.get("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
