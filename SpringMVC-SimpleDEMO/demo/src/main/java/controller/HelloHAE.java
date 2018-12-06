package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.logging.Logger;

public class HelloHAE implements Controller {
    private final Logger LOGGER = Logger.getLogger(HelloHAE.class.getName());

    public HelloHAE() {
        LOGGER.info("HelloHAE hae been created");
    }

    //@Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.info("ModelAndView Entrance...");
        /**
         * modelAndView对象封装了业务数据和前端显示的视图名称，即该业务数据最终会通过解析在代码设置的视图中显示
         * addObject方法为业务model添加属性
         * setViewName方法设置视图名称,此处配置的为逻辑视图名称success，配置成逻辑视图名称时，需要配置第四步所需要的视图解析器，若不想配置视图解析器，则此处可配置成
         　　　　   * 真实视图名称/success.jsp
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Message","My First SpringMVC Application");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @Override
    public String value() {
        LOGGER.info("ModelAndView Entrance...");
        /**
         * modelAndView对象封装了业务数据和前端显示的视图名称，即该业务数据最终会通过解析在代码设置的视图中显示
         * addObject方法为业务model添加属性
         * setViewName方法设置视图名称,此处配置的为逻辑视图名称success，配置成逻辑视图名称时，需要配置第四步所需要的视图解析器，若不想配置视图解析器，则此处可配置成
         　　　　   * 真实视图名称/success.jsp
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Message","My First SpringMVC Application");
        modelAndView.setViewName("success");
        return "success";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
