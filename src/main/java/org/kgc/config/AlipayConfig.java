package org.kgc.config;

public class AlipayConfig {
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数
    public static String return_url = "http://localhost:8080/xylq/hospital_main.jsp";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify";
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000122615912";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnRQPgvJ88BA58mw8ZuwW9uO4LXbfGfLc/FpMMFQWdFHuCFJe0NgEuxXji5Y1SMx36++O5VhjydYbjhyx19YFsCKRzI28n9jqRPD3nEpzKtn3oZTQOmljB4eKHYoeTVRDIkKUm0Sklynt8TbDQi9havKBrM5YEmgS/wVFX5FwrABR3XQnJR4WVSfsXECSfdd0/Tt7yQV4e5Pn+u7Cx1wcuVOPdJ6NV8M+H0R8yQcrUu+YZSTC3pEkKCoLtEg0iE+xk8zRZW6TfVEfu3Czz5v03MLaEf9XoqzmMvXXtTDuwBeCaw9lKPFpMQPHSODvUyWRIpQZhAqfV+gwSbruDY96iwIDAQAB";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCdFA+C8nzwEDnybDxm7Bb247gtdt8Z8tz8WkwwVBZ0Ue4IUl7Q2AS7FeOLljVIzHfr747lWGPJ1huOHLHX1gWwIpHMjbyf2OpE8PecSnMq2fehlNA6aWMHh4odih5NVEMiQpSbRKSXKe3xNsNCL2Fq8oGszlgSaBL/BUVfkXCsAFHddCclHhZVJ+xcQJJ913T9O3vJBXh7k+f67sLHXBy5U490no1Xwz4fRHzJBytS75hlJMLekSQoKgu0SDSIT7GTzNFlbpN9UR+7cLPPm/TcwtoR/1eirOYy9de1MO7AF4JrD2Uo8WkxA8dI4O9TJZEilBmECp9X6DBJuu4Nj3qLAgMBAAECggEBAJSWxHGfxzYkc1xyrNTDopmcIr7HQxa92fPRy16wPKl+U0iF+vFeV2NOunhx+CfMW+jRLYCgk4z7wAc397fv2mOa4Ab7USJ4xGvA8spi1v0DQbAVIMEQrkASJEH7RNzrx7Hh/8e9MGFapZ5Xqm+yeFn921NHwqJu1wFs0Aouf8ID899GQRs2e1mz76A+i4GSr2KyQNkEHuilzIdW5CEIxCWhMp7n7lVKs+P4zBQG2WEl6LwuvTdomEuIERAvT5VTW1CSe4joqed2angoOfi4BBggoUQ18A96Twp3xjS4BmhDoHp3DdXEoqrbQ071yB0gzgudOp7NyyRgHTMYBTWwQ+ECgYEAzogvyXsYzOoinUA+nuikjMO0vvi2XiKN8M0S2CmpgwhJvof++xSMeHjxLdNgN5gau8lbOYbZdc/LGxfthJIBvqmo8exh2Z78a8vdMuLi6wrOSPX0MD9XDNWVfn72kxuXKG6aSe5acPb3YubqhStioOCIKxSyrO/VzZju6mgnI9sCgYEAwrONZXEi3xHSNf1fBBqZ8XbzvgbRFl9DlD48ADAojg/G5hIDL+mcV2BYqwuPCYhqNYBCSjVKsRlVqKOWXJzFlykQcZ8yKvNcQ5cIDe4sGYpAA0mC2+GAoI3KMIkZZ7Ymb4ZJAwLIlhcheuhNhfiZr3h8rbk4ZhX7rP5ZgXTqGxECgYEAmyh+1hvPZuqi9IY2RUW7kTDZ0fqhbxkAj55RAOpTuef5FtWufkxSt5MMhYPeLgXsV5WPHimrpzFjgcg5HTZfbzCghpcyb75cHlO6qyb+mNu2W+PC/pgnOrIerDiP37aDmdF1wgL6GRHAiqG2IDOW1gu44Lyc+wT3F41EN//lH68CgYEAhLDJlHDeSxhiItlif/GBKMbgpokOxih2bflb+uTXProR24o7EdQr8ICA7VEbUmvdtkiK5Pgcx0V001FpkARnxPT/d+/+yLbCEm5D1vqSo3VM2vCmdiPg/YqkWR+WaNACsc7aw2qKOX/aGWFoM/2Q/70le1/Xx/sDYoqVhVygj4ECgYAl8jMBcvw62qAOkIt6Twjvg8W2BuRR7w8M3u/qhjjKhwMfG+UVc4XW10YZS2G4vou+Wr1shy9zpMmYovqjvODRbVXInprowSumu9nzcqjmI8kS2ApjSRPoLZyLKWhLC8Eq6DCeoI0eGdd09DI2113Dj+9nwT5dNULGR8yeXf9c1Q==";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
