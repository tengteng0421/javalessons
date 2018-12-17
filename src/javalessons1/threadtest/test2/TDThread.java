package javalessons1.threadtest.test2;

public class TDThread extends Thread {

	private String url;
	private String name;

	public TDThread(String url, String name) {
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadDownload t = new ThreadDownload();
		t.download(url, name);
		super.run();
	}

	public static void main(String[] args) {
		TDThread t1 = new TDThread(
				"http://img.zcool.cn/community/0117e2571b8b246ac72538120dd8a4.jpg@1280w_1l_2o_100sh.jpg",
				"image/tupian1.jpg");
		TDThread t2 = new TDThread("http://pic.58pic.com/58pic/15/57/84/70H58PICCJt_1024.jpg", "image/tupian2.jpg");
		t1.start();
		t2.start();
	}

}
