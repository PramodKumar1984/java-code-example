package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFromFiles {
	public static void main(String[] args) throws IOException {
		List<File> files = Files.walk(Paths.get(Paths.get(".").toAbsolutePath()+"\\resource\\txt_files")).filter(Files::isRegularFile).map(Path::toFile)
				.limit(1).collect(Collectors.toList());
		try (BufferedReader reader = new BufferedReader(new FileReader(files.get(0)))) {
			reader.lines().forEach(System.out::println);
		} catch (IOException ir) {
			ir.printStackTrace();
		}
	}
}
