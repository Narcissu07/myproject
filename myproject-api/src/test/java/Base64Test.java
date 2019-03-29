import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by pj on 2019/1/30.
 */
public class Base64Test  {
    private static final Logger logger = LoggerFactory.getLogger(Base64Test.class);
    public static void main(String[] args) throws IOException {
        String filePath = "d:/log/compactTemplate.pdf";
        Path path1 = Paths.get(filePath);
        byte[] b = Files.readAllBytes(path1);
        String fileData = java.util.Base64.getEncoder().encodeToString(b);
        logger.info("fileData.length："+fileData.length());
    }


}
