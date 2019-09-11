package example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Six {
	private String fileName;
	private List<String> propertyList;
	Logger log = Logger.getLogger("Logger6");

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void readTheFile() throws IOException { // ici manque try catch et
													// finally, finally pour
													// close le reader
		BufferedReader reader = null;
		Path path = Paths.get(this.getFileName());
		try {
			reader = Files.newBufferedReader(path);
			String line = reader.readLine();
			while (line != null) {
				line = reader.readLine();
			}
		} catch (IOException e) {
			log.log(Level.INFO, e.getMessage());
		} finally {
			if (reader != null) {
				reader.close();
			}

		}
	}

	public void readTheFile2() throws IOException { 
		OutputStream  stream = null ; 
		for (String property : propertyList) {
			try (OutputStream  temp =  new FileOutputStream(this.getFileName())) {
				stream = temp; 
				stream.write(property.getBytes());
			} catch (FileNotFoundException fnfe) {
				log.log(Level.INFO, fnfe.getMessage()); 
			} finally {
				if (stream != null)
					stream.close();
			}
		}
	}
}
