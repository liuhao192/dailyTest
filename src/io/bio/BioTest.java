package io.bio;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/22 16:45
 */
public class BioTest {
    public static void main(String[] args) throws IOException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ServerSocket serverSocket =new ServerSocket(5000);
        System.out.println("服务启动");
        while (true){
            final  Socket socket=serverSocket.accept();
            System.out.println("接受服务请求");
            System.out.println("线程id为"+Thread.currentThread().getId());
            //线程池
            newCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        handle(socket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

     //读取服务传
    public  static void  handle(Socket socket) throws IOException {
        try {
            byte[] bytes=new byte[1024];
            InputStream inputStream  = socket.getInputStream();
            System.out.println("目前线程id为"+Thread.currentThread().getId());
            while (true){
                System.out.println("读取线程id为"+Thread.currentThread().getId());
                int read= inputStream.read(bytes);
                if(read!=-1){
                    System.out.println(new java.lang.String(bytes,0,read));//输出客户端发送数据
                }
            }
        } catch (IOException e) {
            System.out.println("关闭和client的连接");
            e.printStackTrace();
        }finally {
            socket.close();
        }


    }


}
