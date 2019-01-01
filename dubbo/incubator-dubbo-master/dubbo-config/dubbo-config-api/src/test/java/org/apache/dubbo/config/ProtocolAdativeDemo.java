package org.apache.dubbo.config;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;

/**
 * Created by Peter on 11/9 009.
 */
public class ProtocolAdativeDemo {

    public void destroy() {
        throw new UnsupportedOperationException("method public abstract void com.alibaba.dubbo.rpc.Protocol.destroy() of interface com.alibaba.dubbo.rpc.Protocol is not adaptive method!");
    }

    public int getDefaultPort() {
        throw new UnsupportedOperationException("method public abstract int com.alibaba.dubbo.rpc.Protocol.getDefaultPort() of interface com.alibaba.dubbo.rpc.Protocol is not adaptive method!");
    }

    public Exporter export(Invoker arg0) throws RpcException {
        if (arg0 == null) throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument == null");

        if (arg0.getUrl() == null)
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument getUrl() == null");

        URL url = arg0.getUrl();

        //默认选择dubbo协议，否则根据url中带的协议属性来选择对应的协议处理对象，这样可以动态选择不同的协议
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());

        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.rpc.Protocol) name from url(" + url.toString() + ") use keys([protocol])");

        //根据拿到的协议key从缓存的map中取协议对象
        Protocol extension = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(extName);

        return extension.export(arg0);
    }

    public Invoker refer(Class arg0, URL arg1) throws RpcException {

        if (arg1 == null) throw new IllegalArgumentException("url == null");

        URL url = arg1;

        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());

        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.rpc.Protocol) name from url(" + url.toString() + ") use keys([protocol])");

        //根据拿到的协议key从缓存的map中取协议对象
        Protocol extension = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(extName);

        return extension.refer(arg0, arg1);
    }
}
