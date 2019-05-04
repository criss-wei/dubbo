package com.wei.dubbo.server.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wei.dubbo.core.common.WeiDubboConstants;
import com.wei.dubbo.core.common.WeiReqMsg;
import com.wei.dubbo.core.common.WeiResMsg;
import com.wei.dubbo.core.model.Main;
import com.wei.dubbo.core.service.MainService;
import com.wei.dubbo.server.mapper.MainMapper;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	private MainMapper mainMapper;

	@Override
	public WeiResMsg getMainList(WeiReqMsg reqMsg) {
		WeiResMsg resMsg=new WeiResMsg();
		List<Main> selectAllList = mainMapper.selectAllList();
		resMsg.put("mainList", selectAllList);
		resMsg.setResMsg(WeiDubboConstants.RES_SUCCESS, "查询成功");
		return resMsg;
	}

}
