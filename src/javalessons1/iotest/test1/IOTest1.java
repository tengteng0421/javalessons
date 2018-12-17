package javalessons1.iotest.test1;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class IOTest1 {
	public static void main(String[] args) throws URISyntaxException {
		// String path = "D:" + File.separator + "abc.txt";
		// File f = new File(new URI("https://www.baidu.com"));
		// File f1 = new File(parent, child);
		// 获得当前工程的绝对路径
		System.out.println(System.getProperty("user.dir"));
		URI create = URI.create("http://www.baidu.com");
		System.out.println(create.getPath() + create);
		// isExists 存在的情况下 才可继续判断是否为文件或文件夹， 否则均为false
		// 操作系统的关键字名称， createnewfile无法成功

	}

	@Test
	public void searchAllFile() {
		String rootpath = "D:/";
		File root = new File(rootpath);
		File[] listFiles = root.listFiles();
		for (File file : listFiles) {
			System.out.println(file.getName());
			printNames(file, 1);
		}

	}

	public static void printNames(File file, int deep) {
		if (file.exists()) {
			File filetemp = null;
			try {
				if (file.isFile()) {
					System.out.println(createStr("-", deep) + file.getName());
				} else {
					System.out.println(createStr("-", deep) + file.getName());
					for (File f : file.listFiles()) {
						filetemp = f;
						printNames(f, deep + 1);
					}
				}
			} catch (Exception e) {
				if (filetemp == null) {
					System.out.println("filetemp is null");
				} else {
					System.out.println("file: " + file.getName());
				}
			}
		}
	}

	private static String createStr(String string, int deep) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < deep; i++) {
			sb.append(string);
		}
		return sb.toString();
	}
}
