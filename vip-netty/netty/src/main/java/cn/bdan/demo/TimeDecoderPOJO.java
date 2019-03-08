package cn.bdan.demo;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class TimeDecoderPOJO extends ByteToMessageDecoder {
    /**
     * 有新数据接收时调用
     * 为防止分包现象，先将数据存入内部缓存，到达满足条件之后再进行解码
     */
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if(in.readableBytes() < 4) {
            return;
        }

        // out添加对象则表示解码成功
        out.add(new Time(in.readUnsignedInt()));
    }
}
