package com.xyf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ����ģ�� ������˵���� ���߽���
 * 
 * @author Ray
 *
 */
@Controller
@RequestMapping("/author")
public class AuthorController {

	/**
	 * ��ת������ҳ��
	 * 
	 * @return
	 */
	@RequestMapping(value = "about.do")
	public ModelAndView about() {
		return new ModelAndView("author/about");
	}

	/**
	 * ��ת���ĵ�ҳ��
	 * 
	 * @return
	 */
	@RequestMapping(value = "document.do")
	public ModelAndView document() {
		return new ModelAndView("author/document");
	}

}
