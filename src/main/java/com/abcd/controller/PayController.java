package com.abcd.controller;

import com.abcd.apipayconfig.AlipayConfig;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")

public class PayController {

    @Autowired
    AlipayConfig alipayConfig;

    @GetMapping("/apipay")
//    订单号  订单的名称  付款金额  商品的描述   时间    商品码
    public String pay(String orderid, String ordername, String orderprice, String body, String timeout, String code) throws AlipayApiException {


//        1、客户端 封装Rsa签名方式
//        参数1，请求网关
//        参数2，收款人ID
//        参数3，支付宝私钥
//        参数4，返回的格式
//        参数5，字符编码格式
//        参数6，支付宝公钥
//        参数7，加密方式
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(),
                alipayConfig.getAPP_ID(), alipayConfig.getAPP_PRIVATE_KEY(),
                alipayConfig.getFormat(), alipayConfig.getCHARSET(), alipayConfig.getALIPAY_PUBLIC_KEY(),
                alipayConfig.getSign_type());

//        2、创建request请求
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();

//        3、封装传入参数
        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
        model.setOutTradeNo(orderid);  //商品Id
        model.setSubject(ordername);    //商品名称
        model.setTotalAmount(orderprice);//商品金额
        model.setBody(body);//商品描述
        model.setTimeoutExpress(timeout);//请求超时时间
        model.setProductCode(code);//商品码


        request.setBizModel(model);
//        设置异步回调地址
        request.setNotifyUrl(alipayConfig.getNotify_url());
//        设置同步回调地址
        request.setReturnUrl(alipayConfig.getReturn_url());

//        生成表单
        String form = alipayClient.pageExecute(request).getBody();
        System.out.println(form);
        return form;
    }

}
