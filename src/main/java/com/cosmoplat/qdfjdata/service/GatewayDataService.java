package com.cosmoplat.qdfjdata.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cosmoplat.qdfjdata.controller.utils.ExecuteResult;
import com.cosmoplat.qdfjdata.controller.utils.HttpClientUtil;
import com.cosmoplat.qdfjdata.domain.RequestEquipment;
import com.cosmoplat.qdfjdata.domain.RequestEquipmentTag;
import com.cosmoplat.qdfjdata.domain.RequestQfjParam;
import com.cosmoplat.qdfjdata.domain.ResponseEquipmentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GatewayDataService{
    @Autowired
    private HttpClientUtil httpClientUtil;

    public ExecuteResult<String> getdata(){
        //声明设备
        RequestEquipmentTag tag =new RequestEquipmentTag();
        tag.setDevice_id("61a9c900000d_2");

        //声明点位
        RequestEquipment querie=new RequestEquipment();
        querie.setTags(tag);
        querie.setRate("false");
        querie.setAggregator("none");
        querie.setMetric("Dx7ad8my");

        //封装成查询对象
        List<RequestEquipment> list=new ArrayList<RequestEquipment>();
        list.add(querie);
        RequestQfjParam param=new RequestQfjParam();
        param.setStart("2d-ago");
        param.setEnd("now");
        param.setMsResolution(true);
        param.setQueries(list);


       // he.setField(new MinimalField("Content-Type","application/json"));
        ExecuteResult<String> res= httpClientUtil.post("http://edge.cosmoplat.com:8300/api/query",
                param
        );
        if (res.isSuccess()){
            List<ResponseEquipmentData> reslist=JSONArray.parseArray(res.getData(), ResponseEquipmentData.class);

            return res;
        }else{
            return res;
        }
    }

}
