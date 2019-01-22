package cn.enjoyedu.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

/**
 * @program: vip-netty
 * @description: 这么一小段代码就实现了我们前面NIO编程中的所有的功能，
 * 包括服务端启动，接受新连接，打印客户端传来的数据
 * @author: shiyijun
 * @create: 2019-01-21 20:27
 **/
public class NettyServer {
    public static void main(String[] args) {
        ServerBootstrap serverBootstrap=new ServerBootstrap();
        NioEventLoopGroup boos=new NioEventLoopGroup();//boos对应，IOServer.java中的接受新连接线程，主要负责创建新连接
        NioEventLoopGroup worker=new NioEventLoopGroup();//worker对应 IOClient.java中的负责读取数据的线程，主要用于读取数据以及业务逻辑处理
        serverBootstrap.group(boos,worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                    nioSocketChannel.pipeline().addLast(new StringDecoder());
                    nioSocketChannel.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
                        @Override
                        protected void channelRead0(ChannelHandlerContext channelHandlerContext, String o) throws Exception {
                            System.out.println("*******"+o);
                        }
                    });
                    }
                }).bind(8000);

    }
}
