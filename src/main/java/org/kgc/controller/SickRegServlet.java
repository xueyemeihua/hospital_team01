package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:36
 */


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import org.kgc.config.AlipayConfig;
import org.kgc.pojo.Reginfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.RankinfoService;
import org.kgc.service.ReginfoService;
import org.kgc.service.SickerinfoService;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class SickRegServlet extends HttpServlet {
    //appid  从沙箱复制
    public static final String APP_ID = "2021000122615912";
    //应用私钥   从支付宝开发平台助手客户端中复制
    public static final String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCdFA+C8nzwEDnybDxm7Bb247gtdt8Z8tz8WkwwVBZ0Ue4IUl7Q2AS7FeOLljVIzHfr747lWGPJ1huOHLHX1gWwIpHMjbyf2OpE8PecSnMq2fehlNA6aWMHh4odih5NVEMiQpSbRKSXKe3xNsNCL2Fq8oGszlgSaBL/BUVfkXCsAFHddCclHhZVJ+xcQJJ913T9O3vJBXh7k+f67sLHXBy5U490no1Xwz4fRHzJBytS75hlJMLekSQoKgu0SDSIT7GTzNFlbpN9UR+7cLPPm/TcwtoR/1eirOYy9de1MO7AF4JrD2Uo8WkxA8dI4O9TJZEilBmECp9X6DBJuu4Nj3qLAgMBAAECggEBAJSWxHGfxzYkc1xyrNTDopmcIr7HQxa92fPRy16wPKl+U0iF+vFeV2NOunhx+CfMW+jRLYCgk4z7wAc397fv2mOa4Ab7USJ4xGvA8spi1v0DQbAVIMEQrkASJEH7RNzrx7Hh/8e9MGFapZ5Xqm+yeFn921NHwqJu1wFs0Aouf8ID899GQRs2e1mz76A+i4GSr2KyQNkEHuilzIdW5CEIxCWhMp7n7lVKs+P4zBQG2WEl6LwuvTdomEuIERAvT5VTW1CSe4joqed2angoOfi4BBggoUQ18A96Twp3xjS4BmhDoHp3DdXEoqrbQ071yB0gzgudOp7NyyRgHTMYBTWwQ+ECgYEAzogvyXsYzOoinUA+nuikjMO0vvi2XiKN8M0S2CmpgwhJvof++xSMeHjxLdNgN5gau8lbOYbZdc/LGxfthJIBvqmo8exh2Z78a8vdMuLi6wrOSPX0MD9XDNWVfn72kxuXKG6aSe5acPb3YubqhStioOCIKxSyrO/VzZju6mgnI9sCgYEAwrONZXEi3xHSNf1fBBqZ8XbzvgbRFl9DlD48ADAojg/G5hIDL+mcV2BYqwuPCYhqNYBCSjVKsRlVqKOWXJzFlykQcZ8yKvNcQ5cIDe4sGYpAA0mC2+GAoI3KMIkZZ7Ymb4ZJAwLIlhcheuhNhfiZr3h8rbk4ZhX7rP5ZgXTqGxECgYEAmyh+1hvPZuqi9IY2RUW7kTDZ0fqhbxkAj55RAOpTuef5FtWufkxSt5MMhYPeLgXsV5WPHimrpzFjgcg5HTZfbzCghpcyb75cHlO6qyb+mNu2W+PC/pgnOrIerDiP37aDmdF1wgL6GRHAiqG2IDOW1gu44Lyc+wT3F41EN//lH68CgYEAhLDJlHDeSxhiItlif/GBKMbgpokOxih2bflb+uTXProR24o7EdQr8ICA7VEbUmvdtkiK5Pgcx0V001FpkARnxPT/d+/+yLbCEm5D1vqSo3VM2vCmdiPg/YqkWR+WaNACsc7aw2qKOX/aGWFoM/2Q/70le1/Xx/sDYoqVhVygj4ECgYAl8jMBcvw62qAOkIt6Twjvg8W2BuRR7w8M3u/qhjjKhwMfG+UVc4XW10YZS2G4vou+Wr1shy9zpMmYovqjvODRbVXInprowSumu9nzcqjmI8kS2ApjSRPoLZyLKWhLC8Eq6DCeoI0eGdd09DI2113Dj+9nwT5dNULGR8yeXf9c1Q==";
    public static final String CHARSET = "UTF-8";
    // 支付宝公钥    沙箱网站配置完成后 复制过来
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnRQPgvJ88BA58mw8ZuwW9uO4LXbfGfLc/FpMMFQWdFHuCFJe0NgEuxXji5Y1SMx36++O5VhjydYbjhyx19YFsCKRzI28n9jqRPD3nEpzKtn3oZTQOmljB4eKHYoeTVRDIkKUm0Sklynt8TbDQi9havKBrM5YEmgS/wVFX5FwrABR3XQnJR4WVSfsXECSfdd0/Tt7yQV4e5Pn+u7Cx1wcuVOPdJ6NV8M+H0R8yQcrUu+YZSTC3pEkKCoLtEg0iE+xk8zRZW6TfVEfu3Czz5v03MLaEf9XoqzmMvXXtTDuwBeCaw9lKPFpMQPHSODvUyWRIpQZhAqfV+gwSbruDY96iwIDAQAB";
    //这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
    public static final String GATEWAY_URL ="https://openapi.alipaydev.com/gateway.do";
    public static final String FORMAT = "JSON";
    //签名方式
    public static final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址  如果是线上才可以生效
    public static final String NOTIFY_URL = "http://127.0.0.1/notifyUrl";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址    关键地址
    public static final String RETURN_URL = "http://localhost:8080/test1_war_exploded/payCallback";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String sickname = request.getParameter("sickname");
        String sickcard = request.getParameter("sickcard");
        String sickphone = request.getParameter("sickphone");
        String sickemail = request.getParameter("sickemail");
        Integer deptid = Integer.parseInt(request.getParameter("deptid"));
        Integer stafid = Integer.parseInt(request.getParameter("stafid"));
        String sickuname = request.getParameter("sickuname");
        String date = request.getParameter("date");
        //根据sickuname获取sickid
        SickerinfoService sickerinfoService = new SickerinfoService();
        int sickid = sickerinfoService.selectSickidBySickuname(sickuname);

        //病人信息添加成功,根据病人选择的医生查询这个医生的个人信息
        StafinfoService stafinfoService = new StafinfoService();
        Stafinfo stafinfo = stafinfoService.getStafinfoByStafid(stafid);
        //获取该医生的职称编号
        Integer rankid = stafinfo.getRankid();
        //根据职称编号查询挂号费
        RankinfoService rankinfoService = new RankinfoService();
        HashMap regfee_id = rankinfoService.getRegfeeidByRankid(rankid);
        //挂号费编号默认为1,即0元
        //挂号信息的修改涉及到两张表,所以添加挂号信息需要将其视为一个事务
        Integer regfeeid = 1;
        if (regfee_id!=null){
            regfeeid = (Integer) regfee_id.get("regfeeid");
        }
        Reginfo reginfo = new Reginfo(null, deptid, date, regfeeid, sickid,stafid, 1);
        ReginfoService reginfoService = new ReginfoService();
        int result = reginfoService.addReginfo(reginfo);
        String money="0";
        String regdesc="医生";
        if(regfeeid==2){
            money="10";
            regdesc="普通号";
        }else if(regfeeid==3){
            money="20";
            regdesc="专家号";
        }
        System.out.println("开始处理OrderServlet的服务");
        String title = "挂号单";
        String total = money;
        String message = regdesc;
        //生成订单号
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String orderSn = simpleDateFormat.format(Calendar.getInstance().getTime());
        //向支付宝发送请求
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
                AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = orderSn;
        //付款金额，必填
        String total_amount = total;
        //订单名称，必填
        String subject = title;
        //商品描述，可空
        String body = message;
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\""
                + total_amount + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //        + "\"total_amount\":\""+ total_amount +"\","
        //        + "\"subject\":\""+ subject +"\","
        //        + "\"body\":\""+ body +"\","
        //        + "\"timeout_express\":\"10m\","
        //        + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
        AlipayTradePagePayResponse alipayResponse = null;
        try {
            alipayResponse=alipayClient.pageExecute(alipayRequest);
            System.out.println(alipayResponse.getBody());
            System.out.println(alipayResponse.getMsg());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(alipayResponse.getBody());

    }
}

