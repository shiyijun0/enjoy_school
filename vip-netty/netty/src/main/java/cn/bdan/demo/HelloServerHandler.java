package cn.bdan.demo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

/**
 * 输出接收到的消息
 * @author Coder
 * 该类主要是实现了接收客户端发来的消息，并输出到控制台
 *
 */
public class HelloServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * 收到数据时调用
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ByteBuf in = (ByteBuf)msg;
            System.out.print(in.toString(CharsetUtil.UTF_8));
        } finally {
            // 抛弃收到的数据
            ReferenceCountUtil.release(msg);
        }

//        ctx.write(msg);
//        ctx.flush();
    }

    /**
     * 当Netty由于IO错误或者处理器在处理事件时抛出异常时调用
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
