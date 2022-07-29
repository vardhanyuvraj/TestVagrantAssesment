package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoclasses.RcbRoot;

public class TestUtils {

	public static String getJsonFilePath() throws IOException {
		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\YUVRAJ\\git\\TestVagrantAssesment\\Assesment\\src\\main\\java\\resources\\configurations.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty("jsonpath");
	}

	public static RcbRoot getRcbRootObject() throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		RcbRoot rcbRoot = objectMapper.readValue(new File(getJsonFilePath()), RcbRoot.class);
		return rcbRoot;

	}

}