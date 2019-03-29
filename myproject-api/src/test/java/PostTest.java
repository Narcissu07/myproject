import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pj on 2019/1/30.
 */
public class PostTest {
    private static final Logger logger = LoggerFactory.getLogger(PostTest.class);
    public static void main(String[] args) throws Exception {

        Map<String,Object> extSignMap = new HashMap<>();
        extSignMap.put("no","263554776819713");


        String signUrl ="http://localhost:8666/zqsign/getPdfUrl";

        String extSignJson = JSONObject.toJSONString(extSignMap);
        Request request = Request.Post(signUrl).bodyString(extSignJson, ContentType.APPLICATION_JSON);
        request.connectTimeout(10);
        Content content = request.execute().returnContent();
        String response = content.asString();

        logger.info("response："+response);


        // (1) Post请求
//        HttpPost post = new HttpPost(signUrl);
//
//        //添加参数
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("name", "ahopedog"));
//        params.add(new BasicNameValuePair("work", "程序员"));
//        post.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
//
//
//        // (3) 发送请求
//        HttpClient http = new DefaultHttpClient();
//        HttpResponse response = http.execute(post);


    }


}
