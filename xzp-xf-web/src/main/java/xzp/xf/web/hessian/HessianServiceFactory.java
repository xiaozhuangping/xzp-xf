package xzp.xf.web.hessian;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Created by zhanghj on 2017/01/10.
 */
@Configuration
public class HessianServiceFactory {

    /**
     * hessian连接路径
     */
    private @Value("${izzhr-sys-hessian-path}") String hessianPath;

    /**
     * 作者 ：xiaozhuangping
     * 时间 ：2017/2/12 17:46
     * 用途 ：预收款远程接口
     */
   /* @Bean
    public HessianProxyFactoryBean rmAgtAdvancesReceivedService(){
        HessianProxyFactoryBean hessianProxyFactoryBean = new HessianProxyFactoryBean();
        hessianProxyFactoryBean.setConnectTimeout(10000); //连接超时10秒
        hessianProxyFactoryBean.setReadTimeout(20000);    //请求超时20秒
        hessianProxyFactoryBean.setServiceUrl(hessianPath + "rmAgtAdvancesReceivedService"); //接口实现路径
        hessianProxyFactoryBean.setServiceInterface(com.izzhr.sys.remote.service.RmAgtAdvancesReceivedService.class); //接口类
        return hessianProxyFactoryBean;
    }*/
}
