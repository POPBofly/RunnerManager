package com.xyf.mapper;

import java.util.List;
import java.util.Map;

import com.xyf.pojo.User;

public interface UserMapper  extends IMapper<User> {

	 //�ɸ���ע��ʱ�䡢���������䡢�ֻ��Ƚ���ģ����ѯ
    public List<User> search(Map<String, Object> params);
	

}
