package com.abcd.apipayconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "alipay")
@Data
@Component
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public String APP_ID = "2021001164643474";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDHHOQKj/HXyuqk95zQSHSmI88KkFMTg/Z71d7SMIr6PmSC5OOhITGihxupf/4kq+DbA0aijcD96gi1+eC5fy1diGrDrChHfNx4T8sreL83/++1fVGRvWNtTOyrdH9NjYu77yeK3B8ofKoPGfXYgZA/lecQzSBX/e5Znv2yPWpkcMlDaVe3CpR1rVVgAp9tiHrEryQus7nu3XtcrW+aGFGFhEwKID0OoA6pzxwlC3eIgBY2Z/OqMmKkTc+Foe/vISC9qEjnl6qPfNtLPOEYIixsYzk3a5mGrq0o7qbdTFmgV9aCo8+LDUpd/Qxv5dvU0B7JpyaPzQ9xLLXMY8nCGwTVAgMBAAECggEAK/ftQ4fV19kvR46GSlg1qhpuNd74+W5Cl8X6ll+x0ODGQUFaItK5qzI6oYtqC58I4FQw3OSAoZF0qvqq7UtwMR9WtC7oFiE0bjzwmIDpeOxDeshZot03f4NlH9dx5SZEnROKn9dL6hzdUMhiyZSSzffENqmVYtjoMVIyo5F8VQFPOBNEVIaZKhNC4ul0n9FZC0mEAIc9RBg18ixtPyXeMXYUf5QXIjKOPOhTCWMdYOHexCwNgbeuiRh8YWx4IKRcn+iQDU5F4l4kY0E5FxVgzx9YHuF6+aQyRaC2dh7yFphtH4xjRjSbhWRymNxcC8lv6ydiucbTz481blopPFPYYQKBgQDklq/OcVuyZyozhS6b+oL1chx+1kP1l+fwIfZ60g46tHcqXxcURYTqF0D8lxpXypk929sMyh3PonCglThXF1KSfX5dVilkF4myKCQRVD/L4XIbYF5TxI5uQkthRZoPGRC0foqOTgDuOMiGlR9U7MmHpP/areJpbgMMa3HVctopkwKBgQDe/VgYoVU0H46mD9HB586ZDXfphPTUadNC34mKTJVi9p5clGINpSGlE8iR3jahKDFJvdgENVJpY2KI6J048nlFS4jgkVGiBGcVTOLRUQBhT+1zWKakPCBRaDZf71cCrrdJyDYS6tSSl9UkZgtbmavQYBoaMLZ45dDX+uuX7WB49wKBgFlMTI23Vv0QtDnAM38XlAVSeLNL/Ox6VU9H1UQRvyFL0qmo0BlJNy1DvE1wsgfNy6OQubf7VT4B1UHGSWYsZEN55t2LhUvmrhH9AGoMoYeCINN1CCRtSr7kAxKS4CY5wn7gWDxTWKW3ZQ6+Pqksf2YQHStOdn59TY+SgbvCzFslAoGBALNnUpRmYH2SEhuKyLDgBjjfPCV1oeCvz5eS7z6EhP/c+OX1P7pIq/v7Ibgx9vPLuXPhuEUSfV5q5mDN/YhOlMDql5JNeEcIkcLyW94Z9FtWiezuWwvxj/LPDEg88F0pIi/LU63+ns3eOE6ThvnIdhIs73M40+YKx+6sYxWVlrNbAoGAaVBcGS6c1JxhxQiiC2c2lwRKLAdofz3GnI9Kf+04fgoZRDb7VWOKs/3KIfatOMNhPZk3NLP+0MatqFECdTAPgmc90QGebSXSWc1zFSyVwGseX/qe01esnZ8iChUABoR/s2qZl90lap26CMOP7NdRHnWRsNh/qb1NC50HpmNY0zU=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtGZMzQACmixgkGiOhqkLk0SrlQ2FvxfIGKdgjQ0hqSBGaPA/nntrdZmWRSET8EWAfU0bxbWT3lAdhD0YVNy7n0Qa2bPo9vhIxIPQiPgqAnQ98JzzT4YufmNo59BUkBhy51LhZRsrZZ07/nHcS0hG4ekid6InDTN1XEy6dI0Nnu/7KNk5UYmnviovLE2PuvclRH+L+qyjchBNDQK6p6owcaz7V+BYKc75AzwPG+hf4c7KM4p7yJ/V5btnORMbBv7zbxMH1qm73VLnHp65FEKCi0JwqNfbP9hLyqAT6Dr3PWW+8TM8txR+tvwxAp95flUAccwVrS6ADjvh/5MusY5wAwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public String notify_url = "www.baidu.com";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public String return_url = "www.baidu.com";

    // 签名方式
    public String sign_type = "RSA2";

    public String format = "json";

    // 字符编码格式
    public String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public String gatewayUrl = "https://openapi.alipay.com/gateway.do";
}
