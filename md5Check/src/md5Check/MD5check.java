package md5Check;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Date;
public class MD5check {

	public static void main(String[] args) throws NoSuchAlgorithmException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String target="C:\\Program Files\\Java\\jre1.8.0_191\\lib";
		String filePattern =  "*.{jar,class}";
		String target2="/tmp";

		DirectoryStream<Path> ds2 = Files.newDirectoryStream(Paths.get(target2,"*.txt"),getDateCheckFilter(FileTime.from(Instant.now())));
		for (Path file : ds2) {
			System.out.println(file.getFileName()+":");
		}
		
		DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(target,filePattern));
//		File dir = new File("C:\\Program Files\\Java\\jre1.8.0_191\\lib");
//		File[] fileList=dir.listFiles("*.txt");
		for (Path file : ds) {
//			if(file.isDirectory())
//				continue;
			System.out.print(file.getFileName()+":");
			for (byte b:md5(file))
			System.out.printf("%02X", b);
			System.out.println();
		}
	}

	static byte[] md5(Path f) throws NoSuchAlgorithmException, FileNotFoundException, IOException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		try (InputStream is = Files.newInputStream(f);
			     DigestInputStream dis = new DigestInputStream(is, md))
			{
			
			byte b[]=new byte[1024];
			while(dis.read(b) > 0);
			  /* Read decorated stream (dis) to EOF as normal... */
			}
			byte[] digest = md.digest();
			return digest;
	}

	private static InputStream Fileinputsream() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static DirectoryStream.Filter getDateCheckFilter(FileTime t) {
	DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
	    public boolean accept(Path file) throws IOException {
	        return (Files.getLastModifiedTime(file).compareTo(t) > 0);
	    }
	};
	return filter;
	}
}
