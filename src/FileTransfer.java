
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.CRC32;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class FileTransfer{


	public static int getCRC(byte[] datas){
		CRC32 crc = new CRC32();
		crc.update(datas);
		return(int)crc.getValue();
	}
}
